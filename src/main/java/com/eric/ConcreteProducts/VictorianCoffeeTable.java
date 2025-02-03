package com.eric.ConcreteProducts;

import com.eric.AbstractProducts.CoffeeTable;

public class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public void placeItemsOn() {
        System.out.println("Placing items on a Victorian Coffee Table.");
    }
}
