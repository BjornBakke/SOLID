package com.eniro.productmaster.visibility;

import com.eniro.productmaster.product.Product;

import java.math.BigDecimal;

public class BasicVisibility extends VisibilityDecorator {
    Product product;

    public BasicVisibility(Product product) {
        this.product = product;
    }

    public String getDescription() {
        return product.getDescription() + ", BasicVisibility";
    }

    public BigDecimal cost() {
        return new BigDecimal(100).add(product.cost());
    }
}
