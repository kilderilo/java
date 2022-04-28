import java.util.Scanner;
public class Ponder {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

            System.out.print("Insira a quantidade de testes: ");

            int N = sc.nextInt();

                       
            for(int i = 0; i < N; i++){

                System.out.println("Insira os numeros: ");
                double num1 = sc.nextDouble();
                double num2 = sc.nextDouble();
                double num3 = sc.nextDouble();

                double media_pond = (num1 * 2 + num2 * 3 + num3 * 4) / 10;
                System.out.printf("%.1f%n", media_pond );
                
            }            
                       
        sc.close();
    }
}    

