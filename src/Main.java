public class Main{
    public static void main(String[] args) {
        System.out.println("========== BIBLIOTECA ==========");
        System.out.println();

        Pessoa usuario1 = new Usuario("Gustavo", 20, "001");
        Pessoa usuario2 = new Usuario("Caio", 20, "002");
        Pessoa bibliotecario = new Bibliotecario("GB", 23, "003");

        Pessoa[] pessoas = {usuario1, usuario2, bibliotecario};

        System.out.println("===== PESSOAS =====");
        for(Pessoa pessoa : pessoas){
            pessoa.exibirDados();

            if(pessoa instanceof Usuario){
                System.out.println("Esta pessoa é um usuário.");
            };
            if(pessoa instanceof Bibliotecario){
                System.out.println("Esta pessoa é um bibliotecário.");
            };
            System.out.println();
        }

        Livro[] livros = new Livro[5];
        Livro livro1 = new Livro("Dom casmurro", "Machado de Assis", "001", TipoLivro.ROMANCE, true);
        Livro livro2 = new Livro("O hobbit", "J. R. R. Tolkien", "002", TipoLivro.FANTASIA, true);
        Livro livro3 = new Livro("1984", "George Orwell", "003", TipoLivro.ROMANCE, true);
        Livro livro4 = new Livro("O pequeno Príncipe", "Antonie", "004", TipoLivro.ROMANCE, true);
        Livro livro5 = new Livro("A metamorfose", "Franz Kafka", "005", TipoLivro.ROMANCE, true);

        livros[0] = livro1;
        livros[1] = livro2;
        livros[2] = livro3;
        livros[3] = livro4;
        livros[4] = livro5;
        System.out.println("===== LIVROS =====");
        for(Livro livro : livros){
            livro.exibirDados();
            System.out.println();
        }
        System.out.println("===== EMPRÉSTIMOS =====");
        Emprestimo emprestimo1 = new Emprestimo((Usuario)usuario1, livro1);
        emprestimo1.emprestar();
        System.out.println();
        emprestimo1.emprestar();
        Emprestimo emprestimo2 = new Emprestimo((Usuario)usuario2, livro2);

        System.out.println();
        System.out.println("===== FINALIZANDO EMPRÉSTIMO =====");
        emprestimo1.finalizarEmprestimo();

        System.out.println();
        System.out.println(emprestimo1.getStatus());

        System.out.println("===== BUSCAR LIVRO POR CÓDIGO =====");
        Biblioteca biblioteca = new Biblioteca(livros,pessoas);
        System.out.println("===== LIVROS =====");
        biblioteca.listarLivros();
        System.out.println("===== PESSOAS =====");
        biblioteca.listarPessoas();
        System.out.println("===== CÓDIGO =====");
        System.out.println(biblioteca.buscarLivroPorCodigo("001"));
    }

}