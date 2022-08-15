package br.com.fiap.sprint3.model;

import java.io.Serializable;

public class UsuarioEnderecoPk implements Serializable{

  private int usuario;
  private int endereco;

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + endereco;
    result = prime * result + usuario;
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
    UsuarioEnderecoPk other = (UsuarioEnderecoPk) obj;
    if (endereco != other.endereco)
      return false;
    if (usuario != other.usuario)
      return false;
    return true;
  }

}
