import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        // Configura o scanner para usar ponto (.) como separador decimal
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("BEM-VINDO À COTAÇÃO DO DÓLAR DE HOJE!");
        
        System.out.print("Qual é a cotação do dólar em reais hoje? ");
        double cotacaoDolar = scanner.nextDouble();

        System.out.print("Quantos dólares deseja converter? ");
        double dolares = scanner.nextDouble();

        // Conversão
        double resultado = dolares * cotacaoDolar;

        // Exibição formatada com 2 casas decimais
        System.out.printf("Seu resultado em reais é: R$ %.2f%n", resultado);

        // Fechar o scanner
        scanner.close();
    }
}
