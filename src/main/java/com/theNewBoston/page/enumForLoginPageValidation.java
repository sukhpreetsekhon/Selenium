package com.theNewBoston.page;

public enum enumForLoginPageValidation {
	
	VALUE("value"),ID("id"),NAME("email");
	
	private final String attribute;
	
	private enumForLoginPageValidation(String setAttribute){
		
		this.attribute = setAttribute;
	}
	
	public String getAttribute()
	{
		return attribute;
	}

}
