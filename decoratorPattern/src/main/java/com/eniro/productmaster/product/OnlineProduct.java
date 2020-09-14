package com.eniro.productmaster.product;

import java.math.BigDecimal;

public class OnlineProduct extends Product {
    public OnlineProduct() {
        description = "Online: presence";
    }

    public BigDecimal cost() {
        return new BigDecimal(8999.99);
    }
}

