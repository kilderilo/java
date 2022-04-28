import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro numero: ");
        int priNum = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        int segNum = sc.nextInt();

        if(priNum > segNum){

            int swap = segNum;
            segNum = priNum;
            priNum = swap;
        }

        if(segNum % priNum == 0){
            System.out.println("Sao multiplos.");

        }
        else{
            System.out.println("Nao sao multiplos");
        }

        sc.close();

    }
    
}
