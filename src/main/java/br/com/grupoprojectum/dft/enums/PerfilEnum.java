package br.com.grupoprojectum.dft.enums;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum PerfilEnum {

    GESTOR_GERAL(1),
    GESTOR_DE_ORGAO(2),
    GESTOR_DE_UNIDADE(3),
    USUARIO(4),
    NAO_ENCONTRADO(0);

    @Getter
    private final int codigo;

    public static PerfilEnum criar(int codigo) {
        return Arrays.stream(PerfilEnum.values()).filter(p -> p.getCodigo() == codigo).findFirst()
                .orElse(PerfilEnum.NAO_ENCONTRADO);
    }

    /**
     * Retorna uma instância de {@link Perfil}.
     * 
     * @return
     */
//    public Perfil toPerfil() {
//        return new Perfil(getCodigo());
//    }

}
