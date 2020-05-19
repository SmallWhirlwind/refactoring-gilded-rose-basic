package cn.xpbootcamp.gilded_rose;

class GildedRose {

    Product[] products;

    public GildedRose(Product[] products) {
        this.products = products;
    }

    public void updateAllProductsPassOneDay() {
        for (Product product : products) {
            if (product.isCommonProduct()) {
                product.updateCommonProductPassOneDay();
            }
            if (product.isAgedBrieProduct()) {
                product.updateAgedBriePassOneDay();
            }
            if (product.isBackStagePassesProduct()) {
                product.updateBackStagePassesPassOneDay();
            }
            product.resetLegitimateQuality();
        }
    }

}
