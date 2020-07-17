package br.com.grupoprojectum.dft.enums;

/**
 * 
 * Copyright claudio.costa
 *
 *
 */
public interface IBaseMensagem {

  /**
   * Retorna a sigla do módulo.
   * 
   * @return
   */
  String getModulo();

  /**
   * Retorna o código negocial do erro.
   * 
   * @return
   */
  int getCodigo();

  /**
   * Retorna a mensagem negocial do erro.
   * 
   * @return
   */
  String getMensagem();

  /**
   * Retorna o código negocial da mensagem junto com a sigla do módulo.
   * 
   * @return Exemplo de retorno:
   * 
   *         -Módulo ARQ e Mensagem 1234: (ARQ-1234) -Módulo PJE e Mensagem 54: (PJE-54)
   */
  default String getCodigoCompleto() {
    return getModulo() + '-' + String.format("%03d", getCodigo());
  }
}
