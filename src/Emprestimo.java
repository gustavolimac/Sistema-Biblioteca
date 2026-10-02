public class Emprestimo{
    private Usuario usuario;
    private Livro livro;
    private StatusEmprestimo status;

    public Emprestimo(Usuario usuario, Livro livro) {
        this.usuario = usuario;
        this.livro = livro;
        this.status = StatusEmprestimo.ATIVO;
    }

    public void finalizarEmprestimo(){
        livro.devolver();
        status = StatusEmprestimo.DEVOLVIDO;
        System.out.println();
        System.out.println("Disponivel: Sim");
        }

    public void exibirDados(){
        System.out.println("===== EMPRÉSTIMO =====");
        System.out.println();
        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("Matrícula: " + usuario.getMatricula());
        System.out.println();
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Código: " + livro.getCodigo());
        System.out.println();
        System.out.println("Status: " + status.getDescricao());
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public StatusEmprestimo getStatus() {
        return status;
    }

    public void setStatus(StatusEmprestimo status) {
        this.status = status;
    }

    public void emprestar() {
        if(livro.getDisponivel()) {
            System.out.println("Livro emprestado com sucesso!");
            livro.setDisponivel(false);
        }else{
            System.out.println("Livro já está emprestado.");
        }
    }

    public void devolver() {
        if(!livro.getDisponivel()){
            System.out.println("Livro devolvido com sucesso!");
            livro.setDisponivel(true);
        }
    }
}
