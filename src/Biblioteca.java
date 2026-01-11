import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

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
}
