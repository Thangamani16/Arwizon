package com.arwizon.banking.model;

public class CustomerDetails {
	private int account_Number;
		private static int count= 40;
	private String name;
	private  String address;
	private  String accountType;
	
	public CustomerDetails() {
		count++;
	}

	public static int getCount() {
		return count;
	}

	public int getAccount_Number() {
		return account_Number;
	}

	public  void setAccount_Number(int count) {
	 this.account_Number = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	@Override
	public String toString() {
		return "CustomerDetails [account_Number =" + account_Number+"name=" + name + ", address=" + address + ", accountType=" + accountType + "]";
	}

}