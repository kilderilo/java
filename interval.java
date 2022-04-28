import java.util.Scanner;

public class interval {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a quantidade de numeros: ");
        int N = sc.nextInt();

        int count_in = 0;
        int count_out = 0;

        for(int i = 0; i < N; i++){

            System.out.print("Insira o numero: ");
            int x = sc.nextInt();
            
            if(x >= 10 && x <= 20){
                count_in += 1;
            }
            else{
                count_out += 1; 
            }

        }
    
        System.out.println(count_in + " in");
        System.out.println(count_out + " out");

        sc.close();
    }
}
