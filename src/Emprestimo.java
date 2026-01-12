import java.time.LocalDate;

public class Emprestimo {
    private static int nextId = 0;

    private final int id;
    private Livro livro;
    private String nomeCliente;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(Livro livro, String nomeCliente, LocalDate dataEmprestimo) {
        this.id = nextId++;
        this.livro = livro;
        this.nomeCliente = nomeCliente;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = null;
    }
}
