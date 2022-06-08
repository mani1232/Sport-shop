package Market;

import Records.Market;
import Utils.MenuBuilder;

import java.util.List;
import java.util.Scanner;

public class EditMarket {
    public static void start(Scanner scanner, List<Market> database) {
        MenuBuilder.MenuBuilderGetMarkets("\nSelect market id from list for edit: \n", database, false, 0);
    }
}
