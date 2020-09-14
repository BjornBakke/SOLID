package com.eniro.productmaster.visibility;

import com.eniro.productmaster.product.Product;

import java.math.BigDecimal;

public class MaxVisibility extends VisibilityDecorator {
    Product product;

    public MaxVisibility(Product product) {
        this.product = product;
    }

    public String getDescription() {
        return product.getDescription() + ", MaxVisibility";
    }

    public BigDecimal cost() {
        return new BigDecimal(500).add(product.cost());
    }
}
