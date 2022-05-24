package App;

import java.util.Scanner;

import Operations.Calc;

public class Rectangle {
    public static void main(String [] ars){
        Scanner sc = new Scanner(System.in);

        Calc rect = new Calc();

        System.out.print("Insira o valor da altura: ");
        rect.height = sc.nextDouble();

        System.out.print("Insira o valor da largura: ");
        rect.width = sc.nextDouble();

        System.out.printf("%.2f%n", rect.calcArea());
        System.out.printf("%.2f%n", rect.calcPerimeter());
        System.out.printf("%.2f%n", rect.calcDiagonal());

        sc.close();
    }
}

