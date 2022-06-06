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
     * @param strings    выбор опций
     * @param nullOption нулевая опция завершения програмы, используйте <B>null</B> что бы скрыть
     * @author Nikita
     */
    public void MenuBuilderNumeric(String title, List<String> strings, String nullOption) {
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
     * @author Nikita
     */

    public void MenuBuilderGetMarkets(String title, List<Market> markets, boolean withProducts) {
        AtomicInteger counter = new AtomicInteger(1);
        if (title != null) System.out.println(title);
        for (Market market : markets) {
            System.out.printf(counter.getAndIncrement() + " - " + market.name() + "(address %s)", market.address());
            if (withProducts) MenuBuilderGetProducts(market.products());
        }
    }

    /**
     * Выводит список продуктов
     *
     * @param strings список продуктов
     * @author Nikita
     */

    public void MenuBuilderGetProducts(List<Product> strings) {
        for (Product s : strings) {
            System.out.println(s.id() + " - "
                    + "Name: " + s.name()
                    + "\n Color: " + s.color()
                    + "\n Cost: " + s.cost()
            );
        }
    }
}
