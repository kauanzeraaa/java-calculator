import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        Main calculator = new Main();

        System.out.println("Soma: " + calculator.somar(numero1, numero2));
        System.out.println("Subtração: " + calculator.subtrair(numero1, numero2));
        System.out.println("Multiplicação: " + calculator.multiplicar(numero1, numero2));
        System.out.println("Divisão: " + calculator.dividir(numero1, numero2));
    }

    public double somar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public double subtrair(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public double dividir(double numero1, double numero2) {
        if (numero2 == 0) {
            throw new IllegalArgumentException("Denominador não pode ser zero");
        }
        return numero1 / numero2;
    }
}
