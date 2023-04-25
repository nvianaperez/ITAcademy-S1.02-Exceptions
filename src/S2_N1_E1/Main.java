package S2_N1_E1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws EmptySaleException {

//1. Program starts instantiating one sale with an empty productList
//2. Ask if user wants to calculate the total cost of the sale
//    --> if false --> exit program
//    --> if true --> ask for how many different products user wants to add
//                    --> if user enter 0 products, then EmptySaleException
//                    --> if user enter products > 0 --> program creates in a random way the list of products (name, price and units given randomly)
//                           * name from a list of names
//                           * price between 0.1 and 9.99 euros
//                           * number of units between 1 and 10



        Sale sale1 = new Sale(); //constructor tha initializes an EMPTY arraylist of products

        System.out.println("La llista de productes de la venda " + sale1 + " és: " + sale1.getProductList());

        System.out.println("Vols calcular el total de la venda? S/N: ");
        Scanner sc = new Scanner(System.in);
        String option = sc.nextLine();
        if(option.equalsIgnoreCase("N")) {
            System.out.println("No has gravat cap venda");
        }
        while (option.equalsIgnoreCase("S")) {
            try {
                List<Product> productList = sale1.addProductsToProductList(new ArrayList<>());
                sale1.calculateTotalSale(productList);
//                to show IndexOutOfBoundsException error uncomment line 34
                System.out.println(sale1.getProductList().get(100));
            } catch (EmptySaleException e) {
                throw new EmptySaleException(e.getMessage());
            }
            finally {
                option = "N";
            }
        }

    }

}

