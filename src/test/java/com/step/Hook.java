package com.step;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;



public class Hook {
	
	public static WebDriver driver;
	
	
	@Before
	
	
	public static void befr() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Photon\\FaceBookTrial\\Chromed\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		
	}
	
	
	
	@After
	
	public static void aftr() {
		
		
		driver.quit();
		
	}

}
