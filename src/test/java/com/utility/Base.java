package com.utility;

import org.openqa.selenium.WebElement;

import com.step.Hook;


public class Base {
	
	public static void launch(String s) {
		
		Hook.driver.get(s);
		
	}
	
public static void fill(WebElement w , String s) {
	
	w.sendKeys(s);
	
	
	
}



public static void clk(WebElement w) {
	
	w.click();
	
	
}

}
