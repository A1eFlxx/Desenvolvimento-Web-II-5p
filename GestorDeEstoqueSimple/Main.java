import java.util.ArrayList; //importa uma classe para fazer uma lista dinamica
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in); // cria o leitor de teclado
        ArrayList<String> produtos = new ArrayList<>(); // cria uma lista dinâmica de produtos String = texto

        int opcao = 0;

        while (opcao != 4) {

            System.out.println("\n--- MENU ---");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Listar");
            System.out.println("3 - Remover");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {

                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = sc.nextLine();
                    produtos.add(nome);
                    System.out.println("Produto adicionado!");
                    break;

                case 2:
                    if (produtos.isEmpty()) {
                        System.out.println("Lista vazia.");
                    } else {
                        System.out.println("\nProdutos:");
                        int i = 1;
                        for (String p : produtos) {
                            System.out.println(i + ". " + p);
                            i++;
                        }
                    }
                    break;

                case 3:
                    System.out.print("Número do produto para remover: ");
                    int remover = sc.nextInt();

                    if (remover > 0 && remover <= produtos.size()) {
                        produtos.remove(remover - 1);
                        System.out.println("Removido!");
                    } else {
                        System.out.println("Número inválido.");
                    }
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }
}