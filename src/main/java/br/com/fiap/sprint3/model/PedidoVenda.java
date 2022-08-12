package br.com.fiap.sprint3.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PedidoVenda {
  
  @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
  private long id;
  private LocalDate dataPedidoVenda;
  private BigDecimal valorTotalPedidoVenda;
}
