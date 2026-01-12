import java.time.LocalDate;

public class Livro {
    private static int nextId = 0;

    private final int id;
    private String titulo;
    private Autor autor;
    private boolean disponivel;
    private LocalDate dataCadastro;
    private LocalDate dataAtualizacao;

    public Livro(String titulo, Autor autor) {
        this.id = nextId++;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
        this.dataCadastro = LocalDate.now();
        this.dataAtualizacao = null;
    }

    // getters
    public int getId() {
        return id;
    }
    public String getTitulo() {
        return titulo;
    }
    public Autor getAutor() {
        return autor;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public LocalDate getDataCadastro() {
        return dataCadastro;
    }
    public LocalDate getDataAtualizacao() {
        return dataAtualizacao;
    }

    //setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    public void setDataAtualizacao(LocalDate dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

}
