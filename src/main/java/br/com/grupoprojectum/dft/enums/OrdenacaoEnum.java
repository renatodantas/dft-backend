package br.com.grupoprojectum.dft.enums;

public enum OrdenacaoEnum {

  DESC("desc"), ASC("asc");

  private final String ordem;

  OrdenacaoEnum(String ordem) {
    this.ordem = ordem;
  }

  public String getOrdem() {
    return ordem;
  }


}
