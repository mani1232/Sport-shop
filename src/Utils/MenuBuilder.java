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
            if (withProducts) MenuBuilderGetProducts("List products: " ,market.products());
        }
    }

    /**
     * Выводит список продуктов
     *
     * @param strings список продуктов
     * @author Nikita
     */

    public void MenuBuilderGetProducts(String title, List<Product> strings) {
        if (title != null) System.out.println(title);
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(i + " - id"
                    + "\nName: " + strings.get(i).name()
                    + "\nColor: " + strings.get(i).color()
                    + "\nCost: " + strings.get(i).cost()
            );
        }
    }
}
