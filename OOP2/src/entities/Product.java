package entities;

//Criação da classe Product
public class Product {
    public String name;
    public double price;
    public int quantity;

    //Construção do método que calcula o total no estoque
    public double totalValueInstock(){

        return price * quantity;
    }
    //Método que adiciona produtos no estoque
    public void addProducts(int quantity){

        this.quantity += quantity;
    }
    //Método que remove produtos do estoque
    public void removeProducts(int quantity){

        this.quantity -= quantity;
    }
    //Saída de tela que mostra as informações da variável "name" formatadas com o método "toString"
    public String toString(){
        return name
            + ", $ "
            + String.format("%.2f", price)
            + ", "
            + quantity
            + " units, Total: $ "
            + String.format("%.2f", totalValueInstock());
    }
}
