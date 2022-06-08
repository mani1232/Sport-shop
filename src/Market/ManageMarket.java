package Market;

import Market.ProductManager.ManageProduct;
import Records.Market;
import Utils.MenuBuilder;

import java.util.List;
import java.util.Scanner;

public class ManageMarket {
    public static void start(Scanner scanner, List<Market> database) {
        while (true) {
            MenuBuilder.MenuBuilderGetMarkets("\nSelect market id from list for edit: \n", database, false, 0);
            System.out.println("Enter id: ");
            int choice = scanner.nextInt();
            MenuBuilder.MenuBuilderNumeric("Choose what you want to edit ", List.of("Remove market", "Edit market products"), "Return");
            switch (scanner.nextInt()) {
                case 0 -> {
                    return;
                }
                case 1 -> removeMarket(scanner, database);
                case 2 -> ManageProduct.productMenu(scanner, database.get(choice).products());
            }
        }
    }


    public static void removeMarket(Scanner scanner, List<Market> markets) {
        while (true) {
            System.out.println("Enter id of market or -1 for return");
            int choice = scanner.nextInt();
            if (choice < markets.size() && choice >= 0) {
                markets.remove(choice);
            } else if (choice == -1) {
                return;
            } else {
                System.out.println("This id not found");
            }
        }
    }
}
