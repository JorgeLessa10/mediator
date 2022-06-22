/*
 ** created by: jorge.lessa
 */
public class Funcionario {

    private static Funcionario instancia = new Funcionario();

    public Funcionario() {
    }

    public static Funcionario getInstancia()
    {
        return instancia;
    }

    public String receberAvaliacaoDeAtendimento(String mensagem)
    {
        return "Agradecemos sua mensagem: " + mensagem + "\nEstamos sempre o melhor atendimento";
    }
}
