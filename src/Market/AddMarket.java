package Market;

import Market.ProductManager.ManageProduct;
import Records.Market;
import Records.Product;
import Utils.MenuBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddMarket {

    public static void start(Scanner scanner, List<Market> database) {
        System.out.println("Enter market Name");
        String marketName = scanner.next();
        System.out.println("Enter market Address");
        String marketAddress = scanner.next();
        Market market = new Market(marketName, productMenu(scanner), marketAddress);
        database.add(market);
    }

    public static List<Product> productMenu(Scanner scanner) {
        List<Product> products = new ArrayList<>();
        while (true) {
            MenuBuilder.MenuBuilderNumeric("Products menu", List.of("Add product", "Remove product", "Show products"), "Return and save");
            switch (scanner.nextInt()) {
                case 0 -> {return products;}
                case 1 -> products.add(ManageProduct.createProduct(scanner));
                case 2 -> ManageProduct.removeProduct(scanner, products);
                case 3 -> MenuBuilder.MenuBuilderGetProducts("List products: ", products);
            }
        }
    }
}
