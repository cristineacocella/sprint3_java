package br.com.fiap.sprint3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.sprint3.repository.ItemPedidoVendaRepository;


@Service
public class ItemPedidoVenda {
 
  @Autowired
  ItemPedidoVendaRepository repo;
  
}
