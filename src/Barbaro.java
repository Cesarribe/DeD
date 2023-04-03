public class Barbaro extends Personagem {
    private int nivelRaiva;

    public Barbaro(String nome, String raca, int nivelRaiva) {
        super(nome, raca, "Barbaro");
        this.nivelRaiva = nivelRaiva;
    }

    public void entrarEmRaiva() {
        System.out.println("Entrando em raiva com nível " + nivelRaiva);
    }

    @Override
    public void imprimirFicha() {
        super.imprimirFicha();
        System.out.println("Nível de raiva: " + nivelRaiva);
    }
}