import java.time.LocalDate;

public class Autor {
    int id;
    String nome;
    LocalDate dataNascimento;

    public Autor(int id, String nome, LocalDate dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
}
