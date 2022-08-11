package br.com.fiap.sprint3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.sprint3.model.Product;
import br.com.fiap.sprint3.service.ProductService;

@RestController
public class ProductController {
  
  @Autowired
  private ProductService service;

  @GetMapping("/api/product")
  public List<Product> index(){
    return service.listAll();
  }

  @GetMapping("/api/product/{id}")
    public ResponseEntity<Product> show(@PathVariable Long id){
      Product Product = service.get(id);
      return ResponseEntity.status(HttpStatus.OK).body(Product);
    }
}
