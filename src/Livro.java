import java.time.LocalDate;

public class Livro {
    private int id;
    private String titulo;
    private Autor autor;
    private boolean disponivel;
    private LocalDate dataCadastro;
    private LocalDate dataAtualizacao;

    public Livro(int id, String titulo, Autor autor, boolean disponivel) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
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

}
