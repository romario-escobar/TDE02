public import model.Produto;
import structure.ArvoreProduto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArvoreProduto arvore = new ArvoreProduto();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1 - Adicionar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine(); // limpar quebra de linha
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Preço: ");
                double preco = sc.nextDouble();

                Produto p = new Produto(id, nome, preco);
                arvore.inserir(p);

            } else if (opcao == 2) {
                arvore.listar();

            } else if (opcao == 3) {
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }
}
 {
    
}
