import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        Biblioteca biblioteca = new Biblioteca();

        do{
            System.out.println("\nSistema de Livraria");
            System.out.println("1 - Listar livros disponíveis");
            System.out.println("2 - Registrar empréstimo");
            System.out.println("3 - Registrar devolução");
            System.out.println("0 - Sair\n");
            System.out.print("Opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch(opcao){
                case 1:
                    biblioteca.listarDisponivel();
                    break;
            }

        } while(opcao != 0);

        System.out.println("Sistema encerrado.");
        sc.close();
    }
}
