package br.com.fiap.sprint3.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@IdClass(ItemPedidoVendaPk.class)
@Table(name= "T_CALI_ITEM_PEDIDO_VENDA")
public class ItemPedidoVenda {
  
  @Id 
  @Column(name="id_item")
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private long id;

  @Id
  @ManyToOne
  @JoinColumn(name="id_pedido_venda")
  private PedidoVenda pedidoVenda;

  @ManyToOne
  @JoinColumn(name="id_produto")
  private Produto produto;

  @Column(name="qt_pedida")
  private int quantidadePedida;
  
  @Column(name="vl_desconto_item_venda")
  private BigDecimal valorDescontoItemVenda;

  @Column(name="vl_unitario_venda")
  private BigDecimal valorUnitarioVenda;
  
  @Column(name="vl_total_item_venda")
  private BigDecimal valorTotalItemVenda;

  public ItemPedidoVenda() {
  }

  public ItemPedidoVenda(PedidoVenda pedidoVenda, Produto produto, int quantidadePedida, BigDecimal valorUnitarioVenda,
      BigDecimal valorTotalItemVenda) {
    this.pedidoVenda = pedidoVenda;
    this.produto = produto;
    this.quantidadePedida = quantidadePedida;
    this.valorUnitarioVenda = valorUnitarioVenda;
    this.valorTotalItemVenda = valorTotalItemVenda;
  }



  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public PedidoVenda getPedidoVenda() {
    return pedidoVenda;
  }

  public void setPedidoVenda(PedidoVenda pedidoVenda) {
    this.pedidoVenda = pedidoVenda;
  }

  public Produto getProduto() {
    return produto;
  }

  public void setProduto(Produto produto) {
    this.produto = produto;
  }

  public int getQuantidadePedida() {
    return quantidadePedida;
  }

  public void setQuantidadePedida(int quantidadePedida) {
    this.quantidadePedida = quantidadePedida;
  }

  public BigDecimal getValorDescontoItemVenda() {
    return valorDescontoItemVenda;
  }

  public void setValorDescontoItemVenda(BigDecimal valorDescontoItemVenda) {
    this.valorDescontoItemVenda = valorDescontoItemVenda;
  }

  public BigDecimal getValorUnitarioVenda() {
    return valorUnitarioVenda;
  }

  public void setValorUnitarioVenda(BigDecimal valorUnitarioVenda) {
    this.valorUnitarioVenda = valorUnitarioVenda;
  }

  public BigDecimal getValorTotalItemVenda() {
    return valorTotalItemVenda;
  }

  public void setValorTotalItemVenda(BigDecimal valorTotalItemVenda) {
    this.valorTotalItemVenda = valorTotalItemVenda;
  }




}
