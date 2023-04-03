public class Guardiao extends Personagem {
    private int nivelCombate;

    public Guardiao(String nome, String raca, int nivelCombate) {
        super(nome, raca, "Guardião");
        this.nivelCombate = nivelCombate;
    }

    public void protegerAliado() {
        System.out.println("Protegendo aliado com nível de combate " + nivelCombate);
    }

    @Override
    public void imprimirFicha() {
        super.imprimirFicha();
        System.out.println("Nível de combate: " + nivelCombate);
    }
}