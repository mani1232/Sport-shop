import Records.Market;
import Market.AddMarket;
import Market.EditMarket;
import Utils.MenuBuilder;

import java.util.List;
import java.util.Scanner;

public class App {

    static MenuBuilder menuBuilder = new MenuBuilder();

    public void run(Scanner scanner, List<Market> database) {
        List<String> options = List.of("Add market", "Edit Market", "Get All markets", "Visit as a buyer");
        menuBuilder.MenuBuilderNumeric(Constants.TITLE + " | Main menu", options, "Close app");
        switch (scanner.nextInt()) {
            case 0 -> System.exit(0);
            case 1 -> new AddMarket().start(scanner, database);
            case 2 -> new EditMarket().start(scanner, database);
            case 3 -> menuBuilder.MenuBuilderGetMarkets("Showing all markets and products", database, true);
            case 4 -> menuBuilder.MenuBuilderGetMarkets("Showing all markets", database, false);
        }
    }
}
