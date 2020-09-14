package openclosedprinciple;

/**
 *
 */
public class PersonalLoanValidator implements Validator {
    /**
     * Creates a new instance of PersonalLoanValidator
     */
    public PersonalLoanValidator() {
    }

    public boolean isValid(int balance) {
        if (balance > 1000)
            return true;
        else
            return false;
    }
}

