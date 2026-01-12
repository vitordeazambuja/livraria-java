import java.time.LocalDate;

public class Autor {
    private static int nextId = 0;

    private final int id;
    private String nome;
    private LocalDate dataNascimento;

    public Autor(String nome, LocalDate dataNascimento) {
        this.id = nextId++;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    //getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
