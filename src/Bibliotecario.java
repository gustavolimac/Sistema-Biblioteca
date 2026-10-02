public class Bibliotecario extends Pessoa{

    private String codigoFuncionario;

    public Bibliotecario(String nome, int idade, String codigoFuncionario) {
        super(nome, idade);
        this.codigoFuncionario = codigoFuncionario;
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Código: " + codigoFuncionario);
        System.out.println("Tipo: Bibliotecário");
    }

    public String getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(String codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }
}
