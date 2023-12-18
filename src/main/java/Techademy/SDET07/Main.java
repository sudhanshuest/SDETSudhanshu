package com.maven.SDET.maven;

public class Main {

	public static void main(String[] args) {
		
		 // Testing SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount(1000, 5, 500);
        savingsAccount.calculateInterest();

        // Testing CurrentAccount
        CurrentAccount currentAccount = new CurrentAccount(-500, 3, 1000);
        currentAccount.calculateInterest();

	}

}
