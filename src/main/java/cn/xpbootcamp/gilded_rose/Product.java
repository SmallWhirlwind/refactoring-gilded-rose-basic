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

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public void updateBackStagePassesPassOneDay() {
        this.setQuality(this.getQuality() + 1);

        if (this.getSellIn() < 11) {
            this.setQuality(this.getQuality() + 1);
        }

        if (this.getSellIn() < 6) {
            this.setQuality(this.getQuality() + 1);
        }
        this.setSellIn(this.getSellIn() - 1);

        if (this.getSellIn() < 0) {
            this.setQuality(0);
        }
    }

    public void updateAgedBriePassOneDay() {
        this.setQuality(this.getQuality() + 1);
        this.setSellIn(this.getSellIn() - 1);

        if (this.getSellIn() < 0) {
            this.setQuality(this.getQuality() + 1);
        }
    }

    public void updateCommonProductPassOneDay() {
        this.setQuality(this.getQuality() - 1);
        this.setSellIn(this.getSellIn() - 1);
        if (this.getSellIn() < 0) {
            this.setQuality(this.getQuality() - 1);
        }
    }

    public boolean isCommonProduct() {
        return !this.getName().equals(AGED_BRIE)
                && !this.getName().equals(BACKSTAGE_PASSES)
                && !this.getName().equals(SULFURAS);
    }

    public void resetLegitimateQuality() {
        if (this.getQuality() > 50) {
            this.setQuality(50);
        }
        if (this.getQuality() < 0) {
            this.setQuality(0);
        }
    }

    public boolean isAgedBrieProduct() {
        return this.getName().equals(AGED_BRIE);
    }

    public boolean isBackStagePassesProduct() {
        return this.getName().equals(BACKSTAGE_PASSES);
    }
}
