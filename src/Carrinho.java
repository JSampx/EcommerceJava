import java.util.ArrayList;

public class Carrinho {
    private int qntItens;
    private double total;
    private ArrayList<Produto> listaProdutos;

    public Carrinho() {
        this.qntItens = 0;
        this.total = 0;
        this.listaProdutos = new ArrayList<>();
    }

    // Método para adicionar um produto ao carrinho
    public void adicionarProduto(Produto produto, int quantidade) {
        // Verifica se há estoque disponível
        if (produto.diminuirEstoque(quantidade)) {
            this.qntItens += quantidade;
            this.total += produto.getPreco() * quantidade;
            this.listaProdutos.add(produto);
            System.out.println(quantidade + "x " + produto.getNome() + " foi(ram) adicionado(s) ao carrinho.");
        } else {
            System.out.println("Estoque insuficiente para o produto " + produto.getNome() + ".");
        }
    }

    // Método para exibir o conteúdo do carrinho
    public void mostrarCarrinho() {
        System.out.println("Carrinho contém " + qntItens + " itens.");
        System.out.println("Total: R$ " + total);
        for (Produto p : listaProdutos) {
            System.out.println(p.getNome() + " - R$ " + p.getPreco());
        }
    }
}
