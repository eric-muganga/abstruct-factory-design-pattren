package com.eric.ConcreteFactories;

import com.eric.AbstractFactory.FurnitureFactory;
import com.eric.AbstractProducts.Chair;
import com.eric.AbstractProducts.CoffeeTable;
import com.eric.AbstractProducts.Sofa;
import com.eric.ConcreteProducts.ModernChair;
import com.eric.ConcreteProducts.ModernCoffeeTable;
import com.eric.ConcreteProducts.ModernSofa;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
}
