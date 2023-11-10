package com.Learning.Browsers;

public class Browser1 {


public enum Browser {
	CHROME("chrome"),
	EDGE("edge"),
	FIREFOX("firefox"),
	SAFARI("safari");
	
	String browser;
	
	private Browser(String browser) {
		this.browser=browser;
		
	}
	
}
}
