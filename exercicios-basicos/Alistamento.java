import java.util.Scanner;

public class Alistamento{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        if (idade >= 18) {
            System.out.println("Alistamento Obrigatório");
        } else {
            System.out.println("Ainda não precisa se alistar");
        }
        sc.close();
    }
}