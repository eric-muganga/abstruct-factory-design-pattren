package com.eric.ConcreteProducts;

import com.eric.AbstractProducts.Chair;

public class VictorianChair implements Chair {

    @Override
    public void sitOn() {
        System.out.println("Sitting on a Victorian Chair.");
    }
}
