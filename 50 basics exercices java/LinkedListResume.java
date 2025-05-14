import java.util.*;

public class Estudos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Quantos nomes serão adicionados ?");
        int n = ler.nextInt();
        ler.nextLine();

        LinkedList<String> nomes = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Qual o nome a ser adicionado ?");
            String nomeLinkedList = ler.nextLine();
            nomes.add(nomeLinkedList);

            System.out.println("Lista :" + nomes);

        }
        System.out.println("o nome escolhido é: " + nomes.get(1));
        System.out.println(nomes.size());
        nomes.remove(2);
        System.out.println(" Nova Lista" + nomes);

        ler.close();

    }
}
