import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double numero1 = sc.nextDouble();

        System.out.println("Digite o operador: ");
        String operador = sc.next();

        System.out.println("Digite o segundo número: ");
        double numero2 = sc.nextDouble();

        if (operador.equals("+")) {
            double soma = numero1 + numero2;
            System.out.print("Soma: " + soma);
        } else if (operador.equals("-")){
            double subtracao = numero1 - numero2;
            System.out.print("Subtração: " + subtracao);
        } else if (operador.equals("*")){
            double multiplicacao = numero1 * numero2;
            System.out.println("Multiplicação: " + multiplicacao);
        } else if (operador.equals("/")){
            if (numero2 == 0){
                System.out.println("Não é possível dividir por zero");
            } else {
                double divisao = numero1 / numero2;
                System.out.println("Divisão: " + divisao);
            }
        } else {
            System.out.println("Operação inválida");
        }
        sc.close();
    }
}