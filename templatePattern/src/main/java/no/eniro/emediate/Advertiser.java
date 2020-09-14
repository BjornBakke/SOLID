package no.eniro.emediate;

import java.util.Random;

public class Advertiser extends EmpediateExecutionTemplate {
    void init() {
    }

    String search(String id) {
        // look for advertisers using advertiser id.
        System.out.println("searching Advertiser using id: " + id + "\n");
        Random random = new Random();
        if (random.nextBoolean()) {
            return "123";
        }
        return null; // null object
    }

    String add(String input) {
        if (input == null) {
            return input;
        }
        System.out.println("Advertiser does not exist - adding Advertiser");
        return input;
    }


    String update(String input) {
        if (input == null) {
            return input;
        }
        System.out.println("Advertiser does  exist - updating Advertiser");
        return input;
    }

    protected String value() {
        return "123";
    }
}
