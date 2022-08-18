package br.com.fiap.sprint3.service;


import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import br.com.fiap.sprint3.model.Empresa;
import br.com.fiap.sprint3.model.ItemPedidoVenda;
import br.com.fiap.sprint3.model.PedidoVenda;
import br.com.fiap.sprint3.model.Produto;
import br.com.fiap.sprint3.model.Usuario;
import br.com.fiap.sprint3.repository.ItemPedidoVendaRepository;
import br.com.fiap.sprint3.repository.PedidoVendaRepository;


@Service
public class PedidoVendaService {
 
  @Autowired
  PedidoVendaRepository repo;
  
  @Autowired
  ItemPedidoVendaRepository repositoryItem;

  public List<PedidoVenda> index(){
    return repo.findAll();
  }

  public PedidoVenda compra(Usuario usuario, Empresa empresa, Produto produto, int quantidade) {
		
		PedidoVenda pedidoVenda = new PedidoVenda(empresa, usuario, Instant.now(), produto.getPrecoUnitario());

     repo.save(pedidoVenda);
     
    ItemPedidoVenda itemPedidoVenda = new ItemPedidoVenda(pedidoVenda, produto, quantidade, 
    produto.getPrecoUnitario(), valorTotal(quantidade, produto.getPrecoUnitario()));

    repositoryItem.save(itemPedidoVenda);

    List<ItemPedidoVenda> listaItemPedidoVenda = new ArrayList<ItemPedidoVenda>();
    listaItemPedidoVenda.add(itemPedidoVenda);

    
    // pedidoVenda.setListaItemProdutoVenda(listaItemPedidoVenda);
    // System.out.println(listaItemPedidoVenda.toString());
    pedidoVenda.adicionarItemNoCarrinho(itemPedidoVenda);
    repo.save(pedidoVenda);
   
    System.out.println(pedidoVenda.getId() + "AQUIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII"); 

		return pedidoVenda;
	}

	public BigDecimal valorTotal(int quantidade, BigDecimal valorUnitario) {
		BigDecimal quantidadeBigDecimal = new BigDecimal(quantidade);
		return valorUnitario.multiply(quantidadeBigDecimal);
	}
  
}
