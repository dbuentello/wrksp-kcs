package com.mulesoft.custom.kcs;

import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;
import org.mule.api.transport.PropertyScope;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonDiff implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		// TODO Auto-generated method stub
		
	    MuleMessage msg = eventContext.getMessage();
	    String path1 = msg.getPayloadAsString();
	    String path2 = msg.getProperty("origPayload", PropertyScope.INVOCATION);

	    
		ObjectMapper mapper = new ObjectMapper();
		JsonNode obj1 = mapper.readValue(path1, JsonNode.class);
		JsonNode obj2 = mapper.readValue(path2, JsonNode.class);
		    
		return com.flipkart.zjsonpatch.JsonDiff.asJson(obj1, obj2);
	}

	
}
