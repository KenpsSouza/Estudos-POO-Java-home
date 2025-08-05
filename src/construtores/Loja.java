package construtores;

public class Loja {
    public static void main(String[] args) {

        // Usando o construtor com nome e preço
        Produto p1 = new Produto("Bicicleta", 1299.90);

        // Usando o construtor apenas com nome
        Produto p2 = new Produto("Capacete");

        // Mostrar os produtos
        p1.mostrar();
        p2.mostrar();
    }
}
