package cn.xpbootcamp.gilded_rose;

class GildedRose {
    private static final String AGED_BRIE = "Aged Brie";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    
    Product[] products;

    public GildedRose(Product[] products) {
        this.products = products;
    }

    public void updateAllProductsPassOneDay() {
        for (int i = 0; i < products.length; i++) {
            if (!products[i].getName().equals(AGED_BRIE)
                    && !products[i].getName().equals(BACKSTAGE_PASSES)) {
                if (products[i].getQuality() > 0) {
                    if (!products[i].getName().equals(SULFURAS)) {
                        products[i].setQuality(products[i].getQuality() - 1);
                    }
                }
            } else {
                if (products[i].getQuality() < 50) {
                    products[i].setQuality(products[i].getQuality() + 1);

                    if (products[i].getName().equals(BACKSTAGE_PASSES)) {
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

            if (!products[i].getName().equals(SULFURAS)) {
                products[i].setSellIn(products[i].getSellIn() - 1);
            }

            if (products[i].getSellIn() < 0) {
                if (!products[i].getName().equals(AGED_BRIE)) {
                    if (!products[i].getName().equals(BACKSTAGE_PASSES)) {
                        if (products[i].getQuality() > 0) {
                            if (!products[i].getName().equals(SULFURAS)) {
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
