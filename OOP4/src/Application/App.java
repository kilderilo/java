//Aplicação que recebe dados do usuário e calcula o salário bruto do funcionário
package Application;

import entities.Salary;

import java.util.Scanner;

public class App {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        Salary calc = new Salary(); //Instanciação da classe Salary

        System.out.print("Insira o nome do funcionario: ");
        calc.name = sc.nextLine();
        System.out.print("Insira o salario bruto do funcionario: ");
        calc.grossSalary = sc.nextDouble();
        System.out.print("Insira o valor do desconto: ");
        calc.Tax = sc.nextDouble();

        System.out.println();
        System.out.print("Funcionario: " + calc);
        System.out.println();
        System.out.print("Qual a porcentagem de aumento? ");
        double percentage = sc.nextDouble();
        calc.increaseSalary(percentage);

        System.out.println();
        System.out.println("Dados atualizados: " + calc);

        sc.close();
    }
}
