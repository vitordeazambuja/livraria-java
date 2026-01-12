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
        Autor autor1 = new Autor(1, "Nicolau Maquiavel", LocalDate.of(1459,5,3));
        Autor autor2 = new Autor(2, "René Descartes", LocalDate.of(1596,3,31));
        Autor autor3 = new Autor(3, "José Saramago",LocalDate.of(1922,11,16));
        // Teste Hardcoded Livro
        Livro livro1 = new Livro(1,"O Príncipe", autor1, true);
        Livro livro2 = new Livro(2, "O Discurso sobre o método", autor2, true);
        Livro livro3 = new Livro(3,"Ensaio sobre a Cegueira", autor3, true);

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
                System.out.println(livro.getId() + " - " + livro.getTitulo() + " - " + livro.getAutor().nome);
            }
        }
    }

    // buscas
    public Livro buscarLivroById(int id){
        for(Livro livro : livros){
            if (livro.getId()==id){
                System.out.println("\n======Livro encontrado!======");
                System.out.println("● ID: " + livro.getId());
                System.out.println("● Título: " + livro.getTitulo());
                System.out.println("● Autor: " + livro.getAutor().nome);
                System.out.println("● Disponível: " + livro.isDisponivel());
                return  livro;
            }
        }
        System.out.println("\n======Livro não encontrado!======");
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
        System.out.println("\n======Cliente não encontrado!======");
        return null;
    }

    //registros
    public Emprestimo registrarEmprestimo(Livro livro, Cliente cliente){
        if(livro != null && cliente != null){
            Emprestimo emprestimo = new Emprestimo(livro,cliente.getNome(),LocalDate.now());
            emprestimos.add(emprestimo);
            System.out.println("======Emprestimo registrado!======");
            return emprestimo;
        }
        System.out.println("\n======Dados não encontrados!======");
        return null;
    }
}
