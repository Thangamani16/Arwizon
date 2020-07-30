package com.arwizon.shopping.exceptions;

public class Myexceptions extends Exception{
	String detailmsg;
	public Myexceptions(String msg) {
		this.detailmsg = msg;
	}
	public String getMessage()
	{
		return detailmsg;
	}
}
