import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class  Personagem {
    private String nome;
    private String raca;
    private String classe;
    private int nivel;
    private int forca;
    private int destreza;
    private int constituicao;
    private int inteligencia;
    private int sabedoria;
    private int carisma;

    public Personagem(String nome, String raca, String classe) {
        this.nome = nome;
        this.raca = raca;
        this.classe = classe;
        this.nivel = 1;
        gerarAtributos();
    }

    public void gerarAtributos() {
        Random rand = new Random();
        this.forca = rand.nextInt(18) + 3;
        this.destreza = rand.nextInt(18) + 3;
        this.constituicao = rand.nextInt(18) + 3;
        this.inteligencia = rand.nextInt(18) + 3;
        this.sabedoria = rand.nextInt(18) + 3;
        this.carisma = rand.nextInt(18) + 3;
    }

    public void imprimirFicha() {
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("Força: " + forca);
        System.out.println("Destreza: " + destreza);
        System.out.println("Constituição: " + constituicao);
        System.out.println("Inteligência: " + inteligencia);
        System.out.println("Sabedoria: " + sabedoria);
        System.out.println("Carisma: " + carisma);
    }


    public static Personagem criarPersonagem(Scanner scanner) {

        ArrayList<Personagem> personagens= new ArrayList<Personagem>();
        System.out.println("Digite o nome do personagem:");
        String nome = scanner.nextLine();

        System.out.println("Digite a raça do personagem:");
        String raca = scanner.nextLine();

        System.out.println("Digite a classe do personagem:");
        String classe = scanner.nextLine();

        Personagem personagem = new Personagem(nome, raca, classe);
        personagens.add(personagem);
        return personagem;
    }
}


