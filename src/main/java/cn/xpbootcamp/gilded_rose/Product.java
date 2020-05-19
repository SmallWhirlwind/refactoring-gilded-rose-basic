package cn.xpbootcamp.gilded_rose;

public class Product {

    private static final String AGED_BRIE = "Aged Brie";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";

    private String name;

    private int sellIn;

    private int quality;

    public Product(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public void updateBackStagePassesPassOneDay() {
        this.quality += 1;

        if (this.sellIn < 11) {
            this.quality += 1;
        }

        if (this.sellIn < 6) {
            this.quality += 1;
        }
        this.sellIn -= 1;

        if (this.sellIn < 0) {
            this.quality = 0;
        }
    }

    public void updateAgedBriePassOneDay() {
        this.quality += 1;
        this.sellIn -= 1;

        if (this.sellIn < 0) {
            this.quality += 1;
        }
    }

    public void updateCommonProductPassOneDay() {
        this.quality -= 1;
        this.sellIn -= 1;
        if (this.sellIn < 0) {
            this.quality -= 1;
        }
    }

    public boolean isCommonProduct() {
        return !this.name.equals(AGED_BRIE)
                && !this.name.equals(BACKSTAGE_PASSES)
                && !this.name.equals(SULFURAS);
    }

    public void resetLegitimateQuality() {
        if (this.quality > 50) {
            this.quality = 50;
        }
        if (this.quality < 0) {
            this.quality = 0;
        }
    }

    public boolean isAgedBrieProduct() {
        return this.name.equals(AGED_BRIE);
    }

    public boolean isBackStagePassesProduct() {
        return this.name.equals(BACKSTAGE_PASSES);
    }
}
