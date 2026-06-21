import java.util.Scanner;

public class ParOrImpar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        if ( (numero % 2) == 0){
            System.out.println("O número é par.");
            if (numero > 0){
                System.out.println("Positivo");
            } else if (numero < 0){
                System.out.println("Negativo");
            } else {
                System.out.println("Zero");
            }
        }   else if ( (numero % 2) != 0){
            System.out.println("O número é ímpar");
            if (numero > 0){
                System.out.println("Positivo");
            } else if (numero < 0){
                System.out.println("Negativo");
            } else {
                System.out.println("Zero");
            }
        }
        sc.close();
    }
}