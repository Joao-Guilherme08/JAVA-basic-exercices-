import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos termos da sequência Fibonacci deseja gerar? ");
        int termos = scanner.nextInt();

        int primeiro = 0, segundo = 1;

        System.out.println("Sequência de Fibonacci com " + termos + " termos:");

        for (int i = 0; i < termos; i++) {
            System.out.print(primeiro + " ");
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        scanner.close();
    }
}
