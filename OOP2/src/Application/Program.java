package Application;

import java.util.Scanner;

import entities.Product; //importação da classe Product

public class Program{

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
            //instanciação da classe Product, criando a variável "product"
            Product product = new Product();

            //Entrada de dados
            System.out.println("Enter product data: ");
            System.out.print("Name: ");
            product.name = sc.nextLine();
            System.out.print("Price: ");
            product.price = sc.nextDouble();
            System.out.print("Quantity: ");
            product.quantity = sc.nextInt();

            //primeira saída com o resultado da entrada de dados
            System.out.println();
            System.out.println("Product data: " + product);

            //Bloco que adiciona quantidades ao estoque
            System.out.println();
            System.out.println("Enter the product quantity to be added in stock: ");
            int quantity = sc.nextInt();
            product.addProducts(quantity);

            //Saída com o valor atualizado de quantidade e valor total do estoque
            System.out.println();
            System.out.println("Updated data: " + product);

            //Bloco que remove quantidades do estoque
            System.out.println();
            System.out.println("Enter the product quantity to be removed from stock: ");
            quantity = sc.nextInt();
            product.removeProducts(quantity);

            //Saída atualizada da situação do estoque
            System.out.println();
            System.out.println("Updated data: " + product);

        sc.close();
    }
}


