import java.util.*;

public class EstruturasJava {
    public static void main(String[] args) {
        // ---------- ESTRUTURAS DE REPETIÇÃO ----------

        // 1. FOR (contagem de 1 a 5)
        System.out.println("FOR:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Contagem: " + i);
        }

        // 2. WHILE (loop até atingir condição)
        System.out.println("\nWHILE:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Contagem: " + j);
            j++;
        }

        // 3. DO-WHILE (executa pelo menos uma vez)
        System.out.println("\nDO-WHILE:");
        int k = 1;
        do {
            System.out.println("Contagem: " + k);
            k++;
        } while (k <= 5);

        // ---------- ESTRUTURAS DE DADOS ----------

        // 1. ARRAY (vetor fixo)
        System.out.println("\nARRAY:");
        int[] numeros = {10, 20, 30, 40, 50};
        for (int num : numeros) {
            System.out.println(num);
        }

        // 2. ARRAYLIST (lista dinâmica)
        System.out.println("\nARRAYLIST:");
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Bianca");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // 3. LINKEDLIST (lista encadeada)
        System.out.println("\nLINKEDLIST:");
        LinkedList<Double> notas = new LinkedList<>();
        notas.add(8.5);
        notas.add(9.0);
        notas.add(7.5);
        for (double nota : notas) {
            System.out.println(nota);
        }

        // 4. HASHSET (conjunto sem duplicatas)
        System.out.println("\nHASHSET:");
        HashSet<Integer> numerosUnicos = new HashSet<>();
        numerosUnicos.add(1);
        numerosUnicos.add(2);
        numerosUnicos.add(2); // Não será adicionado pois já existe
        for (int num : numerosUnicos) {
            System.out.println(num);
        }

        // 5. HASHMAP (dicionário chave-valor)
        System.out.println("\nHASHMAP:");
        HashMap<String, Integer> idades = new HashMap<>();
        idades.put("Alice", 25);
        idades.put("Bruno", 30);
        idades.put("Clara", 22);
        for (Map.Entry<String, Integer> entry : idades.entrySet()) {
            System.out.println(entry.getKey() + " tem " + entry.getValue() + " anos.");
        }
    }
}
