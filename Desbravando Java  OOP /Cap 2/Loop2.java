public class App {
    public static void main(String[] args) {

        double soma = 0;
        int contador = 0;

        while (contador < 35) {
            double valorDoLivro = 59.9;
            soma = soma + valorDoLivro;
            contador = contador + 1;

        }
        System.out.println("O total em estoque é : " + soma);
        if (soma < 150) {
            System.out.println("O seu estoque está muito baixo");

        } else if (soma >= 2000) {
            System.out.println("O seu estoque está muito alto");
        } else {
            System.out.println("O seu estoque está bom");
        }

    }

}
