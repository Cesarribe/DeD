import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Raça: ");
        String raca = scanner.nextLine();

        System.out.print("Classe: ");
        String classe = scanner.nextLine();

        Personagem personagem = new Personagem(nome, raca, classe);
        personagem.imprimirFicha();


    }
}
