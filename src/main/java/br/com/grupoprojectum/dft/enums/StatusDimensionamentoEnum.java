package br.com.grupoprojectum.dft.enums;

import java.util.Arrays;

/**
 * 
 * @author @Projectum
 *
 */
public enum StatusDimensionamentoEnum {

  ANALISADO('N', "Analisado"),
  DEVOLVIDO_AJUSTES('R', "Devolvido para Ajustes"),
  DIMENSIONADO('D', "Dimensionado"),
  EM_ANALISE('A', "Em análise"),
  EM_ELABORACAO('E', "Em elaboração"),
  INICIAL('I', "Inicial");

  private final Character codigo;
  private final String descricaoStatus;

  StatusDimensionamentoEnum(Character codigo, String descricaoStatus) {
    this.codigo = codigo;
    this.descricaoStatus = descricaoStatus;
  }

  public Character getCodigo() {
    return codigo;
  }

  public static StatusDimensionamentoEnum criar(Character statusDimensionamento) {
    return Arrays.stream(StatusDimensionamentoEnum.values())
        .filter(p -> p.getCodigo().equals(statusDimensionamento)).findFirst()
        .orElse(StatusDimensionamentoEnum.EM_ELABORACAO);
  }

  public String getDescricaoStatus() {
    return descricaoStatus;
  }

}
