package com.eniro.productmaster.product;

import java.math.BigDecimal;

public class FlashProduct extends Product {

    public FlashProduct() {
        description = "FlashProduct: triggered on drive by - ";
    }

    public BigDecimal cost() {
        return new BigDecimal(599);
    }
}

