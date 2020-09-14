package substitutionprinciple;

/**
 *
 */
public class CurrentAccount {

    /**
     * Holds value of property balance.
     */
    protected int balance;

    /**
     * Holds value of property period.
     */
    protected int period;

    /**
     * Creates a new instance of Account
     */
    public CurrentAccount(int balance, int period) {
        this.balance = balance;
        this.period = period;
    }

    /**
     * open a current account with the given balance
     */
    public boolean openAccount(int balance) {
        this.balance = balance;
        return true;
    }

    /**
     * closes the account
     */
    public boolean closeAccount() {
        if (balance > 0)
            return true;
        else
            return false;
    }

    /**
     * Getter for property balance.
     *
     * @return Value of property balance.
     */
    public int getBalance() {
        return this.balance;
    }

    /**
     * Setter for property balance.
     *
     * @param balance New value of property balance.
     */
    public void setBalance(int balance) {
        this.balance = balance;
    }

    /**
     * Getter for property period.
     *
     * @return Value of property period.
     */
    public int getPeriod() {
        return this.period;
    }

    /**
     * Setter for property period.
     *
     * @param period New value of property period.
     */
    public void setPeriod(int period) {
        this.period = period;
    }

}
