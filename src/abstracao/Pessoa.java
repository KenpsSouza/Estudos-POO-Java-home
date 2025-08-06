package abstracao;

public abstract class Pessoa {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    // Método comum (pode ser herdado)
    public void dizerOi() {
        System.out.println("Oi! Eu sou " + nome);
    }

    // Método abstrato (sem corpo → obrigatório nas filhas)
    public abstract void apresentar();
}
