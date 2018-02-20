import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */

    /**
     * placeholder.
     */
    public enum BankAccountType {
        /**
         placeholder.
         */
        CHECKINGS,
        /**
         placeholder.
         */
        SAVINGS,
        /**
        placeholder.
         */
        STUDENT,
        /**
         placeholder.
         */
        WORKPLACE
    }
    /**
     * placeholder.
     */
    private int accountNumber;
    /**
     * placeholder.
     */
    private BankAccountType accountType;
    /**
     * placeholder.
     */
    private double accountBalance;
    /**
     * placeholder.
     */
    private String ownerName;
    /**
     * placeholder.
     */
    private double interestRate;

    /**
     * placeholder.
     */
    private double interestEarned;
    /**
     * placeholder.
     * @param name place.
     * @param accountCategory placeholder.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        this.ownerName = name;
        this.accountType = accountCategory;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
    /**
     * placeholder.
     */
    public int getAccountNumber() {
        return accountNumber;
    }
    /**
     * placeholder.
     * @param number placeholder.
     */
    public void setAccountNumber(final int number) {
        this.accountNumber = number;
    }
    /**
     * placeholder.
     */
    public double getAccountBalance() {
        return accountBalance;
    }
    /**
     * placeholder.
     * @param balance placeholder.
     */
    public void setAccountBalance(final double balance) {
        this.accountBalance = balance;
    }
    /**
     * placeholder.
     */

    public String getOwnerName() {
        return ownerName;
    }
    /**
     * placeholder.
     * @param name placeholder.
     */
    public void setOwnerName(final String name) {
        this.ownerName = name;
    }
    /**
     * placeholder.
     */
    public double getInterestEarned() {
        return interestEarned;
    }
    /**
     * placeholder.
     * @param rate placeholder.
     */
    public void setInterestRate(final double rate) {
        this.interestRate = rate;
    }
    /**
     * placeholder.
     */
    public BankAccountType getAccountType() {
        return accountType;
    }
    /**
     * placeholder.
     * @param type placeholder.
     */
    public void setAccountType(final BankAccountType type) {
        this.accountType = type;
    }
    /**
     * placeholder.
     */
    public double getInterestRate() {
        return interestRate;
    }
    /**
     * placeholder.
     * @param earned placeholder.
     */
    public void setInterestEarned(final double earned) {
        this.interestEarned = earned;
    }
}
