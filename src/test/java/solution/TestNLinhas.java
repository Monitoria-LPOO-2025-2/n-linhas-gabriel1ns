package solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class TestNLinhas {

    private NLinhas gerador;

    @BeforeEach
    void setUp() {
        // Cria um novo objeto antes de cada teste.
        gerador = new NLinhas();
    }

    @DisplayName("Testa multiplos valores de N")
    @ParameterizedTest(name = "Para n = {0}")
    @CsvSource({
            "0, ''",
            "1, '1'",
            "2, '1\n22'",
            "4, '1\n22\n333\n4444'",
            "5, '1\n22\n333\n4444\n55555'",
            "-5, ''"
    })
    void testaGeracaoDePadraoParaMultiplosValores(int n, String saidaEsperada) {

        assertEquals(saidaEsperada, gerador.gerarLinhas(n));
    }
}