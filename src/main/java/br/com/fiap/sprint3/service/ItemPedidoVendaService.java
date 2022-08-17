package br.com.fiap.sprint3.service;

import java.math.BigDecimal;
import java.time.Instant;
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
import br.com.fiap.sprint3.repository.PedidoVendaRepository;

@Service
public class ItemPedidoVendaService {

	@Autowired
	ItemPedidoVendaRepository repo;

	@Autowired
	PedidoVendaRepository pedidoVendaRepository;

	public List<ItemPedidoVenda> index() {
		return repo.findAll();
	}

	public PedidoVenda compra(Usuario usuario, Empresa empresa, Produto produto, int quantidade) {

		PedidoVenda pedidoVenda = new PedidoVenda(empresa, usuario, Instant.now(), valorTotal(quantidade, produto.getPrecoUnitario()));
		pedidoVendaRepository.save(pedidoVenda);

		return pedidoVenda;
	}

	public BigDecimal valorTotal(int quantidade, BigDecimal valorUnitario) {
		BigDecimal quantidadeBigDecimal = new BigDecimal(quantidade);
		return valorUnitario.multiply(quantidadeBigDecimal);
	}
}
