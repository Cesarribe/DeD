public class Ladino extends Personagem {
    private int nivelDestreza;

    public Ladino(String nome, String raca, int nivelDestreza) {
        super(nome, raca, "Ladino");
        this.nivelDestreza = nivelDestreza;
    }

    public void furtividade() {
        System.out.println("Se movendo furtivamente com nível de destreza " + nivelDestreza);
    }

    @Override
    public void imprimirFicha() {
        super.imprimirFicha();
        System.out.println("Nível de destreza: " + nivelDestreza);
    }
}

