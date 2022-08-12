package br.com.fiap.sprint3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.sprint3.service.PedidoVendaService;

@RestController
public class PedidoVendaController {
  
  @Autowired
  private PedidoVendaService service;
}
