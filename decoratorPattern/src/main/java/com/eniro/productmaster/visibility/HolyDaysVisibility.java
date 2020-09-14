package com.eniro.productmaster.visibility;

import com.eniro.productmaster.product.Product;

import java.math.BigDecimal;

public class HolyDaysVisibility extends VisibilityDecorator {
    Product product;

    public HolyDaysVisibility(Product product) {
        this.product = product;
    }

    public String getDescription() {
        return product.getDescription() + ", HolyDaysVisibility";
    }

    public BigDecimal cost() {
        return new BigDecimal(50).add(product.cost());
    }
}
