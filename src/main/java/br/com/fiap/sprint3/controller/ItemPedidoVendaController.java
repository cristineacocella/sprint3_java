package br.com.fiap.sprint3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.sprint3.model.Empresa;
import br.com.fiap.sprint3.model.ItemPedidoVenda;
import br.com.fiap.sprint3.model.PedidoVenda;
import br.com.fiap.sprint3.model.Produto;
import br.com.fiap.sprint3.model.Usuario;
import br.com.fiap.sprint3.service.EmpresaService;
import br.com.fiap.sprint3.service.ItemPedidoVendaService;
import br.com.fiap.sprint3.service.ProdutoService;
import br.com.fiap.sprint3.service.UsuarioService;

@RestController
public class ItemPedidoVendaController {
  
  @Autowired
  private ItemPedidoVendaService service;

  @Autowired
  private UsuarioService serviceUsuario;

  @Autowired
  private EmpresaService serviceEmpresa;

  @Autowired
  private ProdutoService serviceProduto;


  @GetMapping("/api/itempedidovenda")
  public ResponseEntity<List<ItemPedidoVenda>> index(){
    return ResponseEntity.status(HttpStatus.OK).body(service.index());
  }

  @PostMapping("/api/pedidovenda/{idUsuario}/{idEmpresa}/{listaIdProdutos}/{quantidade}")
  public ResponseEntity<PedidoVenda> compra(@PathVariable Long idUsuario, Long idEmpresa, List<Long> listaIdProdutos, int quantidade) {
    Usuario usuario = serviceUsuario.findById(idUsuario);
    Empresa empresa = serviceEmpresa.findById(idEmpresa);
    List<Produto> produtos = serviceProduto.findById(listaIdProdutos);
    return ResponseEntity.status(HttpStatus.OK).body(service.compra(usuario, empresa, produtos, quantidade));
  }

}
