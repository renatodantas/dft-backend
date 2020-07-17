package br.com.grupoprojectum.dft.enums;

/**
 * Enum com os parâmetros de sistema cadastrados na tabela.
 */
public enum ParametroEnum {

  // @formatter:off
  PARAMETRO_SIGLA_SISTEMA("sigla.sistema"),
  PARAMETRO_NOME_SISTEMA("nome.sistema"),
  PARAMETRO_CHAVE_SISTEMA("chave.sistema"),
  PARAMETRO_PAGINA_PADRAO("pagina.padrao"),
  PARAMETRO_VINCULO("vinculo"),
  PARAMETRO_PESSOA_AUTORIZADA("pessoa.autorizada"),
  PARAMETRO_URL_SERVICO_INTEGRACAO("url.servico.integracao"),
  PARAMETRO_DFT_URL("dft.url"),
  PARAMETRO_IDP_URL("idp.url"),
  PARAMETRO_IDP_CLIENT_ID("idp.client.id"),
  PARAMETRO_IDP_CLIENT_SECRET("idp.client.secret"),
  PARAMETRO_TIPO_AUTENTICADOR("tipo.autenticador");
  // @formatter:on

  private String nome;

  private ParametroEnum(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

}
