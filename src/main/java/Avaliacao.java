/*
 ** created by: jorge.lessa
 */
public class Avaliacao {

    private static Avaliacao instancia = new Avaliacao();

    public Avaliacao() {
    }

    public static Avaliacao getInstancia()
    {
        return instancia;
    }

    public String receberAvaliacaoDeJogabilidade(Jogo jogo, Double nota)
    {
        return "Obrigado, sua avaliação de " +
                "jogabilidade foi recebida e registrada \n" +
                jogo.receberAvaliacaoDeJogabilidade(nota) ;
    }

    public String receberAvaliacaoDeInovacao(Jogo jogo, Double nota)
    {
        return "Obrigado, sua avaliação de " +
            "inovação foi recebida e registrada \n" +
            jogo.receberAvaliacaoDeInovacao(nota) ;
    }

    public String receberAvaliacaoDeGraficos(Jogo jogo, Double nota)
    {
        return "Obrigado, sua avaliação dos " +
                "graficos foi recebida e registrada \n" +
                jogo.receberAvaliacaoDeGraficos(nota) ;
    }

    public String receberAvaliacaoDeAtendimento(String mensagem)
    {
        return Funcionario.getInstancia().receberAvaliacaoDeAtendimento(mensagem);
    }
}
