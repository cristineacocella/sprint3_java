package br.com.fiap.sprint3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.sprint3.service.ProdutoService;

@RestController
public class ItemPedidoVendaController {
  
  @Autowired
  private ProdutoService service;
}
