package br.com.fiap.sprint3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.sprint3.model.Empresa;
import br.com.fiap.sprint3.model.PedidoVenda;
import br.com.fiap.sprint3.model.Produto;
import br.com.fiap.sprint3.model.Usuario;
import br.com.fiap.sprint3.service.EmpresaService;
import br.com.fiap.sprint3.service.PedidoVendaService;
import br.com.fiap.sprint3.service.ProdutoService;
import br.com.fiap.sprint3.service.UsuarioService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
public class PedidoVendaController {
  
  @Autowired
  private PedidoVendaService service;

  @Autowired
  private UsuarioService serviceUsuario;

  @Autowired
  private EmpresaService serviceEmpresa;

  @Autowired
  private ProdutoService serviceProduto;

  @GetMapping("/api/pedidovenda")
  public ResponseEntity<List<PedidoVenda>> index() {
      return ResponseEntity.status(HttpStatus.OK).body(service.index());
  }
  
  @PostMapping("/api/pedidovenda/{idUsuario}/{idEmpresa}/{idProduto}/{quantidade}")
	public ResponseEntity<PedidoVenda> compra(@PathVariable Long idUsuario, @PathVariable Long idEmpresa,
			@PathVariable Long idProduto, @PathVariable int quantidade) {
		Usuario usuario = serviceUsuario.findById(idUsuario);
		Empresa empresa = serviceEmpresa.findById(idEmpresa);
		Produto produto = serviceProduto.findById(idProduto);
    PedidoVenda pedidoVenda = service.compra(usuario, empresa, produto, quantidade);
    System.out.println(pedidoVenda);
		return ResponseEntity.status(HttpStatus.OK).body(pedidoVenda);
	}
 
}
