package no.eniro.emediate;

import java.util.Random;

public class Campaign extends EmpediateExecutionTemplate {
    void init() {
    }

    String search(String id) {
        System.out.println("searching Campaign using id: " + id);
        Random random = new Random();
        if (random.nextBoolean()) {
            return "456";
        }
        return null; // null object
    }

    String add(String input) {
        if (input == null) {
            return input;
        }
        System.out.println("Campaign does not exist - adding Campaign");
        return input;
    }


    String update(String input) {
        if (input == null) {
            return input;
        }
        System.out.println("Campaign does  exist - updating Campaign");
        return input;
    }

    protected String value() {
        return "456";
    }
}
