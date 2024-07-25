// import javax.lang.model.util.ElementScanner14; para futuras otimizações

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 22.0;
// Lembrar que um bloco IF com mais de uma instrução tem que ter o bloco bem definido {}
        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("novo saldo: " + saldo);
        } else
            System.out.println("SALDO INSUFICIENTE");
    }

}
