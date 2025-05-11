import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ExercicioCompleto {
    public static void main(String[] args) {
        // 1. Array com 5 números
        int[] numerosArray = {10, 20, 30, 40, 50};

        // 2. Converter para ArrayList
        ArrayList<Integer> numerosList = new ArrayList<>();
        for (int num : numerosArray) {
            numerosList.add(num);
        }

        // 3. Soma e média
        int soma = 0;
        for (int num : numerosList) {
            soma += num;
        }
        double media = (double) soma / numerosList.size();

        // 4. Formatando saída
        String resultadoFormatado = String.format("Soma: %d | Média: %.2f", soma, media);
        System.out.println(resultadoFormatado);

        // 5. Converter para LinkedList com strings formatadas
        LinkedList<String> listaFormatada = new LinkedList<>();
        for (int i = 0; i < numerosList.size(); i++) {
            String formatado = "N" + (i + 1) + ": " + numerosList.get(i);
            listaFormatada.add(formatado);
        }

        // 6. Imprimir a LinkedList
        System.out.println("\nValores formatados na LinkedList:");
        for (String s : listaFormatada) {
            System.out.println(s);
        }
    }
}
