package S2_N1_E1;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Sale {

    private List<Product> productList = new ArrayList<Product>();
    private double totalPrice;

    public Sale() {
        this.productList = new ArrayList<Product>();
    }

    public void calculateTotalSale(List<Product> productList) throws EmptySaleException {
        if (productList.size() == 0)
            throw new EmptySaleException("Per fer una venda primer has d’afegir productes");
//        addProductsToProductList(productList);
        double totalSale = 0;
        int totalUnits = 0;
        if (productList.size() != 0) {
            for (Product product : productList) {
                int unitsOfProduct = (int) Math.ceil(Math.random() * 10);
                double totalProduct = product.getPrice() * unitsOfProduct;
                totalSale += Math.round(totalProduct);
                totalUnits += unitsOfProduct;
            }
        }
        System.out.printf("Suma total de la venda: %.2f; Unitats de producte: %s ", totalSale, totalUnits);
        System.out.println();
    }

    public List<Product> addProductsToProductList(List<Product> productList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vols afegir productes a la venda? S/N");
        String option = sc.nextLine();
        if (option.equalsIgnoreCase("S")) {
            System.out.println("Quants productes vols afegir a la venda?");
            int numberOfProducts = sc.nextInt();
            for (int i = 0; numberOfProducts > i; i++) {
                Product product = new Product(generateNameProductRandom(), generatePriceRandom());
                productList.add(product);
            }
            for (Product product : productList) {
                DecimalFormat df = new DecimalFormat("#.00");
                System.out.println("Afegiràs a la venda " + product.getName() + " al preu: " + df.format(product.getPrice()));
            }
            option = "N";
        }
        if (option.equalsIgnoreCase("N")) option = "N";
        return productList;
    }

    private static double generatePriceRandom() {
        return new Random().nextDouble(0.1, 9.99);
    }

    private String generateNameProductRandom() {
        List<String> productNamesList = new ArrayList<String>();
        productNamesList.add("Poma Pink Lady");
        productNamesList.add("Taronja de taula");
        productNamesList.add("Kiwi Zespri");
        productNamesList.add("Taronja de suc");
        productNamesList.add("Plàtan de Canàries");
        productNamesList.add("Mango avió");
        productNamesList.add("Mango local");
        productNamesList.add("Banana");
        productNamesList.add("Pera conferència");
        return productNamesList.get(new Random().nextInt(0, productNamesList.size()));
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "productList=" + productList +
                '}';
    }

    public static List<String> createCatalogue() {
        List<String> catalogueProductList = new ArrayList<String>();
        catalogueProductList.add("Poma Pink Lady");
        catalogueProductList.add("Taronja de taula");
        catalogueProductList.add("Kiwi Zespri");
        catalogueProductList.add("Taronja de suc");
        catalogueProductList.add("Plàtan de Canàries");
        catalogueProductList.add("Mango avió");
        catalogueProductList.add("Mango local");
        catalogueProductList.add("Banana");
        catalogueProductList.add("Pera conferència");
        return catalogueProductList;
    }


}

