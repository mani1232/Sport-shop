package Market;

import Market.ProductManager.ManageProduct;
import Records.Market;
import Records.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddMarket {

    public static void start(Scanner scanner, List<Market> database) {
        List<Product> products = new ArrayList<>();
        System.out.println("Enter market Name");
        String marketName = scanner.next();
        System.out.println("Enter market Address");
        String marketAddress = scanner.next();
        Market market = new Market(marketName, ManageProduct.productMenu(scanner, products), marketAddress);
        database.add(market);
    }
}
