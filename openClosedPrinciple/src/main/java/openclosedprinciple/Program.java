package openclosedprinciple;

/**
 *
 */
public class Program {

    public static void main(String[] args) {
        LoanRequestHandler personal = new LoanRequestHandler(1999);
        personal.approveLoan(new PersonalLoanValidator());
        personal.approveLoan(new BusinessLoanValidator());

        // to make this work we need to open for modifications - which violates the principle
        //personal.approveLoanOCPViolation(new BusinessLoanValidator());
    }
}