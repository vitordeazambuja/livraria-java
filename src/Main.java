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
                    break;
                case 4:
                    System.out.println("\n======Busca por ID======");
                    System.out.print("Insira o ID do livro: ");
                    int id = Integer.parseInt(sc.nextLine());
                    biblioteca.buscarLivroById(id);
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("\n======Lista de todos os clientes======");
                    break;
                case 7:
                    break;
                case 8:
                    System.out.println("\n======Lista de todos os autores======");
                    break;
                case 9:
                    break;
            }

        } while(opcao != 0);

        System.out.println("Sistema encerrado.");
        sc.close();
    }
}
