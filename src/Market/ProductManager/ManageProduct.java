package Market.ProductManager;

import Records.Product;
import Utils.MenuBuilder;

import java.util.List;
import java.util.Scanner;

public class ManageProduct {

    public static List<Product> productMenu(Scanner scanner, List<Product> products) {
        while (true) {
            MenuBuilder.MenuBuilderNumeric("Products menu", List.of("Add product", "Remove product", "Show products"), "Return and save");
            switch (scanner.nextInt()) {
                case 0 -> {
                    return products;
                }
                case 1 -> products.add(ManageProduct.createProduct(scanner));
                case 2 -> ManageProduct.removeProduct(scanner, products);
                case 3 -> MenuBuilder.MenuBuilderGetProducts("List products: ", products, 0);
            }
        }
    }

    public static Product createProduct(Scanner scanner) {
        System.out.println("Enter product Name");
        String productName = scanner.next();
        System.out.println("Enter product Color");
        String productColor = scanner.next();
        return new Product(productName, productColor, validatePrice(scanner));
    }

    public static float validatePrice(Scanner scanner) {
        while (true) {
            float productPrice = 0;
            try {
                System.out.println("Enter product Price");
                productPrice = scanner.nextFloat();
                return productPrice;
            } catch (Exception e) {
                System.out.println(productPrice + " is not valid (" + e.getMessage() + ")");
            }
        }
    }

    public static void removeProduct(Scanner scanner, List<Product> products) {
        while (true) {
            System.out.println("Enter id of product or -1 for return");
            int choice = scanner.nextInt();
            if (choice < products.size() && choice >= 0) {
                products.remove(choice);
            } else if (choice == -1) {
                return;
            } else {
                System.out.println("This id not found");
            }
        }
    }
}
