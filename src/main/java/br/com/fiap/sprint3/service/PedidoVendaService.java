package br.com.fiap.sprint3.service;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import br.com.fiap.sprint3.model.ItemPedidoVenda;
import br.com.fiap.sprint3.model.PedidoVenda;

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

  public PedidoVenda compra(Usuario usuario, ItemPedidoVenda itemPedidoVenda) {

		PedidoVenda pedidoVenda = new PedidoVenda(itemPedidoVenda.getProduto().getEmpresa(), usuario, Instant.now(), 
    valorTotal(itemPedidoVenda.getQuantidadePedida(), itemPedidoVenda.getProduto().getPrecoUnitario()));
    repo.save(pedidoVenda);

    itemPedidoVenda.setPedidoVenda(pedidoVenda);
    repositoryItem.save(itemPedidoVenda);

    // List<ItemPedidoVenda> listaItemPedidoVenda = new ArrayList<ItemPedidoVenda>();
    // listaItemPedidoVenda.add(itemPedidoVenda);
    // pedidoVenda.setItemPedidoVendas(listaItemPedidoVenda);
    // pedidoVenda.adicionar(itemPedidoVenda);
    // System.out.println(pedidoVenda);
    
		return pedidoVenda;
	}

	public BigDecimal valorTotal(int quantidade, BigDecimal valorUnitario) {
		BigDecimal quantidadeBigDecimal = new BigDecimal(quantidade);
		return valorUnitario.multiply(quantidadeBigDecimal);
	}
  
}
