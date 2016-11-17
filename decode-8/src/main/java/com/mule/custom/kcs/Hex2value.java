package com.mule.custom.kcs;

public class Hex2value {

	public String doTransform(int inInt) {
		String outStr = "";
		switch (inInt) {
			case 11: outStr = "Eleven";
				break;
			case 12: outStr = "Twelve";
				break;
			case 13: outStr = "Thirteen";
				break;
			case 14: outStr = "Fourteen";
				break;
			default: outStr = "empty";
			}
		return outStr;
	}
	
	public static String decimal2hex(int d) {
	    String digits = "0123456789abcdef";
	    if (d <= 0) return "0";
	    int base = 16;   // flexible to change in any base under 16
	    String header = "0000";
	    String hex = "";
	    while (d > 0) {
	        int digit = d % base;              // rightmost digit
	        hex = digits.charAt(digit) + hex;  // string concatenation
	        d = d / base;
	        header = header.substring(1);
	        
	    }
	    return "0x" + header + hex;
	}
}
