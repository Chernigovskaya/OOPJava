package hw2;


import java.util.HashMap;
import java.util.Map;

public final class ImutClass {
    private final int number;
    private final Map<String, Integer> product;

    public ImutClass(final int number,final Map<String, Integer> product) {
        this.number = number;
        Map<String, Integer> copy = new HashMap<>();
        for(String key : product.keySet()) {
            copy.put(key, product.get(key));
        }
        this.product = copy;
    }

    public int getNumber() {
        return number;
    }

    public Map<String, Integer> getProduct() {
        Map<String, Integer> copy = new HashMap<>();
        for(String key : product.keySet()) {
           copy.put(key, product.get(key));
        }
        return copy;

    }

    @Override
    public String toString() {
        return "Product {" +
                "number = " + number +
                ", product = " + product +
                '}';
    }
}
