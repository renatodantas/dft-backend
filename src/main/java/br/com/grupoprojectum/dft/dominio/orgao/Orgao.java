package br.com.grupoprojectum.dft.dominio.orgao;

import java.util.ArrayList;
import java.util.Collection;

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
import javax.persistence.Table;

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.Filters;
import org.hibernate.annotations.ParamDef;

import br.com.grupoprojectum.dft.converter.TipoUnidadeEnumConverter;
import br.com.grupoprojectum.dft.dominio.categoriaservico.CategoriaServico;
import br.com.grupoprojectum.dft.dominio.unidade.Unidade;
import br.com.grupoprojectum.dft.enums.TipoUnidadeEnum;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Classe que modela a tabela de órgão.
 */
@Entity
@Table(name = "tb_unidade")
@Getter @Setter
@ToString(exclude = "categoriaServicos")
@EqualsAndHashCode(of = "id")
@FilterDef(name = "FilterOrgao", parameters = {@ParamDef(name = "idOrgao", type = "integer")})
@Filters({@Filter(name = "FilterOrgao", condition = "id_unidade  = :idOrgao")})
public class Orgao {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_unidade", nullable = false)
  private Integer id;

  @Column(name = "ds_unidade")
  private String descricao;

  @Column(name = "sg_unidade")
  private String sigla;

  @Column(name = "cod_referencia", nullable = true)
  private String codigoReferencia;

  @Convert(converter = TipoUnidadeEnumConverter.class)
  @Column(name = "tp_unidade")
  private TipoUnidadeEnum tipo;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "tb_unidade_categoria_servico",
      joinColumns = {@JoinColumn(name = "id_unidade")},
      inverseJoinColumns = {@JoinColumn(name = "id_categoria_servico")})
  private Collection<CategoriaServico> categoriaServicos = new ArrayList<>();

  @Column(name = "in_ativo")
  private boolean ativo;

  public Orgao(int id) {
    this.id = id;
  }

  public Orgao(Unidade unidade) {
    this.id = unidade.getId();
    this.descricao = unidade.getDescricao();
    this.sigla = unidade.getSigla();
    this.tipo = unidade.getTipo();
    this.categoriaServicos = unidade.getCategoriaServicos();
  }

}
