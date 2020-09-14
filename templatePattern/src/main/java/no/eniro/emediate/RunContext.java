package no.eniro.emediate;

public class RunContext {

    public static void main(String[] args) {

        EmpediateExecutionTemplate advertiser = new Advertiser();
        advertiser.execute("1");
        System.out.println("got advertiserId back = " + advertiser.value() + "\n");

        EmpediateExecutionTemplate campaign = new Campaign();
        campaign.execute(advertiser.value());
        System.out.println("got campaignId back = " + campaign.value());

    }
}
