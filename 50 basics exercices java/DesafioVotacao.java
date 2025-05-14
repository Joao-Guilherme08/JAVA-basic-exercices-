import java.util.ArrayList;

public class Estudos {
    public static void main(String[] args) {
        // Lista de votos simulada como entrada
        String[] votosDaEleicao = { "1", "2", "bolsonaro", "3", "4", "0", "5", "Lula" };

        // Lista para armazenar apenas votos válidos (1 a 4)
        ArrayList<Integer> votosValidos = new ArrayList<>();

        for (String voto : votosDaEleicao) {
            try {
                int votoNumerico = Integer.parseInt(voto); // tentativa de casting
                if (votoNumerico >= 1 && votoNumerico <= 4) {
                    votosValidos.add(votoNumerico);
                    System.out.println("Voto válido registrado: " + votoNumerico);
                } else {
                    System.out.println("Voto inválido (fora do intervalo): " + voto);
                }
            } catch (NumberFormatException e) {
                System.out.println("Voto inválido (não numérico): " + voto);
            }
        }

        // Contagem dos votos por candidato
        int lula = 0, bolsonaro = 0, joao = 0, boulos = 0;
        for (int voto : votosValidos) {
            if (voto == 1) lula++;
            else if (voto == 2) bolsonaro++;
            else if (voto == 3) joao++;
            else if (voto == 4) boulos++;
        }

        // Resultado final formatado
        System.out.println("\n--- Resultado da Eleição ---");
        System.out.printf("Lula (1): %d votos\n", lula);
        System.out.printf("Bolsonaro (2): %d votos\n", bolsonaro);
        System.out.printf("João (3): %d votos\n", joao);
        System.out.printf("Boulos (4): %d votos\n", boulos);
    }
}
