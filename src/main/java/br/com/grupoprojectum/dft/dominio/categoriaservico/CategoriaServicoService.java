package br.com.grupoprojectum.dft.dominio.categoriaservico;

import java.text.Normalizer;
import java.util.Optional;

import br.com.grupoprojectum.dft.util.StringUtil;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.grupoprojectum.dft.enums.TipoMetodologiaEnum;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CategoriaServicoService {

    private final CategoriaServicoRepository categoriaServicoRepositorio;
    private final CategoriaServicoMapper mapper;

    public CategoriaServicoService(CategoriaServicoRepository categoriaServicoRepositorio, CategoriaServicoMapper mapper) {
        this.categoriaServicoRepositorio = categoriaServicoRepositorio;
        this.mapper = mapper;
    }

    /**
     * Realiza a busca de categorias de serviço por um tipo específico.
     * 
     * @param pageable        informações de paginação
     * @param tipoMetodologia o tipo de metodologia que deseja filtrar (opcional)
     * @param filtro          o valor para filtrar os registros
     * @return as {@link CategoriaServico}s cadastradas
     */
    public Page<CategoriaServicoDto> listar(Pageable pageable, TipoMetodologiaEnum tipoMetodologia, String filtro) {
        if (tipoMetodologia != null) {
            return categoriaServicoRepositorio.findAllByTipo(tipoMetodologia, pageable).map(mapper::converterParaDto);
        }

        String filtroTratado = "%" + StringUtil.removerAcentos(filtro) + "%";
        return categoriaServicoRepositorio.findAllByFiltro(filtroTratado, pageable).map(mapper::converterParaDto);
    }

    public Optional<CategoriaServicoDto> listar(int id) {
        return categoriaServicoRepositorio.findById(id).map(mapper::converterParaDto);
    }

    public void salvar(CategoriaServicoDto categoria) {
        CategoriaServico entity = mapper.converterParaEntidade(categoria);
        if (categoria.getId() != null) {
            CategoriaServicoDto dto = listar(categoria.getId()).orElseThrow(() -> new RuntimeException("Categoria não encontrada"));
            entity = mapper.converterParaEntidade(dto);
        }
        
        entity.setDescricao(categoria.getDescricao());
        entity.setTipo(categoria.getTipo());
        categoriaServicoRepositorio.save(entity);
    }

    public void excluir(Integer id) {
        CategoriaServico categoria = categoriaServicoRepositorio
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Categoria inexistente"));
        try {
            categoriaServicoRepositorio.delete(categoria);
        } catch (Exception e) {
            if (e.getCause() instanceof ConstraintViolationException) {
                throw new RuntimeException("Categoria em uso e não pode ser excluída");
            }
            throw e;
        }
    }
}
