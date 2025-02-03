package com.eric.ConcreteProducts;

import com.eric.AbstractProducts.CoffeeTable;

public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void placeItemsOn() {
        System.out.println("Placing items on a Modern Coffee Table.");
    }
}
