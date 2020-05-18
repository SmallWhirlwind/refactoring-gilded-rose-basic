package cn.xpbootcamp.gilded_rose;

class GildedRose {
    Product[] products;

    public GildedRose(Product[] products) {
        this.products = products;
    }

    public void updateAllProductsPassOneDay() {
        for (int i = 0; i < products.length; i++) {
            if (!products[i].getName().equals("Aged Brie")
                    && !products[i].getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (products[i].getQuality() > 0) {
                    if (!products[i].getName().equals("Sulfuras, Hand of Ragnaros")) {
                        products[i].setQuality(products[i].getQuality() - 1);
                    }
                }
            } else {
                if (products[i].getQuality() < 50) {
                    products[i].setQuality(products[i].getQuality() + 1);

                    if (products[i].getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (products[i].getSellIn() < 11) {
                            if (products[i].getQuality() < 50) {
                                products[i].setQuality(products[i].getQuality() + 1);
                            }
                        }

                        if (products[i].getSellIn() < 6) {
                            if (products[i].getQuality() < 50) {
                                products[i].setQuality(products[i].getQuality() + 1);
                            }
                        }
                    }
                }
            }

            if (!products[i].getName().equals("Sulfuras, Hand of Ragnaros")) {
                products[i].setSellIn(products[i].getSellIn() - 1);
            }

            if (products[i].getSellIn() < 0) {
                if (!products[i].getName().equals("Aged Brie")) {
                    if (!products[i].getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (products[i].getQuality() > 0) {
                            if (!products[i].getName().equals("Sulfuras, Hand of Ragnaros")) {
                                products[i].setQuality(products[i].getQuality() - 1);
                            }
                        }
                    } else {
                        products[i].setQuality(0);
                    }
                } else {
                    if (products[i].getQuality() < 50) {
                        products[i].setQuality(products[i].getQuality() + 1);
                    }
                }
            }
        }
    }
}
