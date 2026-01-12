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
            System.out.println("5 - Registrar cliente");
            System.out.println("6 - Registrar livro");
            System.out.println("0 - Sair\n");
            System.out.print("Opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch(opcao){
                case 1:
                    System.out.println("\n======Lista de livros disponíves======");
                    biblioteca.listarDisponivel();
                    break;
                case 4:
                    System.out.println("\n======Busca por ID======");
                    System.out.print("Insira o ID do livro: ");
                    int id = Integer.parseInt(sc.nextLine());
                    biblioteca.buscarLivroById(id);
                    break;
            }

        } while(opcao != 0);

        System.out.println("Sistema encerrado.");
        sc.close();
    }
}
