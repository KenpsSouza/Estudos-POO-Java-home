package polimorfismo;

public class Professor extends Pessoa {

    public Professor(String nome) {
        super(nome);
    }

    // Sobrescrita do método falar
    @Override
    public void falar() {
        System.out.println("Olá, sou o professor " + nome + ". Estou ensinando!");
    }
}
