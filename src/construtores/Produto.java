
package construtores;

public class Produto {

    private String nome;
    private double preco;

    // Construtor 1: com nome e preço
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    
    // Construtor 2: apenas nome, preço padrão
    public Produto(String nome) {
        this.nome = nome;
        this.preco = 0.0; // valor padrão
    }

    public void mostrar() {
        System.out.println("Produto: " + nome + " | Preço: R$ " + preco);
    }

    // Getters e setters (opcional)
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
