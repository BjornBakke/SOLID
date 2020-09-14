package com.eniro.productmaster.rank;

import com.eniro.productmaster.product.Product;

import java.math.BigDecimal;

public class BasicRank extends RankDecorator {
    Product product;

    public BasicRank(Product product) {
        this.product = product;
    }

    public String getDescription() {
        return product.getDescription() + ", Basic Rank";
    }

    public BigDecimal cost() {
        return new BigDecimal(999).add(product.cost());
    }
}
