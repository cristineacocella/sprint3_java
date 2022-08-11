package br.com.fiap.sprint3.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
  @Enumerated(value = EnumType.STRING)
  private Situation situation;
  
  public Product() {
  }

  public Product(long id, String name, String description, BigDecimal price, Situation situation) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.price = price;
    this.situation = situation;
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

  public Situation getSituation() {
    return situation;
  }

  public void setSituation(Situation situation) {
    this.situation = situation;
  }

  
  
}
