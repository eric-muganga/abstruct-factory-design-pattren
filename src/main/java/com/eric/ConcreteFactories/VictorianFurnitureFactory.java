package com.eric.ConcreteFactories;

import com.eric.AbstractFactory.FurnitureFactory;
import com.eric.AbstractProducts.Chair;
import com.eric.AbstractProducts.CoffeeTable;
import com.eric.AbstractProducts.Sofa;
import com.eric.ConcreteProducts.VictorianChair;
import com.eric.ConcreteProducts.VictorianCoffeeTable;
import com.eric.ConcreteProducts.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}
