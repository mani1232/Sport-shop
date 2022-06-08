package Records;

import java.util.List;

public record Market(String name, List<Product> products, String address) {
}