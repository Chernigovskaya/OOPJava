package hw2;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> price1 = new HashMap<>();
        Map<String, Integer> price2 = new HashMap<>();
        price1.put("Помада", 100);
        price2.put("Помада", 500);

        ImutClass product1 = new ImutClass(1, price1);
        ImutClass product2 = new ImutClass(2, price2);
        product2.getProduct().put("ooo", 100);
        System.out.println(product1);
        System.out.println(product2);


    }
}
