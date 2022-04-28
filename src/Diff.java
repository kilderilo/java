import java.util.Scanner;

public class Diff {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int A = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int B = sc.nextInt();

        System.out.println("Digite o terceiro numero: ");
        int C = sc.nextInt();

        System.out.println("Digite o quarto numero: ");
        int D = sc.nextInt();

        int diff = A * B - C * D;
        
        System.out.println("O valor a diferenca entre as multiplicacoes e: " + diff);

        sc.close();

    }
}
