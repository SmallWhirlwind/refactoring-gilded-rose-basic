package cn.xpbootcamp.gilded_rose;

class GildedRose {

    Product[] products;

    public GildedRose(Product[] products) {
        this.products = products;
    }

    public void updateAllProductsPassOneDay() {
        for (Product product : products) {
            product.updateProductPassOneDay();
        }
    }

}
