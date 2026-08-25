public class Calculadora {
    public static void main(String[] args) throws Exception {
        double numero1 = 25.6;
        double numero2 = 12.8;

        Calculadora calculator = new Calculadora();

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
