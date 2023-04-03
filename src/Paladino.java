public class Paladino extends Personagem {
    private int nivelDivindade;

    public Paladino(String nome, String raca, int nivelDivindade) {
        super(nome, raca, "Paladino");
        this.nivelDivindade = nivelDivindade;
    }

    public void invocarDivindade() {
        System.out.println("Invocando divindade com nível " + nivelDivindade);
    }
}