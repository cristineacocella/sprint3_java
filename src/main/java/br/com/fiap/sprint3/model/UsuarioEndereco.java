package br.com.fiap.sprint3.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@IdClass(UsuarioEnderecoPk.class)
@Table(name="T_CALI_USUARIO_ENDERECO")
public class UsuarioEndereco {
  
  @Id
  @ManyToOne
  @JoinColumn(name="id_usuario")
  private Usuario usuario;

  @Id
  @ManyToOne
  @JoinColumn(name="id_endereco")
  private Endereco endereco;
  

  public UsuarioEndereco() {
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }

  public Endereco getEnderco() {
    return endereco;
  }

  public void setEnderco(Endereco enderco) {
    this.endereco = enderco;
  }

  
}
