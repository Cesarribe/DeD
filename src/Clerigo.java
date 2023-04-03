public class Clerigo extends Personagem {
    private int nivelFe;

    public Clerigo(String nome, String raca, int nivelFe) {
        super(nome, raca, "Clerigo");
        this.nivelFe = nivelFe;
    }

    public void curar() {
        System.out.println("Curando com nível " + nivelFe + " de fé.");
    }

    @Override
    public void imprimirFicha() {
        super.imprimirFicha();
        System.out.println("Nível de fé: " + nivelFe);
    }
}