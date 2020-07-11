package com.bankAccount;
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// create a Scanner object to obtain input from the command window
	/*	Scanner input = new Scanner(System.in);
		
        //create an Account object and assign it to myAccount
		Account myAccount = new Account();
		
		//display initial value of name (null)
		System.out.printf("Initial name is : %s%n%n", myAccount.getName());
		
		//prompt for and read name
		System.out.println("Please enter the name: ");
		String theName = input.nextLine();	// read a line of text
		myAccount.setName(theName);  // put theName in myAccount
		System.out.println();  //output a blank line
		
		//display the name store in object myAccount
		System.out.printf("Name in object myAccount is : %n%s%n", myAccount.getName());*/
		
		//create two Account objects
		Account account1 = new Account("Jane Green");
		Account account2 = new Account("John Blue");
		
		//display initial value of name for each Account
		System.out.printf("sccount1 name is : %s%n", account1.getName());
		System.out.printf("sccount2 name is : %s%n", account2.getName());
		}

}// end class AccountTest
