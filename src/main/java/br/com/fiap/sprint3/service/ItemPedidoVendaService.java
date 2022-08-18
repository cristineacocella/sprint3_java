package br.com.fiap.sprint3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.fiap.sprint3.model.ItemPedidoVenda;

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

}
