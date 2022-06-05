package Version2;// Segunda versão, com a classe de métodos separada
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Insira o raio: ");
        double raio = sc.nextDouble();

        double c = calc.circunferencia(raio);
        double v = calc.volume(raio);

        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.4f%n", calc.PI);


        sc.close();

    }

}
