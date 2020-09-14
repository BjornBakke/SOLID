package com.eniro.productmaster.product;

import java.math.BigDecimal;

public class PamphletProduct extends Product {
    public PamphletProduct() {
        description = "pamphlet presence";
    }

    public BigDecimal cost() {
        return new BigDecimal(2999);
    }
}

