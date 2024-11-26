package accounts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class account {
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("balancs")
	private int balance;
	
	@JsonProperty("transaction")
	private transaction t;
	
	public account(String name, int balance, transaction t) {
		super();
		this.name = name;
		this.balance = balance;
		this.t = t;
	}
	public account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public transaction getT() {
		return t;
	}
	public void setT(transaction t) {
		this.t = t;
	}
	
	@Override
	public String toString() {
		return "account [name=" + name + ", balance=" + balance + ", t=" + t + "]";
	}
}
