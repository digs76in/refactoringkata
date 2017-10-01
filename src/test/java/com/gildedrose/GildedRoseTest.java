package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 4, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
        assertEquals(3, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
        app.updateQuality();
        app.updateQuality();

        assertEquals(1, app.items[0].sellIn);
        assertEquals(7, app.items[0].quality);
        app.updateQuality();
        app.updateQuality();
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
        app.updateQuality();
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);

        app.updateQuality();
        app.updateQuality();
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }

    @Test
    public void foo2() {
        Item[] items = new Item[] { new Item("foo", 4, 52) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
        assertEquals(3, app.items[0].sellIn);
        assertEquals(49, app.items[0].quality);

    }

    @Test
    public void sulfuras() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 1, 80) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);

        app.updateQuality();
        assertEquals(1, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);


    }

    @Test
    public void sulfuras2() {
        Item[] items = new Item[]{new Item("Sulfuras, Hand of Ragnaros", -1, 80)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
    }

        @Test
    public void brie() {
        Item[] items = new Item[]{new Item("Aged Brie", 1, 46)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(47, app.items[0].quality);

        app.updateQuality();
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(49, app.items[0].quality);

        app.updateQuality();
        assertEquals(50, app.items[0].quality);

        app.updateQuality();
        assertEquals(50, app.items[0].quality);
    }

    @Test
    public void brie2() {
        Item[] items = new Item[]{new Item("Aged Brie", 1, 51)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
    }

    @Test
    public void passes() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 6, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(5, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);

        app.updateQuality();
        assertEquals(4, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);

        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        assertEquals(0, app.items[0].sellIn);
        assertEquals(27, app.items[0].quality);

        app.updateQuality();
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);

    }

    @Test
    public void conjured() {
        Item[] items = new Item[]{new Item("Conjured", 6, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Conjured", app.items[0].name);
        assertEquals(5, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);

        app.updateQuality();
        assertEquals(4, app.items[0].sellIn);
        assertEquals(6, app.items[0].quality);

        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        app.updateQuality();
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }

}
