package br.com.grupoprojectum.dft.enums;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoMetodologiaEnum {

  TIPICA('T'),
  ATIPICA('A'),
  NAO_ENCONTRADO('N'),
  OUTRA('O');

  private final Character codigo;

  public static TipoMetodologiaEnum criar(Character tipoUnidade) {
    return Arrays.stream(TipoMetodologiaEnum.values())
        .filter(p -> p.getCodigo().equals(tipoUnidade)).findFirst()
        .orElse(TipoMetodologiaEnum.NAO_ENCONTRADO);
  }
}
