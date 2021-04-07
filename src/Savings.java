/**
 * 
 * A class that represents a Savings account
 * Must extend abstract Account class to inherit generic account properties and behaviors
 *
 */

public class Savings extends Account {


/*
	 * Declare the following fields for Savings account:
	 *
	 * savingsAccountID - represents savings account ID
	 * savingsAccountPin - represents savings account Pin
	 *
	 * Fields must be properly encapsulated
	 */

	//Field declarations go here

	private long savingsAccountID; //represents savings account ID
	private long savingsAccountPin; //represents savings account Pin


	/*
	 * Constructor that initializes Savings account object
	 *
	 * Besides calling its super class constructor, this constructor must do the following:
	 * - change accountNumber for Savings account by adding "2" before super class's accountNumber
	 * - initialize savingsAccountID  by generating 3-digit random number
	 * - initialize savingsAccountPin  by generating 4-digit random number
	 * - set the interest rate by calling setInterestRate() method
	 */

	public Savings(String name, String ssn) {
		super(name, ssn, "SAVING");
		this.savingsAccountID = (long) (Math.random() * 1000L);
		this.savingsAccountPin = (long) (Math.random() * 10000L);
		this.setInterestRate(2.5);
	}

	
	
	/*
	 * Override super class's showInfo() method by ADDING Savings account specific info
	 * such as account type, savingsAccountID, savingsAccountPin and interestRate
	 * 
	 * Ex:
	 * 	NAME: Arielle Duncan
		SSN: 444102638
		ACCOUNT NUMBER: 2263824734805
		BALANCE: 1000.0
		ACCOUNT TYPE: Savings
		SAVINGS ACCOUNT ID: 237
		SAVINGS ACCOUNT PIN: 4402
		INTEREST RATE: 2.25%
	 * 
	 */
	//showInfo() method definition and impementation goes here

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("SAVINGS ACCOUNT ID: " + savingsAccountID +
				"\nSAVINGS ACCOUNT PIN: " + savingsAccountPin +
				"\nInterest Rate of Checking account is: " + intRate);

	}

	/*
	 * Implement setInterestRate() method of BaseInterestRate interface
	 *
	 * Savings account interest rate must be set to 0.25% less the baseInterestRate declared in Account class
	 */
	// setInterestRate() method definition and implementation goes here

	protected String generateAccountnumber() {
		return "2" + super.generateAccountnumber();
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
		newRate = super.BaseIntRate -(super.BaseIntRate*0.2/100);
		intRate = newRate;
	}
	}
