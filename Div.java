import java.util.Scanner;

public class Div {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas divisoes serao analisadas? ");
        int N = sc.nextInt();

        for(int i = 0; i < N; i ++){

            System.out.print("Insira o primeiro numero: ");
            int a = sc.nextInt();

            System.out.print("Insira o segundo numero: ");
            int b = sc.nextInt();

            if(b == 0){
                System.out.println("Divisao impossivel");
            }
            else{
                System.out.printf("Resultado: %.1f%n", (double) a / b);
            }
        }
        sc.close();
    }
    
}
