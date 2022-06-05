package Version3;// Terceira versão com métodos estáticos declarados em outra classe.

import java.util.Scanner;

public class App {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o raio: ");
        double raio = sc.nextDouble();

        double c = Calculator.circunferencia(raio);

        double v = Calculator.volume(raio);

        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.4f%n", Calculator.PI);

        sc.close();
    }
}
