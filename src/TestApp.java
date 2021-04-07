import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * This Runner class is used to obtain customer information from a text file 
 * and create multiple bank accounts based on it and display information about them
 * 
 *
 */

public class TestApp {

	public static void main(String[] args) {


//		Checking ch = new Checking("Elena Kazakova", "23849999773");
//		ch.setDeposit(5360.34);
//		ch.setWithdrowal(60.34);
//		ch.showInfo();
//		System.out.println("--------------------------------------------------------");
//		Savings sv = new Savings("Test Testovich", "2346513222245");
//		sv.setDeposit(6000.13);
//		sv.showInfo();
//
//	}


		List<String> accountsList = new ArrayList<>(Arrays.asList("Checking", "Saving", "Investment"));
		List<String> customersList = new ArrayList<>();
		customersList.add("Elena Kazakova");

//			//1. Create a List of Accounts and initialize it  //Use ArrayList

//
//
//		}


		//2. Create a List of customers
		//Read new account holder information from a file customers.txt by calling the utility method readFromAFile()
		//and store it into a List of String arrays (String[])


		//3. Add new accounts to List of Accounts
		//Loop through the List of customers and get the information for each new customer (name, ssn, accountType, initialBalance )
		// and create a new Savings or Checking account based on the accountType and add that new Account to the
		// List of Accounts


		//4. Loop through the List of Accounts and
		// call showInfo() method on each account to display info about each created account


	}
}