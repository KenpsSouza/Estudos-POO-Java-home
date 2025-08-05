package encapsulamento;

public class Pessoa {

    // 🔒 Atributos privados (encapsulados)
    private String nome;
    private int idade;

    // ✅ Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // 🟢 Getter (ler valor)
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // 🔵 Setter (alterar valor)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método comum
    public void apresentar() {
        System.out.println("Olá! Meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}
