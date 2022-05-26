package application;
import java.util.Scanner;
import studentClass.Student;

public class Application {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Insira o nome do estudante: ");
        student.name = sc.nextLine();
        System.out.print("Insira primeira nota: ");
        student.nota1 = sc.nextDouble();
        System.out.print("Insira segunda nota: ");
        student.nota2 = sc.nextDouble();
        System.out.print("Insira terceira nota: ");
        student.nota3 = sc.nextDouble();

        System.out.printf("%.2f%n", student.notaFinal());

        if(student.notaFinal() < 60.0){
            System.out.println("Reprovado(a).");
            System.out.printf("%.2f pontos faltando.", student.pontosFaltando());
        }
        else{
            System.out.println("Aprovado(a).");
        }
        sc.close();
    }
}
