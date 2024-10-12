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
        if (produto.getEstoque()>=quantidade) {
            this.qntItens += quantidade;
            this.total += produto.getPreco() * quantidade;
            this.listaProdutos.add(produto);
            produto.diminuirEstoque(this.qntItens);
            System.out.println(quantidade + "x " + produto.getNome() + " foi(ram) adicionado(s) ao carrinho.");
        } else {
            System.out.println("\nEstoque insuficiente para o produto " + produto.getNome() + ".\n");
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
