import java.util.Scanner;

public class AprovacaoEscolar {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();
        
        System.out.println("Digite a sua primeira nota: ");
        double nota1 = sc.nextInt();
        
        System.out.println("Digite a sua segunda nota: ");
        double nota2 = sc.nextInt();
        
        double media = (nota1 + nota2) / 2;

        System.out.println("Nome: " + nome);
        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Você foi aprovado!!!");
        } else if (media >= 5) {
            System.out.println("Você ficou de recuperação...");
        } else {
            System.out.println("Você foi reprovado.");
        }
        sc.close();
    }
}