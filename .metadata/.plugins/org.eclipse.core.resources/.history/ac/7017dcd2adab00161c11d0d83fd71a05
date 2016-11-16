package com.mule.custom.kcs;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class TransformMap {
	
	public String translate (String str) {
		return str + "def";
	}
	
	public String decode64 (String str) {
		return str + "abc";
		//#[java.util.Base64.getDecoder().decode(payload.value)]
	}
	
	public HashMap doTransform(HashMap<String, String> items) {
	
		String key;
		String val;
		
		for (HashMap.Entry entry : items.entrySet()) {
			key = translate(entry.getKey() + "");
			val = decode64(entry.getValue() + "");

			items.put(key, val);
		}
		return items;
	}

}
