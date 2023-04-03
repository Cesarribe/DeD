public class Monge extends Personagem {
    private int nivelEnergia;

    public Monge(String nome, String raca, int nivelEnergia) {
        super(nome, raca, "Monge");
        this.nivelEnergia = nivelEnergia;
    }

    public void meditar() {
        System.out.println("Meditando com nível de energia " + nivelEnergia);
    }

    @Override
    public void imprimirFicha() {
        super.imprimirFicha();
        System.out.println("Nível de energia: " + nivelEnergia);
    }
}