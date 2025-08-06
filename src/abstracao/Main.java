package abstracao;

public class Main {
    public static void main(String[] args) {

        // Pessoa p = new Pessoa("X"); ❌ Não pode instanciar classe abstrata

        Pessoa aluno = new Aluno("Lucas");
        Pessoa prof = new Professor("Renata");

        aluno.dizerOi();
        aluno.apresentar();

        System.out.println();

        prof.dizerOi();
        prof.apresentar();
    }
}
