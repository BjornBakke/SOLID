package com.eniro.productmaster.product;

import java.math.BigDecimal;

public abstract class Product {
    String description = "Unknown Product";

    public String getDescription() {
        return description;
    }

    public abstract BigDecimal cost();
}
