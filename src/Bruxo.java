public class Bruxo extends Personagem {
    private int nivelInvocacao;

    public Bruxo(String nome, String raca, int nivelInvocacao) {
        super(nome, raca, "Bruxo");
        this.nivelInvocacao = nivelInvocacao;
    }

    public void invocar() {
        System.out.println("Invocando com nível " + nivelInvocacao);
    }

    @Override
    public void imprimirFicha() {
        super.imprimirFicha();
        System.out.println("Nível de invocação: " + nivelInvocacao);
    }
}