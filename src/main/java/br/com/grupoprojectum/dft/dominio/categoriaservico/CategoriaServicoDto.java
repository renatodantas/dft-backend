package br.com.grupoprojectum.dft.dominio.categoriaservico;

import br.com.grupoprojectum.dft.enums.TipoMetodologiaEnum;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CategoriaServicoDto {

  private Integer id;
  private String descricao;
  private TipoMetodologiaEnum tipo;

}
