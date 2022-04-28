import java.util.Scanner;
public class Quad2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int x = 0;
        int y = 0;

        System.out.print("Insira o valor de X: ");
        x = sc.nextInt();
        System.out.print("Insira o valor de Y: ");            
        y = sc.nextInt();

        while(x != 0 && y !=0){
            if(x > 0 && y > 0){
                System.out.println("Primeiro quadrante.");                
            }
            else if(x < 0 && y > 0){
                System.out.println("Segundo quadrante.");        
            }
            else if(x < 0 && y < 0){
                System.out.println("Terceiro quadrante."); 
            }
            else if(x > 0 && y < 0){
                System.out.println("Quarto quadrante."); 
            }
            System.out.print("Insira o valor de X: ");
            x = sc.nextInt();
            System.out.print("Insira o valor de Y: ");
            y = sc.nextInt();
        }
        sc.close();

    }
    
}
