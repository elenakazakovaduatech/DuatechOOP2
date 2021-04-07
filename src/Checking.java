/**
 * A class that represents a Checking account
 * Must extend abstract Account class to inherit generic account properties and behaviors
 */


public class Checking extends Account {



    /*
     * Declare the following fields for Checking account:
     *
     * debitCardNo - represents a debit card number
     * debitCardPIN - represents a debit card pin
     *
     * Fields must be properly encapsulated
     */

    //Field declarations go here

    private long debitCardNo; //represents a debit card number
    private long debitCardPIN; //represents a debit card pin




	/*
	 * Constructor that initializes Checking account object
	 public Checking
	 * Besides calling its super class constructor, this constructor must do the following:
	 * - change accountNumber for Checking account by adding "1" before super class's accountNumber

	 * - initialize debitCardNo  by generating 16-digit random number
	 * - initialize debitCardPIN  by generating 4-digit random number
	 * - set the interest rate  by calling setInterestRate() method
	 */


    public Checking(String name, String ssn) {
        super(name, ssn, "CHECKING");
        this.debitCardNo = (long) (Math.random() * 10000000000000000L);
        this.debitCardPIN = (long) (Math.random() * 10000L);



    }
	
	/*
	 * Override super class's showInfo() method by ADDING Checking account specific info
	 * such as account type, debitCardNo, debitCardPIN and interestRate
	 * 
	 * Ex:
	 * 	NAME: Marybeth Sanders
		SSN: 431551383
		ACCOUNT NUMBER: 1138372589466
		BALANCE: 2500.0
		ACCOUNT TYPE: Checking
		DEBIT CARD NUMBER: 6804579327874081
		DEBIT CARD PIN: 8689
		INTEREST RATE: 0.375%
	 * 
	 */
    //showInfo() method definition and impementation goes here

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("DEBIT Card number: " + debitCardNo +
                "\nDEBIT Card PIN: " + debitCardPIN +
                "\nInterest Rate of Checking account is: " + intRate);

    }


    @Override
    protected String generateAccountnumber() {
        return "1" + super.generateAccountnumber();
    }

    @Override
    protected void setDeposit(double deposit) {
        super.setDeposit(deposit);
    }

    @Override
    public void setWithdrowal(double withdrowal) {
        super.setWithdrowal(withdrowal);
    }

    public void setInterestRate(double newRate) {
        newRate = (super.BaseIntRate * 15 / 100);
        intRate = newRate;
        {

        }

    }

}



        /*
         * Implement setInterestRate() method of BaseInterestRate interface
         *
         * Checking account interest rate must be set to 15% of the interestRate declared in Account class
         */
        // setInterestRate() method definition and implementation goes here



