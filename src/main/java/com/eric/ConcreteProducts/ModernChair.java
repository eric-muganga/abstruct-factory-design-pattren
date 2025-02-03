package com.eric.ConcreteProducts;

import com.eric.AbstractProducts.Chair;

public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a Modern Chair.");
    }
}
