package br.com.fiap.sprint3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_CALI_ENDERECO")
public class Endereco {
  
  @Id
  @Column(name="id_endereco")
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private long id;

  @Column(name="nr_endereco")
  private int numeroEndereco;

  @Column(name="nm_referencia")
  private String referencia;

  @Column(name="ds_complemento")
  private String complemento;

  public Endereco() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int getNumeroEndereco() {
    return numeroEndereco;
  }

  public void setNumeroEndereco(int numeroEndereco) {
    this.numeroEndereco = numeroEndereco;
  }

  public String getReferencia() {
    return referencia;
  }

  public void setReferencia(String referencia) {
    this.referencia = referencia;
  }

  public String getComplemento() {
    return complemento;
  }

  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  
}
