package ir.isc.training;

import java.util.Date;
import java.text.*;
public class account {
	
	private int balance;
	private String branch;
	private boolean lock;
	private  String lasttrasaction;
	
	public account(int balance) {
		super();
		this.balance = balance;
	}
	public account(int balance, String branch) {
		super();
		this.balance = balance;
		this.branch = branch;
	}

	
	public void print() {
		System.out.println("balance is "+ this.balance);
		System.out.println("branch is "+ this.branch);
		System.out.println("lasttrasaction in "+ this.lasttrasaction);
		
	}
	
	public void withdrawal(int number) {
		if (number>this.balance) {
			System.out.println(number + " is more than the account balance!");
		}
		else 
		{
			Date date = new Date();
			SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
			this.balance-=number;
			lasttrasaction=ft.format(date);
			
		}
	}
	
	
	

}
