public class Bardo extends Personagem {
    private int nivelEncanto;

    public Bardo(String nome, String raca, int nivelEncanto) {
        super(nome, raca, "Bardo");
        this.nivelEncanto = nivelEncanto;
    }

    public void encantar() {
        System.out.println("Encantando com nível " + nivelEncanto);
    }

    @Override
    public void imprimirFicha() {
        super.imprimirFicha();
        System.out.println("Nível de encanto: " + nivelEncanto);
    }
}
