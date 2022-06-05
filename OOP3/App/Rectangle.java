package App;

import java.util.Scanner;

public class Rectangle {
    public static void main(String [] ars){
        Scanner sc = new Scanner(System.in);

        Calc rect = new Calc();

        System.out.print("Insira o valor da altura: ");
        rect.height = sc.nextDouble();

        System.out.print("Insira o valor da largura: ");
        rect.width = sc.nextDouble();

        System.out.printf("%.2f%n Area: ", rect.calcArea());
        System.out.printf("%.2f%n Perimetro: ", rect.calcPerimeter());
        System.out.printf("%.2f%n Diagonal: ", rect.calcDiagonal());

        sc.close();
    }
}

