public class Livro implements Emprestavel {
    private String titulo;
    private String autor;
    private String codigo;
    private TipoLivro tipo;
    private boolean disponivel = true;

    public Livro(String titulo, String autor, String codigo, TipoLivro tipo, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.tipo = tipo;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public TipoLivro getTipo() {
        return tipo;
    }

    public void setTipo(TipoLivro tipo) {
        this.tipo = tipo;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public void emprestar() {
        if(disponivel) {
            System.out.println("Livro emprestado com sucesso!");
            disponivel = false;
        }else{
            System.out.println("Livro já está emprestado.");
        }
    }

    @Override
    public void devolver() {
        if(!disponivel){
            System.out.println("Livro devolvido com sucesso!");
            disponivel = true;
        }
    }

    public void exibirDados(){
        System.out.println("Código: " + codigo);
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Tipo: " + tipo);
        if(disponivel) {
            System.out.println("Disponível: Sim");
        }
        else{
            System.out.println("Disponível: Não");
        }
    }
}
