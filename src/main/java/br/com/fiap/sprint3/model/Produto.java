package br.com.fiap.sprint3.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_CALI_PRODUTO")
public class Produto {
  
  @Id 
  @Column(name="id_produto")
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private long id;

  @Column(name="nr_sku")
  private long nrSku;

  @Column(name="nm_produto")
  private String nome;

  @Column(name="vl_preco_unitario")
  private BigDecimal precoUnitario;

  @Column(name="qt_produto_estoque")
  private int quantidade;

  @Column(name="ds_produto")
  private String descricao;

  @Column(name="nm_marca")
  private String nomeMarca;


  public Produto() {
  }


  public long getId() {
    return id;
  }


  public void setId(long id) {
    this.id = id;
  }


  public long getNrSku() {
    return nrSku;
  }


  public void setNrSku(long nrSku) {
    this.nrSku = nrSku;
  }


  public String getNome() {
    return nome;
  }


  public void setNome(String nome) {
    this.nome = nome;
  }


  public BigDecimal getPrecoUnitario() {
    return precoUnitario;
  }


  public void setPrecoUnitario(BigDecimal precoUnitario) {
    this.precoUnitario = precoUnitario;
  }


  public int getQuantidade() {
    return quantidade;
  }


  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }


  public String getDescricao() {
    return descricao;
  }


  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }


  public String getNomeMarca() {
    return nomeMarca;
  }


  public void setNomeMarca(String nomeMarca) {
    this.nomeMarca = nomeMarca;
  }

  

}
