import java.util.Scanner;

public class Fatorial {
    public static void main (String [] arg){

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor para calculo do fatorial: ");
        int N = sc.nextInt();

        int fator = 1;
        for(int i= 1; i <= N; i++){
            fator *= i;            
        }
        System.out.println("Fatorial: " + fator);
        sc.close();
    }
    
}
