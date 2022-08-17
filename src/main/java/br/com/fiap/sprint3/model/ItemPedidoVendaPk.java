package br.com.fiap.sprint3.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class ItemPedidoVendaPk implements Serializable{
  
	
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private long id;
  private long pedidoVenda;

  
  public ItemPedidoVendaPk() {
  }

  
  public ItemPedidoVendaPk(long id, long pedidoVenda) {
    this.id = id;
    this.pedidoVenda = pedidoVenda;
  }


  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (int) (id ^ (id >>> 32));
    result = prime * result + (int) (pedidoVenda ^ (pedidoVenda >>> 32));
    return result;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    ItemPedidoVendaPk other = (ItemPedidoVendaPk) obj;
    if (id != other.id)
      return false;
    if (pedidoVenda != other.pedidoVenda)
      return false;
    return true;
  }
  public long getId_item() {
    return id;
  }
  public void setId_item(long id) {
    this.id = id;
  }
  public long getPedidoVenda() {
    return pedidoVenda;
  }
  public void setPedidoVenda(long pedidoVenda) {
    this.pedidoVenda = pedidoVenda;
  }
  
}
