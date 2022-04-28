import java.util.Scanner;

public class Fuel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int cont_alcool = 0;
        int cont_gasolina = 0;
        int cont_diesel = 0;
        
        int insert = 0;
        while(insert != 4){
            System.out.println("Escolha um dos combustiveis: ");
            System.out.println("1. Gasolina: ");
            System.out.println("2. Alcool: ");
            System.out.println("3. Diesel: ");
            System.out.println("4. Sair.");

            insert = sc.nextInt();

            if(insert == 1){
                cont_gasolina += 1;
            }
            else if(insert == 2){
                cont_alcool += 1;
            }
            else if(insert == 3){
                cont_diesel += 1;
            }
            
        }

        System.out.println("Muito obrigado!");
        System.out.println("Gasolina: " + cont_gasolina);
        System.out.println("Alcool: " + cont_alcool);
        System.out.println("Diesel: " + cont_diesel);
        
        sc.close();
    }
    
}
