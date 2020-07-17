package br.com.grupoprojectum.dft.enums;

import java.util.Arrays;

public enum TipoUnidadeEnum {

  ORGAO('O'), UNIDADE('U'), NAO_ENCONTRADO('N');

  private final Character codigo;

  TipoUnidadeEnum(Character codigo) {
    this.codigo = codigo;
  }

  public Character getCodigo() {
    return codigo;
  }

  public static TipoUnidadeEnum criar(Character tipoUnidade) {
    return Arrays.stream(TipoUnidadeEnum.values()).filter(p -> p.getCodigo().equals(tipoUnidade))
        .findFirst().orElse(TipoUnidadeEnum.NAO_ENCONTRADO);
  }

}
