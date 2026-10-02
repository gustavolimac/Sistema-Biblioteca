public enum TipoLivro {


    ROMANCE("Romance"),
    TECNOLOGIA("Tecnologia"),
    HISTORIA("História"),
    FANTASIA("Fantasia"),
    CIENCIA("Ciência");

    private String descricao;

    TipoLivro(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
