package substitutionprinciple;

/**
 *
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Program test = new Program();

        CurrentAccount ac = new CurrentAccount(100, 2);
        SpecialCurrentAccount sac = new SpecialCurrentAccount(200, 5);

        test.closeAnAccount(ac);
        test.closeAnAccount(sac);

    }

    public void closeAnAccount(CurrentAccount ac) {
        System.out.println("Account close result: " + ac.closeAccount());
    }
}
