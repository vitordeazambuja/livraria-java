import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        Biblioteca biblioteca = new Biblioteca();

        do{
            System.out.println("\n======Sistema de Livraria======");
            System.out.println("1 - Listar livros disponíveis");
            System.out.println("2 - Registrar empréstimo");
            System.out.println("3 - Registrar devolução");
            System.out.println("4 - Buscar livro por ID");
            System.out.println("5 - Registrar livro");
            System.out.println("6 - Listar todos os clientes");
            System.out.println("7 - Registrar cliente");
            System.out.println("8 - Listar todos os autores");
            System.out.println("9 - Registrar autor");
            System.out.println("10 - Listar todos os emprestimos");
            System.out.println("0 - Sair\n");
            System.out.print("Opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch(opcao){
                case 1:
                    System.out.println("\n======Lista de livros disponíves======");
                    biblioteca.listarLivrosDisponiveis();
                    break;
                case 2:
                    System.out.println("\n======Registrar empréstimo de livro======");
                    System.out.print("Insira o ID do livro: ");
                    int idLivro = Integer.parseInt(sc.nextLine());
                    System.out.print("Insira o ID do cliente: ");
                    int idCliente = Integer.parseInt(sc.nextLine());
                    biblioteca.registrarEmprestimo(biblioteca.buscarLivroById(idLivro),biblioteca.buscarClienteById(idCliente));
                    break;
                case 3:
                    System.out.println("\n======Registrar devolução de livro======");
                    System.out.print("Insira o ID do empréstimo: ");
                    int idEmprestimo = Integer.parseInt(sc.nextLine());
                    biblioteca.registrarDevolucao(idEmprestimo);
                    break;
                case 4:
                    System.out.println("\n======Buscar livro por ID======");
                    System.out.print("Insira o ID do livro: ");
                    int id = Integer.parseInt(sc.nextLine());
                    biblioteca.buscarLivroById(id);
                    break;
                case 5:
                    System.out.println("\n======Registrar livro======");
                    System.out.print("Insira o titulo do livro: ");
                    String tituloLivro = sc.nextLine();
                    System.out.print("Insira o ID do autor: ");
                    int idAutor = Integer.parseInt(sc.nextLine());
                    biblioteca.registrarLivro(tituloLivro, biblioteca.buscarAutorById(idAutor));
                    break;
                case 6:
                    System.out.println("\n======Lista de todos os clientes======");
                    biblioteca.listarClientes();
                    break;
                case 7:
                    System.out.println("\n======Registrar cliente======");
                    System.out.print("Insira o nome: ");
                    String nomeCliente = sc.nextLine();
                    System.out.print("Insira o email: ");
                    String emailCliente = sc.nextLine();
                    biblioteca.registrarCliente(nomeCliente, emailCliente);
                    break;
                case 8:
                    System.out.println("\n======Lista de todos os autores======");
                    biblioteca.listarAutores();
                    break;
                case 9:
                    break;
                case 10:
                    System.out.println("\n======Lista de todos os emprestimos======");
                    break;
            }

        } while(opcao != 0);

        System.out.println("Sistema encerrado.");
        sc.close();
    }
}
