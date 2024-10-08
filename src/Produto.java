public class Produto {
    private String nome;
    private int estoque;
    private double preco;

    public Produto(String nome, int estoque, double preco) {
        this.nome = nome;
        this.estoque = estoque;
        this.preco = preco;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getEstoque() {
        return estoque;
    }

    public double getPreco() {
        return preco;
    }

    // Método para diminuir o estoque
    public boolean diminuirEstoque(int quantidade) {
        if (estoque >= quantidade) {
            estoque -= quantidade;
            return true;
        } else {
            return false; // Estoque insuficiente
        }
    }

    // Exibe nome e preço quando o produto for impresso
    @Override
    public String toString() {
        return nome + " - R$ " + preco + " (Estoque: " + estoque + ")";
    }
}
