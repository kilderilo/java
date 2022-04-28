import java.util.Scanner;

public class Divisor {
    public static void main (String [] arg){

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor para calculo dos divisores: ");
        int N = sc.nextInt();

        for(int i= 1; i <= N; i++){
            if(N % i == 0){
                System.out.println(i);
            }           
            
        }
        
        sc.close();
    }
    
}