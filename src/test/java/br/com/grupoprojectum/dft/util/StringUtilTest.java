package br.com.grupoprojectum.dft.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {

    @Test
    public void testRemoverAcentos_OK() {
        String textoComAcento = "Téstândõ";
        String textoSemAcento = "Testando";
        Assertions.assertEquals(
                textoSemAcento,
                StringUtil.removerAcentos(textoComAcento),
                "O texto deveria sair sem acentos");
    }
}
