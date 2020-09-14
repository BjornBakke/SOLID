package com.eniro.productmaster.product;

import java.math.BigDecimal;

public class MobileProduct extends Product {
    public MobileProduct() {
        description = "Mobile: presence";
    }

    public BigDecimal cost() {
        return new BigDecimal(8999.99);
    }
}

