import java.util.Scanner;

public class Area{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double A = sc.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double B = sc.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double C = sc.nextDouble();

        double area_tri_ret = A * C;
        double area_circulo = C * 3.14159;
        double area_trap = (A+B/2) * C;
        double area_quad = Math.pow(B, 2);
        double area_retang = A * B;

        System.out.println();

        System.out.printf("TRIANGULO: %.4f%n", area_tri_ret);
        System.out.printf("CIRCULO: %.4f%n", area_circulo);
        System.out.printf("TRAPEZIO: %.4f%n", area_trap);
        System.out.printf("QUADRADO: %.4f%n", area_quad);
        System.out.printf("RETANGULO: %.4f%n", area_retang);

        sc.close();                

    }
}