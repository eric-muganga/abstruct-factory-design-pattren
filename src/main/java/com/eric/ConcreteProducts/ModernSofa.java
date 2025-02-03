package com.eric.ConcreteProducts;

import com.eric.AbstractProducts.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Lying on a Modern Sofa.");
    }
}
