import java.util.Scanner;

public class Negativo {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Numero par.");
        }
        else{
            System.out.println("Numero impar.");
        }

        sc.close();
    }
    
}
