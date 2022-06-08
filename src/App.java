import Buyer.BuyerManager;
import Records.Market;
import Market.AddMarket;
import Market.ManageMarket;
import Utils.MenuBuilder;

import java.util.List;
import java.util.Scanner;

public class App {
    public void run(Scanner scanner, List<Market> database) {
        MenuBuilder.MenuBuilderNumeric(Constants.TITLE + " | Main menu", List.of("Add market", "Manage Market", "Get All markets and products", "Visit as a buyer"), "Close app");
        switch (scanner.nextInt()) {
            case 0 -> System.exit(0);
            case 1 -> AddMarket.start(scanner, database);
            case 2 -> ManageMarket.start(scanner, database);
            case 3 -> MenuBuilder.MenuBuilderGetMarkets("Showing all markets and products", database, true, 1);
            case 4 -> BuyerManager.start(scanner, database);
        }
    }
}
