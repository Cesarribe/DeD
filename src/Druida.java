public class Druida extends Personagem {
    private int nivelNatureza;

    public Druida(String nome, String raca, int nivelNatureza) {
        super(nome, raca, "Druida");
        this.nivelNatureza = nivelNatureza;
    }

    public void invocarNatureza() {
        System.out.println("Invocando a natureza com nível " + nivelNatureza);
    }

    @Override
    public void imprimirFicha() {
        super.imprimirFicha();
        System.out.println("Nível de natureza: " + nivelNatureza);
    }
}