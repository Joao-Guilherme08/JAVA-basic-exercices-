import java.util.*;

public class RevisaoEstruturasEConversao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> produtos = new HashMap<>();

        while (true) {
            System.out.print("Digite o nome do produto (ou 'fim' para encerrar): ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Digite o preço: ");
            String precoStr = scanner.nextLine();

            try {
                double preco = Double.parseDouble(precoStr); // conversão de string para double
                produtos.put(nome, preco);
            } catch (NumberFormatException e) {
                System.out.println("Preço inválido! Tente novamente.");
            }
        }

        System.out.println("\nProdutos cadastrados:");
        double soma = 0.0;
        for (Map.Entry<String, Double> entry : produtos.entrySet()) {
            System.out.println(entry.getKey() + " - R$ " + entry.getValue());
            soma += entry.getValue();
        }

        if (!produtos.isEmpty()) {
            double media = soma / produtos.size();
            System.out.printf("Média dos preços: R$ %.2f\n", media);
        } else {
            System.out.println("Nenhum produto cadastrado.");
        }

        scanner.close();
    }
}
