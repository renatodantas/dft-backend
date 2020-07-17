package br.com.grupoprojectum.dft.dominio.categoriaservico;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.grupoprojectum.dft.converter.TipoMetodologiaEnumConverter;
import br.com.grupoprojectum.dft.enums.TipoMetodologiaEnum;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_categoria_servico")
@NoArgsConstructor
@Getter @Setter
@EqualsAndHashCode(of = "id")
public class CategoriaServico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_categoria_servico", nullable = false)
	private Integer id;

	@Column(name = "ds_categoria_servico")
	private String descricao;

	@Convert(converter = TipoMetodologiaEnumConverter.class)
	@Column(name = "tp_metodologia")
	private TipoMetodologiaEnum tipo;

	public CategoriaServico(Integer id, String descricao, TipoMetodologiaEnum tipo) {
		this.id = id;
		this.descricao = descricao;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return descricao;
	}
}
