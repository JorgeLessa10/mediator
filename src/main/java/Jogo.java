/*
 ** created by: jorge.lessa
 */
public class Jogo {

    private String nome;

    public Jogo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String receberAvaliacaoDeJogabilidade(Double nota)
    {
        return "Jogabilidade do jogo " + this.getNome() + ": " + nota.toString();
    }

    public String receberAvaliacaoDeInovacao(Double nota)
    {
        return "Inovação do jogo " + this.getNome() + ": " + nota.toString();
    }

    public String receberAvaliacaoDeGraficos(Double nota)
    {
        return "Graficos do jogo " + this.getNome() + ": " + nota.toString();
    }
}
