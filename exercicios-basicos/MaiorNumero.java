import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double numero1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double numero2 = sc.nextDouble();

        if (numero1 > numero2) {
            System.out.println("Resultado: \n" + numero1 + " é maior do que " + numero2);
        } else if (numero2 > numero1) {
            System.out.println("Resultado: \n" + numero2 + " é maior do que " + numero1);
        } else {
            System.out.println("Resultado: \n" + numero1 + " e " + numero2 + " são iguais");
        }
        sc.close();
    }
}