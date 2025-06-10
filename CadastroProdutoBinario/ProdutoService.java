import java.util.ArrayList;
import java.util.Collections;

public class ProdutoService {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto p) {
        produtos.add(p);
        Collections.sort(produtos); // mantém ordenado por ID
    }

    public Produto buscarProduto(int id) {
        int inicio = 0, fim = produtos.size() - 1;
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            Produto atual = produtos.get(meio);
            if (atual.getId() == id) {
                return atual;
            } else if (atual.getId() < id) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return null;
    }

    public void listarProdutos() {
        for (Produto p : produtos) {
            System.out.println(p);
        }
    }
}
