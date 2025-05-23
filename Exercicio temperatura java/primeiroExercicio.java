public class Temperatura {
    public static void main(String[] args) {
        double C, K, F, Re, Ra;
        C = 2.43;

        F = C * 1.8 + 32;
        K = C + 273.15;
        Ra = C * 1.8 + 32 + 459.67;
        Re = C * 0.8;

        // Arredondando os valores
        F = Math.round(F * 100.0) / 100.0;
        K = Math.round(K * 100.0) / 100.0;
        Ra = Math.round(Ra * 100.0) / 100.0;
        Re = Math.round(Re * 100.0) / 100.0;

        System.out.println("A temperatura em Fahrenheit é: " + F);
        System.out.println("A temperatura em Kelvin é: " + K);
        System.out.println("A temperatura em Reaumur é: " + Ra);
        System.out.println("A temperatura em Rankine é: " + Re);
    }
}
