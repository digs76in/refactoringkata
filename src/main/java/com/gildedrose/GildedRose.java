package com.gildedrose;

class GildedRose {
    Item[] items;
    public final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    public final String BRIE = "Aged Brie";
    public final String PASSES = "Backstage passes to a TAFKAL80ETC concert";
    public final String CONJURED = "Conjured";
    public final int MAX_QUALITY = 50;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {

        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals(SULFURAS) && items[i].quality > MAX_QUALITY) {
                items[i].quality = MAX_QUALITY;
            }
            if (!items[i].name.equals(BRIE)
                    && !items[i].name.equals(PASSES)) {
                if (items[i].quality > 0) {
                    if (!items[i].name.equals(SULFURAS)) {
                        if(items[i].name.equals(CONJURED)){
                            items[i].quality = items[i].quality - 2;
                        }else {
                            items[i].quality = items[i].quality - 1;
                        }
                    }
                }
            } else {
                if (items[i].quality < MAX_QUALITY) {
                    items[i].quality = items[i].quality + 1;
                    if (items[i].name.equals(PASSES)) {
                        if (items[i].sellIn < 11) {
                            if (items[i].quality < MAX_QUALITY) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                        if (items[i].sellIn < 6) {
                            if (items[i].quality < MAX_QUALITY) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            }

            if (!items[i].name.equals(SULFURAS)) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!items[i].name.equals(BRIE)) {
                    if (!items[i].name.equals(PASSES)) {
                        if (items[i].quality > 0) {
                            if (!items[i].name.equals(SULFURAS)) {
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    if (items[i].quality < MAX_QUALITY) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }
        }
    }
}