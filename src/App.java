import Records.Market;
import Market.AddMarket;
import Market.EditMarket;
import Utils.MenuBuilder;

import java.util.List;
import java.util.Scanner;

public class App {
    public void run(Scanner scanner, List<Market> database) {
        List<String> options = List.of("Add market", "Edit Market", "Get All markets", "Visit as a buyer");
        MenuBuilder.MenuBuilderNumeric(Constants.TITLE + " | Main menu", options, "Close app");
        switch (scanner.nextInt()) {
            case 0 -> System.exit(0);
            case 1 -> AddMarket.start(scanner, database);
            case 2 -> EditMarket.start(scanner, database);
            case 3 -> MenuBuilder.MenuBuilderGetMarkets("Showing all markets and products", database, true);
            case 4 -> MenuBuilder.MenuBuilderGetMarkets("Showing all markets", database, false);
        }
    }
}
