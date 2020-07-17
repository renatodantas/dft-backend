package br.com.grupoprojectum.dft.dominio.categoriaservico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.grupoprojectum.dft.enums.TipoMetodologiaEnum;

@Repository
interface CategoriaServicoRepository extends PagingAndSortingRepository<CategoriaServico, Integer> {

    /**
     * Busca {@link CategoriaServico} de acordo com o tipo de metodologia informado.
     * 
     * @param tipo de metodologia filtrado
     * @return lista de {@link CategoriaServico} encontrados
     */
    Page<CategoriaServico> findAllByTipo(TipoMetodologiaEnum tipo, Pageable pageable);

    /**
     * Busca {@link CategoriaServico} de acordo com o filtro fornecido.
     *
     * @param filtro
     * @param pageable
     * @return lista de {@link CategoriaServico} encontrados
     */
    @Query("FROM CategoriaServico cs WHERE UPPER(UNACCENT(cs.descricao)) LIKE UPPER(:filtro)")
    Page<CategoriaServico> findAllByFiltro(String filtro, Pageable pageable);
}
