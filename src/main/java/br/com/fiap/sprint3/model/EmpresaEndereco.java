package br.com.fiap.sprint3.model;

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
@IdClass(EmpresaEnderecoPk.class)
@Table(name="T_CALI_EMPRESA_ENDERECO")
public class EmpresaEndereco {

  @Id
  @ManyToOne
  @JoinColumn(name="id_empresa")
  private Empresa empresa;

  @Id
  @ManyToOne
  @JoinColumn(name="id_endereco")
  private Endereco endereco;

  public EmpresaEndereco() {
  }

  public Empresa getEmpresa() {
    return empresa;
  }

  public void setEmpresa(Empresa empresa) {
    this.empresa = empresa;
  }

  public Endereco getEndereco() {
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  
}
