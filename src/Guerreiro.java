public class Guerreiro extends Personagem {
    private int nivelForca;

    public Guerreiro(String nome, String raca, int nivelForca) {
        super(nome, raca, "Guerreiro");
        this.nivelForca = nivelForca;
    }

    public void atacar() {
        System.out.println("Atacando com nível de força " + nivelForca);
    }

    @Override
    public void imprimirFicha() {
        super.imprimirFicha();
        System.out.println("Nível de força: " + nivelForca);
    }
}