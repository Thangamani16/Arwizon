package com.arwizon.service;

import com.arwizon.exception.UserException;

public class Utilities {

	public static void nameMatch(String name) throws UserException{
		String Pattern = "[A-Za-z]+";
		if(!name.matches(Pattern)) {
			throw new UserException("Only Alphabets Allowed");	
		}
	}
	public static void unitsMatch(String units) throws UserException{
		String Pattern = "[1-9]+";
		if(!units.matches(Pattern)) {
			throw new UserException("Stock can only be greater than zero");	
		}
	}
	public static void priceMatch(String price1) throws UserException{
		String Pattern = "[1-9]{1}[0-9]{2,}";
		if(!price1.matches(Pattern)) {
			throw new UserException("Numbers Allowed");	
		}
	}
	public static void discountMatch(String discount) throws UserException{
		String Pattern = "[1-9]{1}[0-9]{1}";
		if(!discount.matches(Pattern)) {
			throw new UserException("Numeric Valaues");	
		}
	}
	public static void urlMatch(String imgUrl) throws UserException {
		String Pattern = "(https){1}[a-zA-Z]{2,}[.]+[a-zA-z]{1,}(.com){1}";
		if(!imgUrl.matches(Pattern)) {
			throw new UserException("Url not valid");	
		}
	}
}
