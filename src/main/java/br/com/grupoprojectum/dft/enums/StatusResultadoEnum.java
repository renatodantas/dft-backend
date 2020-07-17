package br.com.grupoprojectum.dft.enums;

import java.util.Arrays;

public enum StatusResultadoEnum {

  SEM_RESULTADO('S'), CONCLUIDO('C');

  private final Character codigo;

  StatusResultadoEnum(Character codigo) {
    this.codigo = codigo;
  }

  public Character getCodigo() {
    return codigo;
  }

  public static StatusResultadoEnum criar(Character statusEntrega) {
    return Arrays.stream(StatusResultadoEnum.values())
        .filter(p -> p.getCodigo().equals(statusEntrega)).findFirst()
        .orElse(StatusResultadoEnum.SEM_RESULTADO);
  }

}
