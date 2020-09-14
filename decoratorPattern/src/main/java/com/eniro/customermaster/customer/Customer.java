package com.eniro.customermaster.customer;

import com.eniro.comercialcontent.content.CommercialContent;
import com.eniro.coredata.data.CoreData;
import com.eniro.customermaster.contact.ContactPerson;
import com.eniro.productmaster.product.Product;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;

public class Customer {
    int DECIMAL_PLACES = Currency.getInstance("NOK").getDefaultFractionDigits();
    String SYMBOL = Currency.getInstance("NOK").getSymbol();
    private String products;
    private CoreData coreData;
    private List<Product> productList;
    private ContactPerson contactPerson;
    private CommercialContent commercialContent;

    public void coreData(CoreData coreData) {
        this.coreData = coreData;
    }

    public void commercialContent(CommercialContent commercialContent) {
        this.commercialContent = commercialContent;
    }

    public void products(List<Product> productList) {
        this.productList = productList;
    }

    public BigDecimal getCost() {
        BigDecimal total = new BigDecimal(DECIMAL_PLACES);
        for (Product product : productList) {
            total = total.add(product.cost());
        }
        return total;
    }

    public String getProducts() {
        String products = "";
        for (Product product : productList) {
            products += (product.getDescription() + " " + product.cost() + "\n");
        }
        return products;
    }

    public void contactPerson(ContactPerson contactPerson) {
        this.contactPerson = contactPerson;
    }
}
