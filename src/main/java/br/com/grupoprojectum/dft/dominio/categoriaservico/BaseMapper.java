package br.com.grupoprojectum.dft.dominio.categoriaservico;

import java.util.Collection;
import java.util.List;

public interface BaseMapper<E, T> {

  E converterParaEntidade(T dto);

  T converterParaDto(E entidade);

  List<E> converterParaEntidades(Collection<T> dtos);

  List<T> converterParaDtos(Collection<E> entidades);
}
