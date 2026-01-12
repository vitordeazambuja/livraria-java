import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();

    public Biblioteca() {
        // Teste Hardcoded Autor
        Autor autor1 = new Autor("Nicolau Maquiavel", LocalDate.of(1459,5,3));
        Autor autor2 = new Autor("Rene Descartes", LocalDate.of(1596,3,31));
        Autor autor3 = new Autor("Jose Saramago",LocalDate.of(1922,11,16));
        // Teste Hardcoded Livro
        Livro livro1 = new Livro("O Principe", autor1);
        Livro livro2 = new Livro("O Discurso sobre o metodo", autor2);
        Livro livro3 = new Livro("Ensaio sobre a Cegueira", autor3);

        autores.add(autor1);
        autores.add(autor2);
        autores.add(autor3);

        livros.add(livro1);
        livros.add(livro2);
        livros.add(livro3);
    }

    //listagens
    public void listarLivrosDisponiveis(){
        for(Livro livro : livros){
            if (livro.isDisponivel()){
                System.out.println(livro.getId() + " - " + livro.getTitulo() + " - " + livro.getAutor().getNome());
            }
        }
    }

    public void listarClientes(){
        for(Cliente cliente : clientes){
            System.out.println("ID: " + cliente.getId() + " - Nome: " + cliente.getNome() + " - Email: " + cliente.getEmail());
        }
    }

    public void listarAutores(){
        for(Autor autor : autores){
            System.out.println("ID: " + autor.getId() + " - Nome: " + autor.getNome() + " - Data de Nascimento: " + autor.getDataNascimento());
        }
    }

    public void listarEmprestimos(){
        for(Emprestimo emprestimo : emprestimos){
            System.out.println("ID: " + emprestimo.getId() + " - Livro: " + emprestimo.getLivro().getTitulo() + " - Cliente: " + emprestimo.getCliente().getNome() + " - Data de Emprestimo: " + emprestimo.getDataEmprestimo() + " - Data de Devolucao: " + emprestimo.getDataDevolucao());
        }
    }

    public void listarEmprestimosByCliente(int id){
        for(Emprestimo emprestimo : emprestimos){
            if(emprestimo.getCliente().getId() == id){
                System.out.println("ID: " + emprestimo.getId() + " - Livro: " + emprestimo.getLivro().getTitulo() + " - Cliente: " + emprestimo.getCliente().getNome() + " - Data de Emprestimo: " + emprestimo.getDataEmprestimo() + " - Data de Devolucao: " + emprestimo.getDataDevolucao());
            }
        }
    }

    // buscas
    public Livro buscarLivroById(int id){
        for(Livro livro : livros){
            if (livro.getId()==id){
                System.out.println("\n======Livro encontrado!======");
                System.out.println("● ID: " + livro.getId());
                System.out.println("● Titulo: " + livro.getTitulo());
                System.out.println("● Autor: " + livro.getAutor().getNome());
                System.out.println("● Disponivel: " + livro.isDisponivel());
                return  livro;
            }
        }
        System.out.println("\n======Livro nao encontrado!======");
        return null;
    }

    public Cliente buscarClienteById(int id) {
        for(Cliente cliente : clientes){
            if(cliente.getId()==id){
                System.out.println("\n======Cliente encontrado!======");
                System.out.println("● ID: " + cliente.getId());
                System.out.println("● Nome: " + cliente.getNome());
                System.out.println("● Email: " + cliente.getEmail());
                return  cliente;
            }
        }
        System.out.println("\n======Cliente nao encontrado!======");
        return null;
    }

    public Emprestimo buscarEmprestimoById(int id) {
        for(Emprestimo emprestimo : emprestimos){
            if(emprestimo.getId()==id){
                System.out.println("\n======Emprestimo encontrado!======");
                System.out.println("● ID: " + emprestimo.getId());
                System.out.println("● Livro: " + emprestimo.getLivro().getTitulo());
                System.out.println("● Cliente: " + emprestimo.getCliente().getNome());
                System.out.println("● Data Emprestimo: " + emprestimo.getDataEmprestimo());
                System.out.println("● Data Devolucao: " + emprestimo.getDataDevolucao());
                return  emprestimo;
            }
        }
        System.out.println("\n======Emprestimo nao encontrado!======");
        return null;
    }

    public Autor buscarAutorById(int id) {
        for(Autor autor : autores){
            if(autor.getId()==id){
                System.out.println("\n======Autor encontrado!======");
                System.out.println("● ID: " + autor.getId());
                System.out.println("● Nome: " + autor.getNome());
                System.out.println("● Data Nascimento: " + autor.getDataNascimento());
                return  autor;
            }
        }
        System.out.println("\n======Autor nao encontrado!======");
        return null;
    }

    //registros
    public Emprestimo registrarEmprestimo(Livro livro, Cliente cliente) {
        if (livro == null || cliente == null) {
            System.out.println("Livro ou cliente inválido");
            return null;
        }

        if (!livro.isDisponivel()) {
            System.out.println("Livro indisponível");
            return null;
        }

        Emprestimo emprestimo = new Emprestimo(livro, cliente, LocalDate.now());
        livro.setDisponivel(false);
        emprestimos.add(emprestimo);
        System.out.println("======Empréstimo registrado!======");
        return emprestimo;
    }

    public Emprestimo registrarDevolucao(int idEmprestimo) {
        Emprestimo emprestimo = buscarEmprestimoById(idEmprestimo);

        if (emprestimo == null) {
            System.out.println("Empréstimo não encontrado");
            return null;
        }

        if (emprestimo.getDataDevolucao() != null) {
            System.out.println("Empréstimo já devolvido");
            return emprestimo;
        }

        emprestimo.setDataDevolucao(LocalDate.now());
        emprestimo.getLivro().setDisponivel(true);
        System.out.println("======Devolução registrada!======");
        return emprestimo;
    }

    public Livro registrarLivro(String titulo, Autor autor) {
        Livro livro = new Livro(titulo,autor);
        livros.add(livro);
        System.out.println("======Livro registrado!======");
        return livro;
    }

    public Cliente registrarCliente(String nome, String email) {
        Cliente cliente = new Cliente(nome,email);
        clientes.add(cliente);
        System.out.println("======Cliente registrado!======");
        return cliente;
    }

    public Autor registrarAutor(String nome, LocalDate dataDeNascimento) {
        Autor autor = new Autor(nome,dataDeNascimento);
        autores.add(autor);
        System.out.println("======Autor registrado!======");
        return autor;
    }

}
