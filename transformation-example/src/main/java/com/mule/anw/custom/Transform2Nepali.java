package com.mule.anw.custom;

public class Transform2Nepali {

	public String doTransform(String inStr) {
		String outStr = "";
		switch (inStr) {
			case "one": outStr = "ek";
				break;
			case "two": outStr = "dui";
				break;
			case "three": outStr = "tin";
				break;
			case "four": outStr = "chaar";
				break;
			}
		return outStr;
	}
}
