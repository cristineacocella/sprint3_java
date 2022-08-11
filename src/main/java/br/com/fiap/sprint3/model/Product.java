package br.com.fiap.sprint3.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
  
  @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
  private long id;
  private String name;
  private String description;
  private BigDecimal price;
  
  public Product() {
  }

  public Product(long id, String name, String description, BigDecimal price) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.price = price;
  }

  
}
