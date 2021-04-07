/**
 * Abstract class that represents a generic Bank Account
  
 * Must implement BaseInterestRate interface to obtain base interest rate and set interest rate for specific concrete classes
  *
 */

public abstract class Account implements BaseInterestRate{
	
	/*
	 * Declare the following fields:
	 * 
	 * name - represents an accountholder's full name
	 * ssn - represents an accountholder's ssn
	 * balance - represents the balance of the account
	 * accountNumber - represents the unique id of the account 
	 * interestRate - represents the base interest rate for all accounts 
	 */
	
	//Field declarations go here

	String name;
	String ssn;
	static double accountBalance;
	static String accNum;
	static double intRate =2.5;
	String accountType;
	protected double BaseIntRate = 23;

	
	
	
	/*Constructor to set all 5 fields
	 * 
	 *accountNumber field must be initialized by calling the generateAccountnumber() method
	 *
	 *interestRate  field must be initialized by calling the getBaseInterestRate() method of BaseInterestRate interface
	 *
	 */
	public Account(String name, String ssn, String acctType) {
		this.name = name;
		this.ssn = ssn;
		this.accountType = acctType;
		this.accNum = generateAccountnumber();
		this.intRate = getBaseInterestRate();
	}
	
	
	
	/*
	 * method to generate a generic Account number and to initialize accountNumber field in the constructor. 
	 * 
	 * It should be generated as:
	 * Last four digits of ssn + random 8 digit number
	 *  
	 * 
	 */
	protected String generateAccountnumber() {
	   //implementation goes here
		accNum = (ssn.substring(ssn.length()-4, ssn.length())) + ((int) (Math.random()*100000000));
		return accNum;
	}
	
	
	/*
	 * adds the given amount to the balance and prints out a message -> "YOUR BALANCE IS: " +  balance
	 */

	protected void setDeposit (double deposit) {
		accountBalance = accountBalance +deposit;
	}


	
	
	
	
	/*
	 * subtracts the given amount from the balance and prints out a message -> "YOUR BALANCE IS: " +  balance
	 * 
	 * if the amount that is being withdrawn is larger than the balance prints out a message -> "AMOUNT TO BE WITHDRAWN EXCEEDS THE BALANCE"
	 */
	public void setWithdrowal(double withdrowal) {
		//implementation goes here
		accountBalance = accountBalance - withdrowal;

	}
	
	
	


	/*
	 * Prints information about the account
	 * 
	 * Information should include name, ssn, accountNumber and balance printed on separate lines
	 * 	Ex:
	 * 	
	 * 	NAME: Arielle Duncan
		SSN: 444102638
		ACCOUNT NUMBER: 2263869065803
		BALANCE: 1000.0
	 */
	public void showInfo() {
		System.out.println("NAME: " +name +
				"\nSSN" + ssn +
				"\nACCOUNT NUMBER: " +accNum +
				"\nBALANCE: " + accountBalance +
				"\nACCOUNT TYPE: " + accountType);

	}


	@Override
	public double getBaseInterestRate() {
		return BaseIntRate;
	}



	@Override
	public void setInterestRate(double newRate) {
		intRate=newRate;
	}

	}
