package com.eric.AbstractFactory;

import com.eric.AbstractProducts.Chair;
import com.eric.AbstractProducts.CoffeeTable;
import com.eric.AbstractProducts.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    CoffeeTable createCoffeeTable();
}
