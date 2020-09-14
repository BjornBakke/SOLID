package openclosedprinciple;

/**
 *
 */
public class BusinessLoanValidator implements Validator {
    /**
     * Creates a new instance of PersonalLoanValidator
     */
    public BusinessLoanValidator() {
    }

    public boolean isValid(int balance) {
        if (balance > 5000)
            return true;
        else
            return false;
    }
}

