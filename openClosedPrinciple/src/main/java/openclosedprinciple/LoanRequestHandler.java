package openclosedprinciple;

/**
 *
 */
public class LoanRequestHandler {

    private int balance;

    /**
     * Creates a new instance of LoanRequestHandler
     */
    public LoanRequestHandler(int balance) {
        this.balance = balance;
    }

    public void approveLoanOCPViolation(PersonalLoanValidator validator) {
        if (validator.isValid(balance))
            //sanction the loan
            System.out.println("Loan approved...");
        else
            System.out.println("Sorry not enough balance...");
    }

    public void approveLoan(Validator validator) {
        if (validator.isValid(balance))
            //sanction the loan
            System.out.println("Loan approved...");
        else
            System.out.println("Sorry not enough balance...");
    }
}

