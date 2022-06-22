/*
 ** created by: jorge.lessa
 */
public class Cliente {

    public Cliente() {
    }

    public String avaliarJogabilidade(Jogo jogo, Double nota)
    {
        return Avaliacao.getInstancia().receberAvaliacaoDeJogabilidade(jogo, nota);
    }

    public String avaliarInovacao(Jogo jogo, Double nota)
    {
        return Avaliacao.getInstancia().receberAvaliacaoDeInovacao(jogo, nota);
    }

    public String avaliarGraficos(Jogo jogo, Double nota)
    {
        return Avaliacao.getInstancia().receberAvaliacaoDeGraficos(jogo, nota);
    }

    public String avaliarAtendimento(String mensagem)
    {
        return Avaliacao.getInstancia().receberAvaliacaoDeAtendimento(mensagem);
    }

}
