package com.mule.custom.kcs;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class TransformMap {
	
	public String translate (String str) {
		return str + "xxx";
	}
	
	public String decode64 (String str) {
		return str + "yyy";
		//#[java.util.Base64.getDecoder().decode(payload.value)]
	}
	
	public HashMap doTransform(HashMap<String, String> items) {
	
		String key = "";
		String val = "";
		
		for (HashMap.Entry entry : items.entrySet()) {
			key = entry.getKey()+"";
			if (key.equals("id"))
				val = translate(entry.getValue()+"");
			if (key.equals("value"))
				val = decode64(entry.getValue()+"");
			
			items.put(key, val);
		}
		return items;
	}

}