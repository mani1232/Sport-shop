import Records.Market;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Market> DataBaseList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            try {
                new App().run(scanner, DataBaseList);
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(1);
            }
        }
    }
}
