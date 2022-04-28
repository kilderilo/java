package aplication;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;

        System.out.print("Digite os lados do triangulo X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.print("Digite os lados do triangulo Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2;
        double areaX = Math.sqrt(p*(p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2;
        double areaY = Math.sqrt(p*(p - yA) * (p - yB) * (p - yC));

        System.out.printf("Area do triangulo X: %.2f%n", areaX);
        System.out.printf("Area do triangulo Y: %.2%fn", areaX);

        if(areaX > areaY){
            System.out.println("Triangulo de maior area: " + areaX);
        }
        else{
            System.out.println("Triangulo de maior area: " + areaY);
        }

        sc.close();
    }
    
}
