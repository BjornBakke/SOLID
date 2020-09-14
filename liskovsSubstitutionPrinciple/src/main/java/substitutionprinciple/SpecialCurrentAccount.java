package substitutionprinciple;

/**
 *
 */
public class SpecialCurrentAccount extends CurrentAccount {

    /**
     * Holds value of property defaultPeriod.
     */
    private int defaultPeriod;

    /**
     * Creates a new instance of SavingsAccount
     */
    public SpecialCurrentAccount(int balance, int period) {
        super(balance, period);
    }

    public boolean closeAccount() {
        if (balance > 0 && period > defaultPeriod)
            return true;
        else
            return false;
    }

    /**
     * Getter for property defaultPeriod.
     *
     * @return Value of property defaultPeriod.
     */
    public int getDefaultPeriod() {
        return this.defaultPeriod;
    }

    /**
     * Setter for property defaultPeriod.
     *
     * @param defaultPeriod New value of property defaultPeriod.
     */
    public void setDefaultPeriod(int defaultPeriod) {
        this.defaultPeriod = defaultPeriod;
    }

}


