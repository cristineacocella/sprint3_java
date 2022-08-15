package br.com.fiap.sprint3.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.sprint3.model.Empresa;
import br.com.fiap.sprint3.model.ItemPedidoVenda;
import br.com.fiap.sprint3.model.PedidoVenda;
import br.com.fiap.sprint3.model.Produto;
import br.com.fiap.sprint3.model.Usuario;
import br.com.fiap.sprint3.repository.ItemPedidoVendaRepository;

@Service
public class ItemPedidoVendaService{

  @Autowired
  ItemPedidoVendaRepository repo;


  public List<ItemPedidoVenda> index(){
    return repo.findAll();
  }

  public PedidoVenda compra(Usuario usuario, Empresa empresa, List<Produto> produtos, int quantidade) {
    long idUsuario = usuario.getId();
    long idEmpresa = empresa.getId();
    
    PedidoVenda pedidoVenda = new PedidoVenda(empresa, usuario, LocalDate.now(), null);

    
  
    for (Produto produto : produtos) {
      BigDecimal valorTotalItem = valorTotal(quantidade, produto.getPrecoUnitario());
      ItemPedidoVenda itemPedidoVenda = new ItemPedidoVenda(pedidoVenda, produto, quantidade, produto.getPrecoUnitario(), valorTotalItem);
    }
    
    return null;
  }


  public BigDecimal valorTotal(int quantidade, BigDecimal valorUnitario){
    BigDecimal quantidadeBigDecimal = new BigDecimal(quantidade);
    return valorUnitario.multiply(quantidadeBigDecimal);
  }
}
