public class Biblioteca {
    private Livro[] livros;
    private Pessoa[] pessoas;

    public Biblioteca(Livro[] livros, Pessoa[] pessoas) {
        this.livros = livros;
        this.pessoas = pessoas;
    }

    public Pessoa[] getPessoas() {
        return pessoas;
    }

    public void setPessoas(Pessoa[] pessoas) {
        this.pessoas = pessoas;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

    public Livro buscarLivroPorCodigo(String codigo) {
        for (Livro livro : livros) {
            if (livro.getCodigo().equals(codigo)) {
                return livro;
            }
        }
        return null;
    }

    public void listarLivros(){
        for (Livro livro : livros){
            livro.exibirDados();
            System.out.println();
        }
    }
    public void listarPessoas(){
        for(Pessoa pessoa : pessoas){
            pessoa.exibirDados();
            System.out.println();
        }
    }

}
