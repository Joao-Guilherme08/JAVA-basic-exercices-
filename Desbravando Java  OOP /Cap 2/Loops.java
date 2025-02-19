public class App {
    public static void main(String[] args) {

        double soma = 0;
        int contador = 0;

        while (contador < 35) {
            double valorDoLivro = 59.9;
            soma = soma + valorDoLivro;
            contador = contador + 1;
            System.out.println("Esse é o livro" + contador);
            System.out.println("O valor final é :" + soma);
        }
    }

}
