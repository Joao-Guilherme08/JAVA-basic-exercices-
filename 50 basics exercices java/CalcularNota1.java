import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        int[] notas = new int[5];

        int valorTotal = 0;

        String[] disciplinas = { "matematica", "fisica", "biologia", "geografia", "historia" };

        for (int i = 0; i < 5; i++) {
            System.out.println("Insira as nota de " + disciplinas[i] + ": ");
            notas[i] = ler.nextInt();

            valorTotal += notas[i];

        }

        double mediaNotas = (double) valorTotal / 5;
        System.out.printf("Sua média é: %.2f\n", mediaNotas);

        if (mediaNotas >= 7) {
            System.out.println("VOCE FOI APROVADO");
        } else if (mediaNotas >= 5 && valorTotal < 7) {

            System.out.println("VOCE ESTÁ DE RECUPERACAO");

        } else {

            System.out.println("VOCE ESTA REPROVADO");
        }
        ler.close();

    }
}
