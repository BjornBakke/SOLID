package no.strategy;

/**
 *
 */
public class Runner {
    public static void main(String[] args) {
        ShippingInfo shippingInfo = new ShippingInfo();

        final double shippingCost = shippingInfo.getShippingCost(10.0, 100.0, "FED_EX");
        System.out.println("shippingCost = " + shippingCost);
    }
}
