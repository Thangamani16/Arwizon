package com.arwizon.shopping.utilities;

import com.arwizon.shopping.exceptions.Myexceptions;

public class Utility {

	public static void namematch(String name) throws Myexceptions{
		String Pattern = "[A-Za-z]+";
		if(!name.matches(Pattern)) {
			throw new Myexceptions("Only Alphabets Allowed");	
		}
	}
	public static void urlmatch(String imgurl)throws Myexceptions{
		String Pattern = "(https){1}[a-zA-Z]{2,}[.]+[a-zA-z]{1,}(.com){1}";
		if(!imgurl.matches(Pattern)) {
			throw new Myexceptions("Url not valid");	
		}
	}
	public static void unitsmatch(String units) throws Myexceptions{
		String Pattern = "[1-9]+";
		if(!units.matches(Pattern)) {
			throw new Myexceptions("Stock can only be greater than zero");	
		}
	}
	
}