package br.com.grupoprojectum.dft.dominio.categoriaservico;

import java.util.Optional;

import br.com.grupoprojectum.dft.exception.NaoEncontradoException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.grupoprojectum.dft.enums.TipoMetodologiaEnum;

/**
 * Classe responsável pelas invocações da API de categorias de serviço.
 */
@RestController
@RequestMapping("/api/categorias-servico")
//@Api("/categorias-servico")
class CategoriaServicoApi {

    private final CategoriaServicoService service;

    public CategoriaServicoApi(CategoriaServicoService service) {
        this.service = service;
    }

    @GetMapping
//  @ApiOperation(value = "Lista as categorias de serviço cadastradas.", responseContainer = "List")
    public Page<CategoriaServicoDto> listar(
            @RequestParam(required = false) TipoMetodologiaEnum tipoMetodologia,
            @RequestParam(name = "filtrar", required = false) String filtro,
            @PageableDefault(sort = "descricao") Pageable pageable) {
        return service.listar(pageable, tipoMetodologia, filtro);
    }
    
    @GetMapping("/{id}")
//  @ApiOperation(value = "Lista as categorias de serviço cadastradas.", responseContainer = "List")
    public Optional<CategoriaServicoDto> listarPorId(@PathVariable Integer id) {
        return service.listar(id);
    }
    
    @PostMapping
    public void criar(@RequestBody CategoriaServicoDto categoria) {
        service.salvar(categoria);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable Integer id, @RequestBody CategoriaServicoDto categoria) {
        if (service.listar(id).isEmpty()) {
            throw new NaoEncontradoException("ID inexistente");
        }

        categoria.setId(id);
        service.salvar(categoria);
    }
    
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Integer id) {
        service.excluir(id);
    }
}
