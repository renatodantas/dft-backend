package br.com.grupoprojectum.dft.util;

import java.text.Normalizer;

/**
 * Classe utilitária de manipulação de Strings.
 */
public final class StringUtil {

    /**
     * Verifica se o texto fornecido está nulo ou vazio.
     * @param texto a ser verificado
     * @return <code>true</code> se for <code>null</code> ou <code>""</code>
     */
    public static boolean isVazio(String texto) {
        return texto == null || texto.isBlank();
    }

    /**
     * Remove os acentos de um texto.
     *
     * @param texto a ter os acentos removidos
     * @return o texto sem acentos
     */
    public static String removerAcentos(String texto) {
        if (isVazio(texto)) {
            return "";
        }
        return Normalizer
                .normalize(texto, Normalizer.Form.NFD)
                .replaceAll("[^\\p{ASCII}]", "");
    }
}
