
package polimorfismo;

public class Aluno extends Pessoa {

    public Aluno(String nome) {
        super(nome);
    }

    // Sobrescrita do método falar
    @Override
    public void falar() {
        System.out.println("Olá, sou o aluno " + nome + ". Estou estudando!");
    }
}
