package com.java.solid.principles.L.Good;

/**
 * This is good we are bothered to provide secure loan type
 * so this will behave perfectly fine even if we substitute between parent
 * and child.
 */
public class LoanClosureService {
    private SecureLoan secureLoan;

    public LoanClosureService(SecureLoan secureLoan) {
        this.secureLoan = secureLoan;
    }
    public void foreCloseLoan() {
        secureLoan.foreCloseLoan();;
    }

    public static void main(String[] args) {
        LoanClosureService ls = new LoanClosureService(new HomeLoan());
        ls.foreCloseLoan();
    }
}
