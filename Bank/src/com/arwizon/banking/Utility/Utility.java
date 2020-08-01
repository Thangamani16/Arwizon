package com.arwizon.banking.Utility;

import com.arwizon.banking.exceptions.Myexceptions;

public class Utility {

	public static void namematch(String name) throws Myexceptions{
		String Pattern = "[A-Za-z]+";
		if(!name.matches(Pattern)) {
			throw new Myexceptions("Only Alphabets Allowed");	
		}
	}
}