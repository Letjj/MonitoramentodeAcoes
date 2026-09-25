package padroescomportamentais.observer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvestidorTest {

    @Test
    void deveNotificarUmInvestidor() {
        Acao acao = new Acao("PETR4", "Petrobras", 30.50);
        Investidor investidor = new Investidor("Investidor 1");

        investidor.assinarAlerta(acao);
        acao.atualizarPreco(32.00);

        String esperado = "Investidor 1, preço atualizado na Acao{simbolo='PETR4', nomeEmpresa='Petrobras', preco=32.0}";
        assertEquals(esperado, investidor.getNotificacao());
    }
}
