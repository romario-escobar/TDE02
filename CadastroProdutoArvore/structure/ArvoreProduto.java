package structure;

import model.Produto;

public class ArvoreProduto {
    private No raiz;

    private class No {
        Produto produto;
        No esquerda, direita;

        No(Produto produto) {
            this.produto = produto;
        }
    }

    public void inserir(Produto p) {
        raiz = inserirRecursivo(raiz, p);
    }

    private No inserirRecursivo(No atual, Produto p) {
        if (atual == null) return new No(p);

        if (p.getId() < atual.produto.getId()) {
            atual.esquerda = inserirRecursivo(atual.esquerda, p);
        } else if (p.getId() > atual.produto.getId()) {
            atual.direita = inserirRecursivo(atual.direita, p);
        }

        return atual;
    }

    public void listar() {
        listarEmOrdem(raiz);
    }

    private void listarEmOrdem(No no) {
        if (no != null) {
            listarEmOrdem(no.esquerda);
            System.out.println(no.produto);
            listarEmOrdem(no.direita);
        }
    }
}
