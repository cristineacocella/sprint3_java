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
  private int inventory;


  public Product() {
  }

  public Product(long id, String name, String description, BigDecimal price, int quantity) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.price = price;
    this.inventory = quantity;
  }



  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public int getQuantity() {
    return inventory;
  }

  public void setQuantity(int quantity) {
    this.inventory = quantity;
  }

}
