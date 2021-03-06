package Utils;

import Records.Market;
import Records.Product;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class MenuBuilder {

    /**
     * Выводит нумерованное меню
     *
     * @param title      Показывает тайтл, используйте <B>null</B> что бы скрыть
     * @param strings    список опций
     * @param nullOption нулевая опция завершения програмы, используйте <B>null</B> что бы скрыть
     * @author Nikita
     */
    public static void MenuBuilderNumeric(String title, List<String> strings, String nullOption) {
        AtomicInteger counter = new AtomicInteger(1);
        if (title != null) System.out.println(title);
        if (nullOption != null) System.out.println("0 - " + nullOption);
        for (String s : strings) {
            System.out.println(counter.getAndIncrement() + " - " + s);
        }
    }

    /**
     * Выводит список магазинов
     *
     * @param title        Показывает тайтл, используйте <B>null</B> что бы скрыть
     * @param markets      список магазинов
     * @param withProducts выводить ли список магазинов с продуктами
     * @param startNumber  Число с которого начинается список
     * @author Nikita
     */

    public static void MenuBuilderGetMarkets(String title, List<Market> markets, boolean withProducts, int startNumber) {
        AtomicInteger counter = new AtomicInteger(startNumber);
        if (title != null) System.out.println(title);
        for (Market market : markets) {
            System.out.printf(counter.getAndIncrement() + " - " + market.name() + "(address %s)", market.address());
            if (withProducts) MenuBuilderGetProducts("List products: ", market.products(), startNumber);
        }
    }

    /**
     * Выводит список продуктов
     *
     * @param title       Показывает тайтл, используйте <B>null</B> что бы скрыть
     * @param strings     список продуктов
     * @param startNumber Число с которого начинается список
     * @author Nikita
     */

    public static void MenuBuilderGetProducts(String title, List<Product> strings, int startNumber) {
        AtomicInteger counter = new AtomicInteger(startNumber);
        if (title != null) System.out.println(title);
        for (Product product : strings) {
            System.out.println(counter.getAndIncrement() + " - id"
                    + "\nName: " + product.name()
                    + "\nColor: " + product.color()
                    + "\nCost: " + product.cost()
            );
        }
    }
}
