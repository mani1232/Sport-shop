package Buyer;

import Records.Market;
import Records.Product;
import Utils.MenuBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuyerManager {

    static Buyer buyer = new Buyer(1000.50f, new ArrayList<>());

    public static void start(Scanner scanner, List<Market> database) {
        while (true) {
            MenuBuilder.MenuBuilderNumeric("Choose what you want ", List.of("Buy product", "Show history"), "Return");
            switch (scanner.nextInt()) {
                case 0 -> {
                    return;
                }
                case 1 -> buyProduct(scanner, database);
                case 2 -> System.out.println(buyer.getHistory());
            }
        }
    }

    public static void buyProduct(Scanner scanner, List<Market> database) {
        MenuBuilder.MenuBuilderGetMarkets("\nSelect market id from list: \n", database, false, 0);
        System.out.println("Enter id: ");
        int choiceMarket = scanner.nextInt();
        MenuBuilder.MenuBuilderGetProducts("Select id of product for buy", database.get(choiceMarket).products(), 0);
        System.out.println("Enter id: ");
        int choiceProduct = scanner.nextInt();
        Product product = database.get(choiceMarket).products().get(choiceProduct);
        if (product.cost() <= buyer.getWallet()) {
            buyer.setWallet(buyer.getWallet() - product.cost());
            buyer.getHistory().add(product);
            System.out.println("You buy " + product.name() + ", for " + product.cost());
        } else {
            System.out.println("You don't have enough money");
        }
    }
}
