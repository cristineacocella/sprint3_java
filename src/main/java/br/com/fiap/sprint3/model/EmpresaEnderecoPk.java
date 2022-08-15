package br.com.fiap.sprint3.model;

import java.io.Serializable;

public class EmpresaEnderecoPk implements Serializable{
  
  private int empresa;
  private int endereco;
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + empresa;
    result = prime * result + endereco;
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
    EmpresaEnderecoPk other = (EmpresaEnderecoPk) obj;
    if (empresa != other.empresa)
      return false;
    if (endereco != other.endereco)
      return false;
    return true;
  }

 



}
