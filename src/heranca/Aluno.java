
package heranca;

public class Aluno extends Pessoa {

    private String matricula;

    // Construtor usando super() para reutilizar da classe Pessoa
    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade); // chama o construtor da classe Pessoa
        this.matricula = matricula;
    }

    public void apresentarAluno() {
        apresentar(); // método herdado
        System.out.println("Minha matrícula é: " + matricula);
    }

    public String getMatricula() {
        return matricula;
    }
}
