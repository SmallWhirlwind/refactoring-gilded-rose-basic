package cn.xpbootcamp.gilded_rose;

public class Product {

    public String name;

    public int sell_in;

    public int quality;

    public Product(String name, int sell_in, int quality) {
        this.name = name;
        this.sell_in = sell_in;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sell_in + ", " + this.quality;
    }
}
