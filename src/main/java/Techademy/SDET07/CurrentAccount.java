package com.maven.SDET.maven;

public class CurrentAccount extends Account {
	
	private double overdraftLimit;

    public CurrentAccount(double balance, double interestRate, double overdraftLimit) {
        super(balance, interestRate);
        this.overdraftLimit = overdraftLimit;
    }
    
    @Override
    public void calculateInterest() {
        super.calculateInterest();
        if (balance < 0) {
            double overdraftInterest = Math.abs(balance) * interestRate / 100;
            System.out.println("Overdraft interest calculated and added to the account. Updated balance: " + balance);
        }
    }

}
