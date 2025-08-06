package polimorfismo;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("João");
        Pessoa p2 = new Aluno("Ana");
        Pessoa p3 = new Professor("Carlos");

        // Todas chamam o método falar(), mas cada uma executa de forma diferente
        p1.falar(); // Pessoa
        p2.falar(); // Aluno
        p3.falar(); // Professor
    }
}
