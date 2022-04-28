import java.util.Scanner;

public class Quad {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        double x = sc.nextDouble();

        System.out.print("Digite o valor de Y: ");
        double y = sc.nextDouble();

        if(x > 1.0 && y > 1.0){
            System.out.println("O ponto pertence ao Q1.");
        }
        else if(x < 1.0 && y > 1.0){
            System.out.println("O ponto pertence ao Q2.");
        }
        else if(x < 1.0 && y < 1.0){
            System.out.println("O ponto pertence ao Q3.");
        }
        else if(x > 1 && y < 1){
            System.out.println("O ponto pertence ao Q4.");
        }
        else if( x == 0 && y == 0){
            System.out.println("O ponto pertence a origem.");
        }

        sc.close();


        

    }
    
}
