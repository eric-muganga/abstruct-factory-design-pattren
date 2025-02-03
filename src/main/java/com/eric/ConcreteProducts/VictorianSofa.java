package com.eric.ConcreteProducts;

import com.eric.AbstractProducts.Sofa;

public class VictorianSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Lying on a Victorian Sofa.");
    }
}
