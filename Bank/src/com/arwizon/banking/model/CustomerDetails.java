package com.arwizon.banking.model;

public class CustomerDetails {
	private static int account_Number;
	
	private String name;
	private  String address;
	private  String accountType;
	static {
		account_Number=999;
	}

	public CustomerDetails() {
		account_Number++;
	}

	public static int getAccount_Number() {
		return account_Number;
		
	}

	public static void setAccount_Number(int account_Number) {
		CustomerDetails.account_Number = account_Number;
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