package com.javaex.ex08;

public class Account {

    private String accountNo;
    private int balance;
    
    //생성자 작성
    
    public Account () {
    	
    }
    
    public Account (String accountNo) {
    	
    	this.accountNo = accountNo;
    	
    }
    
    public void deposit(int money) {
    	
    	this.balance = balance + money;
    
    }
    
    public void withdraw(int money) {
    	
    	this.balance = balance - money;
    	
    }
    
    public void showBalance() {
    	System.out.println(this.balance);
    }
    
    
    
}
