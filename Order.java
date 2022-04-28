import java.util.Scanner;

public class Order{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o codigo: ");
        int cod = sc.nextInt();

        System.out.print("Digite o quantidade: ");
        int quant = sc.nextInt();

        double preco_final = 0;
        if(cod == 1){
            preco_final = (double) quant * 4;
            System.out.printf("O valor do pedido é R$ %.2f%n", preco_final);
        }
        else if(cod == 2){
            preco_final = (double) quant * 4.5;
            System.out.printf("O valor do pedido é R$ %.2f%n", preco_final);
        }
        else if(cod == 3){
            preco_final = (double) quant * 5;
            System.out.printf("O valor do pedido é R$ %.2f%n", preco_final);
        }
        else if(cod == 4){
            preco_final = (double) quant * 2;
            System.out.printf("O valor do pedido é R$ %.2f%n", preco_final);
        }
        else if(cod == 5){
            preco_final = (double) quant * 1.5;
            System.out.printf("O valor do pedido é R$ %.2f%n", preco_final);
        }

        sc.close();
    }
    

}