package heranca;

public class Main {
    public static void main(String[] args) {

        // Pessoa comum
        Pessoa p = new Pessoa("Carlos", 40);
        p.apresentar();

        System.out.println();

        // Aluno (classe filha)
        Aluno a = new Aluno("Ana", 20, "2025A123");
        a.apresentarAluno(); // método próprio + herdado
    }
}
