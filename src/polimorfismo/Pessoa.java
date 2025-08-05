package polimorfismo;

public class Pessoa {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void falar() {
        System.out.println("Olá, eu sou uma pessoa.");
    }
}
