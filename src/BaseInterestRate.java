/**
 * Interface that represents Base Interest Rate for all bank accounts
 * <p>
 * Should have 2 methods:
 * <p>
 * getBaseInterestRate()
 * <p>
 * setInterestRate()
 */

public interface BaseInterestRate {


    /*
     *
     *This method returns the base interest rate set by the central bank
     * It must return the base interest rate of 2.5 %
     *
     */
    public double getBaseInterestRate(); //method definition and implementation goes here






    /*
     * this abstract method sets the specific interest rate for each account type
     *
     * Will be implemented by all concrete classes with class specific implementation
     *
     *
     *
     */

    //setInterestRate()  method definition goes here
     abstract void setInterestRate(double intRate);
}
