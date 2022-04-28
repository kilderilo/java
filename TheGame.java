import java.util.Scanner;;

public class TheGame{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a hora de entrada: ");
        int hr_entr = sc.nextInt();

        System.out.print("Digite a hora de saida: ");
        int hr_saida = sc.nextInt();

        int durat = 0;
        if(hr_entr < hr_saida){
            durat =  hr_saida - hr_entr;            
        }
        else{
            
            durat = 24 - hr_entr + hr_saida;                
            }        
        
            System.out.println("Horas jogadas: " + durat);
    }
}