//Classe com métodos para calcular o salaŕio líquido

package entities;

public class Salary {

    public String name;
    public double grossSalary;
    public double Tax;

    public double netSalary(){
        return grossSalary - Tax;
    }

    public void increaseSalary(double percentage){

        grossSalary += grossSalary * percentage / 100.0;
    }

    public String toString(){
        return name + ", $ " + String.format("%.2f", netSalary());
    }
}

