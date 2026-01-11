import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcao;

        do{
            System.out.println("Sistema de Livraria");
            System.out.println("Deseja ver a lista de livros disponíveis?");
            opcao = sc.nextLine().trim().toUpperCase();

        } while(opcao.equals("SIM"));

        System.out.println("Sistema encerrado.");
        sc.close();
    }
}
