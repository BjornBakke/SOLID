package com.eniro.orderentry;

import com.eniro.comercialcontent.content.CommercialContent;
import com.eniro.coredata.data.CoreData;
import com.eniro.customermaster.contact.ContactPerson;
import com.eniro.customermaster.customer.Customer;
import com.eniro.productmaster.product.*;
import com.eniro.productmaster.rank.BasicRank;
import com.eniro.productmaster.rank.MasterRank;
import com.eniro.productmaster.visibility.HolyDaysVisibility;
import com.eniro.productmaster.visibility.MaxVisibility;
import com.eniro.productmaster.visibility.OrdenaryVisibility;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;


public class OrderEntry {


    public static void main(String args[]) {
        new OrderEntry().run();
    }

    void run() {
        Customer customer = new Customer();
        customer.contactPerson(new ContactPerson("Contact Person"));
        customer.coreData(new CoreData());
        customer.commercialContent(new CommercialContent());


        Product flashProduct = new FlashProduct();

        Product pamphletProduct = new PamphletProduct();
        pamphletProduct = new MaxVisibility(pamphletProduct);
        pamphletProduct = new MaxVisibility(pamphletProduct);
        pamphletProduct = new HolyDaysVisibility(pamphletProduct);

        Product onlineProduct = new OnlineProduct();
        onlineProduct = new OrdenaryVisibility(onlineProduct);
        onlineProduct = new MaxVisibility(onlineProduct);
        onlineProduct = new HolyDaysVisibility(onlineProduct);
        onlineProduct = new BasicRank(onlineProduct);

        Product mobileProduct = new MobileProduct();
        mobileProduct = new OrdenaryVisibility(mobileProduct);
        mobileProduct = new MaxVisibility(mobileProduct);
        mobileProduct = new HolyDaysVisibility(mobileProduct);
        mobileProduct = new MasterRank(mobileProduct);

        List<Product> productList = new ArrayList<Product>();
        productList.add(flashProduct);
        productList.add(pamphletProduct);
        productList.add(onlineProduct);
        productList.add(mobileProduct);
        customer.products(productList);
        print(customer);

    }

    private void print(Customer customer) {
        System.out.println("customer.getCost() = " + customer.getCost().setScale(2, RoundingMode.HALF_DOWN));
        System.out.println(customer.getProducts());

    }
}
