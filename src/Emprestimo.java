import java.time.LocalDate;

public class Emprestimo {
    private static int nextId = 0;

    private final int id;
    private Livro livro;
    private Cliente cliente;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(Livro livro, Cliente cliente, LocalDate dataEmprestimo) {
        this.id = nextId++;
        this.livro = livro;
        this.cliente = cliente;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = null;
    }

    //getters
    public int getId() {
        return id;
    }

    public Livro getLivro() {
        return livro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    //setters
    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
