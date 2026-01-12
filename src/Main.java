import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("Sistema de Livraria");
            System.out.println("1 - Listar livros disponíveis");
            System.out.println("2 - Registrar empréstimo");
            System.out.println("3 - Registrar devolução");
            System.out.println("0 - Sair");
            System.out.println("");
            System.out.print("Opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch(opcao){
                case 1:
                    break;
            }

        } while(opcao != 0);

        System.out.println("Sistema encerrado.");
        sc.close();
    }
}
