package no.strategy;

/**
 *
 */
public enum ShippingMethod {
    FIRST_CLASS {
        public double getShippingCost(double weightInPounds, double distanceInMiles) {
            // Calculate the shipping cost based on USPS First class mail table
            double firstClassRate = 77;
            return distanceInMiles * weightInPounds * firstClassRate;
        }
    },
    FED_EX {
        public double getShippingCost(double weightInPounds, double distanceInMiles) {
            // Calculate the shipping cost based on FedEx shipping table
            double fedExRate = 44;
            return distanceInMiles * weightInPounds * fedExRate;
        }
    },
    UPS {
        public double getShippingCost(double weightInPounds, double distanceInMiles) {
            // Calculate the shipping cost based on UPS table
            double upsRate = 22;
            return distanceInMiles * weightInPounds * upsRate;
        }
    };


    public abstract double getShippingCost(double weightInPounds, double distanceInMiles);
}

