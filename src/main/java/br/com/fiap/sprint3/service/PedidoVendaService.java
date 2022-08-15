package br.com.fiap.sprint3.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.fiap.sprint3.model.PedidoVenda;

import br.com.fiap.sprint3.repository.PedidoVendaRepository;


@Service
public class PedidoVendaService {
 
  @Autowired
  PedidoVendaRepository repo;
  

  public List<PedidoVenda> index(){
    return repo.findAll();
  }


  
}
