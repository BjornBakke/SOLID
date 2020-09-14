package no.strategy;

/**
 *
 */
public class ShippingInfo {


    public double getShippingCost(double weightInPounds, double distanceInMiles, String strategy) {
        ShippingMethod shippingMethod = ShippingMethod.valueOf(strategy);
        return shippingMethod.getShippingCost(weightInPounds, distanceInMiles);
    }
}