package br.com.grupoprojectum.dft.enums;

/**
 * 
 * Copyright claudio.costa
 *
 *
 */
public enum MensagensExceptionEnum implements IBaseMensagem {

  ERRO_DESCONHECIDO("Ocorreu um erro desconhecido no processamento da requisição."),
  PARAMETRO_NAO_ENCONTRADO("Parâmetro não encontrado: {0}."),
  ERRO_ORDENACAO_INVALIDA("É necessário configurar a ordenação para a consulta paginada."),
  ERRO_CARREGAR_RECURSO("Erro ao carregar recurso {0}."),
  ERRO_RECURSO_NAO_ENCONTRADO("Recurso não encontrado."),
  TOKEN_AUTENTICACAO_INVALIDO("Token de autenticação inválido ou inexistente."),
  PARAMETRO_OBRIGATORIO("Parâmetro ''{0}'' é obrigatório."),
  INDENTIFICADOR_INVALIDO("Identificador inválido para {0}."),
  ERRO_COMUNICACAO_SERVICO_REST_INDISPONIVEL(
      "Serviço requisitado está indisponível, verifique as configurações de ambiente. "),
  CONSULTA_RETORNA_MULTIPLOS_REGISTROS(
      "Consulta está retornando múltiplos registros, o esperado é somente um registro."),
  PARAMETRO_URL_API_COMUNICACAO(
      "O endereço da API deve ser informado para realizar a comunicação."),
  CREDENCIAIS_AUTENTICACAO_BASIC_INVALIDAS("As credenciais de autenticação BASIC são inválidas."),
  ENTIDADE_NAO_ENCONTRADA("Informação não encontrada no banco de dados."),
  ERRO_VALIDAR_TOKEN("Erro ao validar token de segurança: {0}"),
  PERFIL_NAO_CONDIZ_COM_USUARIO("Perfil não condiz com usuário logado."),
  ERRO_ATUALIZAR_ACCESS_TOKEN("Falha ao atualizar access token."),
  USUARIO_SEM_PERFIL("Usuário sem perfil."),
  DIMENSIONAMENTO_STATUS_INCORRETO("Dimensionamento no status incorreto"),
  ERRO_EXCLUIR_ENTREGA_COM_ESFORCO(
      "Existem esforços vinculados a esta entrega. Exclua-os primeiro."),
  ERRO_EXCLUIR_UNIDADE(
      "Não é possível excluir a Unidade que é superior de outras unidades. É necessário retirar o vínculo."),
  ERRO_EXCLUIR_ORGAO("Não foi possível excluir. Órgão em uso pelo sistema."),
  ERRO_EXCLUIR_ORGAO_COM_UNIDADES_VINCULADAS("Não é possível excluir o Órgão que possui unidades vinculadas."),
  ERRO_EXCLUIR_PROCESSO("Não foi possível excluir. Processo em uso pelo sistema."),
  ERRO_DATA_DIMENSIONAMENTO_ANOS(
      "Um período de dimensionamento deve pertencer ao mesmo ano. Ex: Janeiro 2019 a Dezembro de 2019."),
  ERRO_DATA_DIMENSIONAMENTO_PERIODO(
      "A data de início está ocorrendo após a data de fim do dimensionamento."),
  USUARIO_NAO_ENCONTRADO("Usuário não encontrado"),
  ERRO_PESSOAS_SEM_CARGA_HORARIA("Existem pessoas sem carga horária no Dimensionamento."),
  ERRO_PERMISSAO_EXCLUIR_EDITAR_DIMENSIONAMENTO(
      "Você não tem permissão para excluir ou editar este dimensionamento."),
  ERRO_EXCLUIR_PERFIL_ATUAL("Não é possível excluir o próprio perfil em uso."),
  ERRO_ALTERAR_PROPRIO_ORGAO("Não é possível alterar o seu próprio órgão."),
  ERRO_INSERIR_INDICADOR_DIMENSIONAMENTO("Não é possível inserir o indicador no dimensionamento"),
  ERRO_PERMISSAO_VER_DIMENSIONAMENTOS(
      "Você não tem permissão de visualizar esses dimensionamentos"),
  ERRO_PERMISSAO_VER_ESFORCOS("Você não tem permissão de visualizar esses esforcos"),
  ERRO_INSERIR_INDICADOR_DUPLICADO_CALCULO_DIMENSIONAMENTO(
      "Não é possível calcular o dimensionamento com um indicador ITP já utilizado."),
  ENTIDADE_JA_CADASTRADA("Não é possível gravar informações duplicadas no sistema."),
  ERRO_NO_CADASTRO_ENTIDADE("Erro ao cadastrar informações."),
  ERRO_NA_EXCLUSAO_ENTIDADE("Erro ao excluir informações: {0}"),
  ERRO_DATA_NASCIMENTO("A data de nascimento não pode ser após a data atual"),
  ERRO_EXCLUSAO_DIMENSIONAMENTO(
      "A exclusão de Dimensionamentos só é permitida nas situações: (Em Elaboração ou Devolvido para Ajustes)"),
  ERRO_DIMENSIONAMENTO_JA_DIMENSIONADO("Dimensionamento já se encontra no status: DIMENSIONADO"),
  ERRO_PESSOA_CPF_JA_CADASTRADO("Pessoa informada já possui um CPF cadastrado no Órgão."),
  INTEGRACAO_SISTEMAS_NAO_IMPLEMENTADO("Integração com o Órgão não foi implementada."),
  ERRO_CONSOLIDACAO_DATAS_DIFERENTES(
      "Os dimensionamentos devem pertencer ao mesmo período para serem consolidados."),
  ERRO_DIMENSIONAMENTOS_NAO_DIMENSIONADOS(
      "Os dimensionamentos devem ter status DIMENSIONADO para serem consolidados."),
  ERRO_PESSOA_SEM_DATA_DE_NASCIMENTO("Existe(m) pessoa(s) sem data de nascimento cadastrada"),
  ERRO_EXCLUIR_PRODUTIVIDADE_COM_RESULTADO(
      "Já existe(m) resultados cadastrados para esse indicador de produtividade no dimensionamento."),
  ERRO_DE_CONEXAO_INTEGRACAO(
      "Ocorreu um erro de conexão com o servidor, ou o item não foi encontrado. Contate o administrador do Sistema."),
  DADO_INEXISTENTE_INTEGRACAO("O dado não foi encontrado no serviço de integração."),
  NAO_PODE_INCLUIR_PERFIL_DE_OUTRO_ORGAO("Não é possível cadastrar perfil para outro órgão"),
  ERRO_ARQUIVO_INEXISTENTE("Erro ao carregar arquivo não encontrado."),
  ERRO_CARREGAMENTO_ARQUIVO("Ocorreu erros ao carregar um arquivo interno do sistema."),
  ERRO_UNIDADE_SUPERIOR_JA_VINCULADA("A unidade superior selecionada já está subordinada a Unidade que está sendo alterada."),
  ERRO_UNIDADE_ATIVA_JA_CADASTRADA("Não é possível cadastrar uma nova unidade com dados já existentes."),
  QUANTIFICACAO_DE_ESFORCO_NAO_PERMITIDA_NESTA_FASE("Não é possível quantificar esforço nesta fase do dimensionamento."),
  ERRO_INTEGRACAO_NAO_CONFIGURADA("Integração solicitada não configurada."),
  ERRO_COMUNICACAO_API("Ocorreu erros na comunicação com a API {0}"),
  PARAMETRO_URL_INTEGRACAO_NAO_DEFINIDO("O parâmetro de URL do serviço de integração não foi definido."),
  ERRO_INFORMACAO_NAO_ENCONTRADA_INTEGRACAO("Informações solicitadas não foram encontradas na integração com o Órgão."),
  ERRO_MOVIMENTAR_DIMENSIONAMENTO_PELO_GESTOR_UNIDADE("Não é possível realizar a movimentação do dimensionamento para o status {0}. "
      + "Deve ser realizado por outro usuário que não seja o criador do dimensionamento."),
  ERRO_PERMISSAO_CALCULO_DIMENSIONAMENTO("Apenas usuários com o perfi (Gestor Geral) podem realizar cálculos dos Dimensionamentos."),
  ;

  private final String mensagem;

  MensagensExceptionEnum(String mensagem) {
    this.mensagem = mensagem;
  }

  @Override
  public String getModulo() {
    return "DIMENSIONAMENTO";
  }

  @Override
  public String getMensagem() {
    return this.mensagem;
  }

  /**
   * @see IBaseMensagem#getCodigo()
   */
  @Override
  public int getCodigo() {
    return this.ordinal() + 1;
  }
}
