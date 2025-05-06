import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class ManipulaArquivos {

    public static void main(String[] args) {
        // Nome do arquivo que vamos manipular
        String nomeArquivo = "meu_arquivo.txt";
        File arquivo = new File(nomeArquivo);

        // Criar um novo arquivo
        System.out.println("--- Criando Arquivo ---");
        criarArquivo(arquivo);
        System.out.println();

        // Escrever no arquivo
        System.out.println("--- Escrevendo no Arquivo ---");
        escreverNoArquivo(arquivo, "Olá, este é um texto de exemplo.\nSegunda linha do arquivo.");
        System.out.println();

        // Ler o conteúdo do arquivo
        System.out.println("--- Lendo o Arquivo ---");
        lerArquivo(arquivo);
        System.out.println();

        // Adicionar conteúdo ao arquivo
        System.out.println("--- Adicionando Conteúdo ao Arquivo ---");
        adicionarNoArquivo(arquivo, "\nEsta linha foi adicionada depois.");
        System.out.println();

        // Ler o conteúdo do arquivo novamente para ver a adição
        System.out.println("--- Lendo o Arquivo Novamente ---");
        lerArquivo(arquivo);
        System.out.println();

        // Verificar se o arquivo existe
        System.out.println("--- Verificando se o Arquivo Existe ---");
        verificarExistencia(arquivo);
        System.out.println();

        // Obter informações sobre o arquivo
        System.out.println("--- Informações do Arquivo ---");
        obterInformacoes(arquivo);
        System.out.println();

        // Deletar o arquivo
        System.out.println("--- Deletando o Arquivo ---");
        deletarArquivo(arquivo);
        System.out.println();

        // Verificar se o arquivo ainda existe após a deleção
        System.out.println("--- Verificando se o Arquivo Existe Após Deleção ---");
        verificarExistencia(arquivo);
    }

    // Método para criar um novo arquivo
    public static void criarArquivo(File arquivo) {
        try {
            if (arquivo.createNewFile()) {
                System.out.println("Arquivo '" + arquivo.getName() + "' criado com sucesso.");
            } else {
                System.out.println("Arquivo '" + arquivo.getName() + "' já existe.");
            }
        } catch (IOException e) {
            System.err.println("Erro ao criar o arquivo: " + e.getMessage());
        }
    }

    // Método para escrever em um arquivo
    public static void escreverNoArquivo(File arquivo, String conteudo) {
        try (FileWriter escritor = new FileWriter(arquivo)) {
            escritor.write(conteudo);
            System.out.println("Conteúdo escrito com sucesso no arquivo '" + arquivo.getName() + "'.");
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }

    // Método para ler o conteúdo de um arquivo
    public static void lerArquivo(File arquivo) {
        try (Scanner leitor = new Scanner(arquivo)) {
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    // Método para adicionar conteúdo ao final de um arquivo
    public static void adicionarNoArquivo(File arquivo, String conteudo) {
        try (FileWriter escritor = new FileWriter(arquivo, true)) { // O 'true' indica que é para adicionar ao final
            escritor.write(conteudo);
            System.out.println("Conteúdo adicionado com sucesso ao arquivo '" + arquivo.getName() + "'.");
        } catch (IOException e) {
            System.err.println("Erro ao adicionar conteúdo ao arquivo: " + e.getMessage());
        }
    }

    // Método para verificar se um arquivo existe
    public static void verificarExistencia(File arquivo) {
        if (arquivo.exists()) {
            System.out.println("O arquivo '" + arquivo.getName() + "' existe.");
        } else {
            System.out.println("O arquivo '" + arquivo.getName() + "' não existe.");
        }
    }

    // Método para obter informações sobre um arquivo
    public static void obterInformacoes(File arquivo) {
        if (arquivo.exists()) {
            System.out.println("Nome do arquivo: " + arquivo.getName());
            System.out.println("Caminho absoluto: " + arquivo.getAbsolutePath());
            System.out.println("É um diretório? " + arquivo.isDirectory());
            System.out.println("É um arquivo? " + arquivo.isFile());
            System.out.println("Tamanho (em bytes): " + arquivo.length());
            System.out.println("Pode ser lido? " + arquivo.canRead());
            System.out.println("Pode ser escrito? " + arquivo.canWrite());
        } else {
            System.out.println("O arquivo '" + arquivo.getName() + "' não existe, portanto não há informações para exibir.");
        }
    }

    // Método para deletar um arquivo
    public static void deletarArquivo(File arquivo) {
        if (arquivo.delete()) {
            System.out.println("Arquivo '" + arquivo.getName() + "' deletado com sucesso.");
        } else {
            System.out.println("Falha ao deletar o arquivo '" + arquivo.getName() + "'.");
        }
    }
}
