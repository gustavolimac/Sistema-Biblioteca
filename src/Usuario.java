public class Usuario extends Pessoa{
    private String matricula;

    public Usuario(String nome, int idade, String matricula){
        super(nome, idade);
        this.matricula = matricula;
    }

    @Override
    public void exibirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Matrícula: " + matricula);
        System.out.println("Tipo: Usuário");
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
