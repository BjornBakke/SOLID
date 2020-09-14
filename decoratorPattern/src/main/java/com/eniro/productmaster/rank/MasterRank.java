package com.eniro.productmaster.rank;

import com.eniro.productmaster.product.Product;

import java.math.BigDecimal;

public class MasterRank extends RankDecorator {
    Product product;

    public MasterRank(Product product) {
        this.product = product;
    }

    public String getDescription() {
        return product.getDescription() + ", Master Rank";
    }

    public BigDecimal cost() {
        return new BigDecimal(2999).add(product.cost());
    }
}
