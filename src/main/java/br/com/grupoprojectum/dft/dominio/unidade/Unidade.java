package br.com.grupoprojectum.dft.dominio.unidade;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.Filters;
import org.hibernate.annotations.ParamDef;

import br.com.grupoprojectum.dft.converter.TipoUnidadeEnumConverter;
import br.com.grupoprojectum.dft.dominio.categoriaservico.CategoriaServico;
import br.com.grupoprojectum.dft.dominio.orgao.Orgao;
import br.com.grupoprojectum.dft.enums.TipoUnidadeEnum;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Classe que modela a tabela de órgão.
 */
@Entity
@Table(name = "tb_unidade")
// --- Lombok
@Getter @Setter
@ToString
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
// --- Hibernate
@FilterDef(name = "FilterUnidade", parameters = {@ParamDef(name = "idsUnidade", type = "integer")})
@Filters({@Filter(name = "FilterUnidade", condition = "id_unidade in (:idsUnidade)")})
public class Unidade {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_unidade", nullable = false)
  private Integer id;

  @Column(name = "ds_unidade")
  private String descricao;

  @Column(name = "sg_unidade")
  private String sigla;

  @Convert(converter = TipoUnidadeEnumConverter.class)
  @Column(name = "tp_unidade")
  private TipoUnidadeEnum tipo;

  @ToString.Exclude
  @ManyToOne(fetch = FetchType.LAZY, optional = true)
  @JoinColumn(name = "id_unidade_superior", nullable = true)
  private Unidade unidadeSuperior;

  @Column(name = "cod_referencia", nullable = true)
  private String codigoReferencia;

  @Column(name = "in_ativo")
  private boolean ativo;

  @Transient
  private Orgao orgao;

  @ToString.Exclude
  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "tb_unidade_categoria_servico",
      joinColumns = {@JoinColumn(name = "id_unidade")},
      inverseJoinColumns = {@JoinColumn(name = "id_categoria_servico")})
  private List<CategoriaServico> categoriaServicos = new ArrayList<>(0);

  public Unidade(int id) {
    this.id = id;
  }

  public Unidade(int id, String nomeUnidade, String siglaUnidade, TipoUnidadeEnum tipo,
      Unidade unidadeSuperior, List<CategoriaServico> categoriaServicos) {
    this.id = id;
    this.descricao = nomeUnidade;
    this.sigla = siglaUnidade;
    this.tipo = tipo;
    this.unidadeSuperior = unidadeSuperior;
    this.categoriaServicos = new ArrayList<>(categoriaServicos);
  }

  public Unidade(String sigla, String nome, String codigo) {
    this.sigla = sigla;
    this.descricao = nome;
    this.codigoReferencia = codigo;
  }
}
