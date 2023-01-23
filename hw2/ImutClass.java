package hw2;


public final class ImutClass {

    private final String name;
    private final int price;

    public ImutClass(final String name, final int price) {
        this.name = name;
        this.price = price;
        }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
