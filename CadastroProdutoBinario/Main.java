import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProdutoService service = new ProdutoService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1 - Adicionar produto");
            System.out.println("2 - Buscar produto por ID");
            System.out.println("3 - Listar produtos");
            System.out.println("4 - Sair");
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
                service.adicionarProduto(p);

            } else if (opcao == 2) {
                System.out.print("Informe o ID: ");
                int id = sc.nextInt();
                Produto encontrado = service.buscarProduto(id);
                if (encontrado != null) {
                    System.out.println("Encontrado: " + encontrado);
                } else {
                    System.out.println("Produto não encontrado.");
                }

            } else if (opcao == 3) {
                service.listarProdutos();

            } else if (opcao == 4) {
                break;

            } else {
                System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }
}
