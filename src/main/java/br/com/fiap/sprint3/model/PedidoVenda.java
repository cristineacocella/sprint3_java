package br.com.fiap.sprint3.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_CALI_PEDIDO_VENDA")
public class PedidoVenda {
  
  @Column(name = "id_pedido_venda")
  @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
  private long id;

  @Column(name = "dt_pedido_venda")
  private LocalDate dataPedidoVenda;

  @Column(name = "vl_total_pedido_venda")
  private BigDecimal valorTotalPedidoVenda;

  
  public PedidoVenda() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public LocalDate getDataPedidoVenda() {
    return dataPedidoVenda;
  }

  public void setDataPedidoVenda(LocalDate dataPedidoVenda) {
    this.dataPedidoVenda = dataPedidoVenda;
  }

  public BigDecimal getValorTotalPedidoVenda() {
    return valorTotalPedidoVenda;
  }

  public void setValorTotalPedidoVenda(BigDecimal valorTotalPedidoVenda) {
    this.valorTotalPedidoVenda = valorTotalPedidoVenda;
  }

  
}
