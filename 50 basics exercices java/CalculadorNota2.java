import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Quantos alunos terão suas notas calculadas? ");
        int totalAlunos = ler.nextInt();

        String[] nomes = new String[totalAlunos];
        String[] situacoes = new String[totalAlunos];
        String[] disciplinas = { "Matemática", "Física", "Biologia", "Geografia", "História" };
        int totalMaterias = disciplinas.length;

        for (int i = 0; i < totalAlunos; i++) {
            double somaNotas = 0;

            System.out.println("\nAluno " + (i + 1));
            System.out.print("Digite o nome do aluno: ");
            nomes[i] = ler.next();

            for (int j = 0; j < totalMaterias; j++) {
                System.out.print("Nota de " + disciplinas[j] + ": ");
                double nota = ler.nextDouble();

                while (nota < 0 || nota > 10) {
                    System.out.print("Nota inválida. Digite novamente: ");
                    nota = ler.nextDouble();
                }

                somaNotas += nota;
            }

            double media = somaNotas / totalMaterias;

            // Determina situação do aluno
            if (media >= 7) {
                situacoes[i] = "APROVADO";
            } else if (media >= 5) {
                situacoes[i] = "RECUPERAÇÃO";
            } else {
                situacoes[i] = "REPROVADO";
            }

            // Mostra a média e situação
            System.out.printf("Média do aluno %s: %.2f - %s\n", nomes[i], media, situacoes[i]);
        }

        // Mensagem final
        System.out.println("\n---- RESUMO FINAL ----");
        for (int i = 0; i < totalAlunos; i++) {
            System.out.printf("Aluno: %-10s | Situação: %s\n", nomes[i], situacoes[i]);
        }

        ler.close();
    }
}
