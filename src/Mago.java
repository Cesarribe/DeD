public class Mago extends Personagem {
    private int nivelMagia;

    public Mago(String nome, String raca, int nivelMagia) {
        super(nome, raca, "Mago");
        this.nivelMagia = nivelMagia;
    }

    public void conjurarMagia() {
        System.out.println("Conjurando magia com nível " + nivelMagia);
    }

    @Override
    public void imprimirFicha() {
        super.imprimirFicha();
        System.out.println("Nível de magia: " + nivelMagia);
    }
}