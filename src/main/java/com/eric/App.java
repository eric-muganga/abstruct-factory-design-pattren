package com.eric;

import com.eric.AbstractFactory.FurnitureFactory;
import com.eric.AbstractProducts.Chair;
import com.eric.AbstractProducts.CoffeeTable;
import com.eric.AbstractProducts.Sofa;
import com.eric.ConcreteFactories.ModernFurnitureFactory;

/**
 * Hello world!
 */
public class App
{
    private Chair chair;
    private Sofa sofa;
    private CoffeeTable table;

    // Constructor name now matches the class name
    public App(FurnitureFactory factory) {
        this.chair = factory.createChair();
        this.sofa = factory.createSofa();
        this.table = factory.createCoffeeTable();
    }

    public void furnishRoom() {
        chair.sitOn();
        sofa.lieOn();
        table.placeItemsOn();
    }

    public static void main(String[] args) {
        // Suppose a customer selects "Modern" style:
        FurnitureFactory factory = new ModernFurnitureFactory();

        // Alternatively, for "Victorian" style:
        // FurnitureFactory factory = new VictorianFurnitureFactory();

        // Instantiate App instead of FurnitureStoreApp
        App storeApp = new App(factory);
        storeApp.furnishRoom();
    }
}
