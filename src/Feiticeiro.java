public class Feiticeiro extends Personagem {
    private int nivelMagiaSelvagem;

    public Feiticeiro(String nome, String raca, int nivelMagiaSelvagem) {
        super(nome, raca, "Feiticeiro");
        this.nivelMagiaSelvagem = nivelMagiaSelvagem;
    }

    public void usarMagiaSelvagem() {
        System.out.println("Usando magia selvagem com nível " + nivelMagiaSelvagem);
    }

    @Override
    public void imprimirFicha() {
        super.imprimirFicha();
        System.out.println("Nível de natureza: " + nivelMagiaSelvagem);
    }
}