package br.com.fiap.sprint3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.sprint3.model.PedidoVenda;
import br.com.fiap.sprint3.service.PedidoVendaService;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class PedidoVendaController {
  
  @Autowired
  private PedidoVendaService service;

  @GetMapping("/api/pedidovenda")
  public ResponseEntity<List<PedidoVenda>> index() {
      return ResponseEntity.status(HttpStatus.OK).body(service.index());
  }
  

}
