import java.util.ArrayList;
import java.util.List;

public class CriaProdutos {

    // Método agora retorna List<Produto>
    public static List<Produto> criaProdutos() {
        List<Produto> listaProdutos = new ArrayList<>();

        // Adicionando produtos à lista
        listaProdutos.add(new Produto("Camiseta", 10, 21.99));
        listaProdutos.add(new Produto("Meia", 2, 12.99));
        listaProdutos.add(new Produto("Bermuda", 5, 25.99));
        listaProdutos.add(new Produto("Tênis", 10, 35.99));

        return listaProdutos; // Retorna a lista de produtos
    }
}
