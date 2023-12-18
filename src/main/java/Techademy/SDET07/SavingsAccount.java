package com.maven.SDET.maven;

public class SavingsAccount extends Account {
	
	 private double minimumBalance;

	    public SavingsAccount(double balance, double interestRate, double minimumBalance) {
	        super(balance, interestRate);
	        this.minimumBalance = minimumBalance;
	    }

	    @Override
	    public void calculateInterest() {
	        super.calculateInterest();
	        if (balance < minimumBalance) {
	            System.out.println("Note: Minimum balance requirement not met.");
	        }
	    }

}
