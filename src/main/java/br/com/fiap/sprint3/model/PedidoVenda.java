package br.com.fiap.sprint3.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_CALI_PEDIDO_VENDA")
public class PedidoVenda {
  
  @Id 
  @Column(name = "id_pedido_venda")
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private long id;

  @ManyToOne
  @JoinColumn(name="id_empresa")
  private Empresa empresa;

  @ManyToOne
  @JoinColumn(name="id_usuario")
  private Usuario usuario;


  @Column(name = "dt_pedido_venda")
  private LocalDate dataPedidoVenda;
  

  @Column(name = "vl_total_pedido_venda")
  private BigDecimal valorTotalPedidoVenda;

  
  public PedidoVenda() {
  }

  

  public PedidoVenda(Empresa empresa, Usuario usuario, LocalDate dataPedidoVenda, BigDecimal valorTotalPedidoVenda) {
    this.empresa = empresa;
    this.usuario = usuario;
    this.dataPedidoVenda = dataPedidoVenda;
    this.valorTotalPedidoVenda = valorTotalPedidoVenda;
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

  public Empresa getEmpresa() {
    return empresa;
  }

  public void setEmpresa(Empresa empresa) {
    this.empresa = empresa;
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }
}
