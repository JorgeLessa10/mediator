import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 ** created by: jorge.lessa
 */
class ClienteTest {

    Jogo jogo;
    Cliente cliente;

    @BeforeEach
    void setUp()
    {
        jogo = new Jogo("FIFA 22");
        cliente = new Cliente();
    }

    @Test
    void deveAvaliarJogabilidadeDoJogo()
    {
        Double nota = 8.8;
        assertEquals("Obrigado, sua avaliação de jogabilidade foi recebida e registrada \nJogabilidade do jogo FIFA 22: 8.8", cliente.avaliarJogabilidade(jogo, nota));
    }

    @Test
    void deveAvaliarInovacaoDoJogo()
    {
        Double nota = 6.3;
        assertEquals("Obrigado, sua avaliação de inovação foi recebida e registrada \nInovação do jogo FIFA 22: 6.3", cliente.avaliarInovacao(jogo, nota));
    }

    @Test
    void deveAvaliarGraficosDoJogo()
    {
        Double nota = 9.1;
        assertEquals("Obrigado, sua avaliação dos graficos foi recebida e registrada \nGraficos do jogo FIFA 22: 9.1", cliente.avaliarGraficos(jogo, nota));
    }

    @Test
    void deveAvaliarAtendimentoDoFuncionario()
    {
        String avaliacao = "Atendimento excelente";
        assertEquals("Agradecemos sua mensagem: Atendimento excelente\nEstamos sempre o melhor atendimento", cliente.avaliarAtendimento(avaliacao));
    }

}