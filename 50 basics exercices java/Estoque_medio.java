import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double quantidade_minima, quantidade_maxima, estoque_medio;

        System.out.print("Calculadora de Estoque Médio\n\n");

        System.out.print("Digite a quantidade mímima:");
        quantidade_minima = entrada.nextDouble();

        System.out.print("Digite a quantidade máxima:");
        quantidade_maxima = entrada.nextDouble();
        estoque_medio = (quantidade_minima + quantidade_maxima) / 2;
        System.out.print("Estoque Médio = " + estoque_medio + "\n");

    }
}
