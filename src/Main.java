import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Lista tipada com produtos
        List<Produto> produtos = CriaProdutos.criaProdutos();
        Scanner sc = new Scanner(System.in);
        Carrinho carrinho = new Carrinho(); // Criar o carrinho fora do loop

        System.out.println("##### E-Commerce #####");
        System.out.println("\nItens à venda:");

        // Exibe os produtos disponíveis
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            System.out.println("Item " + (i + 1) + ": " + produto); // Usa o toString de Produto para exibir os detalhes
        }

        int opc = -1; // Inicializar com valor diferente de 0 para entrar no loop
        do {
            System.out.println("\nDigite o código do produto que deseja inserir no carrinho (ou 0 para sair):");
            try {
                opc = Integer.parseInt(sc.nextLine());

                if (opc > 0 && opc <= produtos.size()) {
                    Produto produtoSelecionado = produtos.get(opc - 1); // Seleciona o produto correspondente

                    System.out.println("Digite a quantidade desejada:");
                    int qnt = Integer.parseInt(sc.nextLine());

                    // Adiciona o produto ao carrinho usando o método de Carrinho
                    carrinho.adicionarProduto(produtoSelecionado, qnt);
                    System.out.println(qnt + "x " + produtoSelecionado.getNome() + "(s) foi(ram) adicionado(s) ao carrinho.");

                    // Exibe o estado atual do carrinho
                    carrinho.mostrarCarrinho();

                } else if (opc == 0) {
                    System.out.println("Encerrando a compra.");
                } else {
                    System.out.println("Código de produto inválido.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
            }

        } while (opc != 0); // Fim do loop quando o usuário digitar 0

        sc.close();
    }
}
