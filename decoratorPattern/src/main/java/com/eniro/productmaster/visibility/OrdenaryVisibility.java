package com.eniro.productmaster.visibility;

import com.eniro.productmaster.product.Product;

import java.math.BigDecimal;

public class OrdenaryVisibility extends VisibilityDecorator {
    Product product;

    public OrdenaryVisibility(Product product) {
        this.product = product;
    }

    public String getDescription() {
        return product.getDescription() + ", OrdenaryVisibility";
    }

    public BigDecimal cost() {
        return new BigDecimal(150).add(product.cost());
    }
}
