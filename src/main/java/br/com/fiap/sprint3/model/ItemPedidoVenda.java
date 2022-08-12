package br.com.fiap.sprint3.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ItemPedidoVenda {
  
  @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
  private long id;
  private int quantidadePedida;
  private BigDecimal valorUnitarioVenda;
  
  public ItemPedidoVenda() {
  }

}
