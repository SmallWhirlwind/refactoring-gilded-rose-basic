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
            if (this.isCommonProduct(products[i])) {
                updateCommonProductPassOneDay(products[i]);
            }
            if (products[i].getName().equals(AGED_BRIE)) {
                updateAgedBriePassOneDay(products[i]);
            }
            if (products[i].getName().equals(BACKSTAGE_PASSES)) {
                updateBackStagePassesPassOneDay(products[i]);
            }

            resetLegitimateQuality(products[i]);
        }
    }

    private void updateBackStagePassesPassOneDay(Product product) {
        product.setQuality(product.getQuality() + 1);

        if (product.getSellIn() < 11) {
            product.setQuality(product.getQuality() + 1);
        }

        if (product.getSellIn() < 6) {
            product.setQuality(product.getQuality() + 1);
        }
        product.setSellIn(product.getSellIn() - 1);

        if (product.getSellIn() < 0) {
            product.setQuality(0);
        }
    }

    private void updateAgedBriePassOneDay(Product product) {
        product.setQuality(product.getQuality() + 1);
        product.setSellIn(product.getSellIn() - 1);

        if (product.getSellIn() < 0) {
            product.setQuality(product.getQuality() + 1);
        }
    }

    private void updateCommonProductPassOneDay(Product product) {
        product.setQuality(product.getQuality() - 1);
        product.setSellIn(product.getSellIn() - 1);
        if (product.getSellIn() < 0) {
            product.setQuality(product.getQuality() - 1);
        }
    }

    private boolean isCommonProduct(Product product) {
        return !product.getName().equals(AGED_BRIE)
                && !product.getName().equals(BACKSTAGE_PASSES)
                && !product.getName().equals(SULFURAS);
    }

    private void resetLegitimateQuality(Product product) {
        if (product.getQuality() > 50) {
            product.setQuality(50);
        }
        if (product.getQuality() < 0) {
            product.setQuality(0);
        }
    }
}
