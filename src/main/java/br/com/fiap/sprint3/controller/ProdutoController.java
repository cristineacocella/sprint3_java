package br.com.fiap.sprint3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.sprint3.model.Produto;
import br.com.fiap.sprint3.service.ProdutoService;

@RestController
public class ProdutoController {
  
  @Autowired
  private ProdutoService service;

  @GetMapping("/api/product")
  public ResponseEntity<List<Produto>> index(){
    return ResponseEntity.status(HttpStatus.OK).body(service.listAll());
  }

  @GetMapping("/api/product/{id}")
    public ResponseEntity<Produto> show(@PathVariable Long id){
      Produto Product = service.get(id);
      return ResponseEntity.status(HttpStatus.OK).body(Product);
    }
}
