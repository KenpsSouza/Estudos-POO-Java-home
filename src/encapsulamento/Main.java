package encapsulamento;

public class Main {
    public static void main(String[] args) {

        // Criando um objeto da classe Pessoa
        Pessoa p1 = new Pessoa("João", 30);

        // Chamando método apresentar
        p1.apresentar();

        // Alterando dados com set
        p1.setNome("Carlos");
        p1.setIdade(35);

        // Mostrando dados com get
        System.out.println("Novo nome: " + p1.getNome());
        System.out.println("Nova idade: " + p1.getIdade());

        p1.apresentar(); // Apresentar novamente
    }
}
