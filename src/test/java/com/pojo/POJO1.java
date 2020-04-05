package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.step.Hook;

public class POJO1 {
	
	public POJO1() {
		
		
		PageFactory.initElements(Hook.driver, this);
		
	}
	
	
	
	@FindBy(id="email")
	
	private WebElement user;
	
	
	@FindBy(id="pass")
	
	private WebElement pwd;
	
	@FindBy(id="u_0_b")
	
	private WebElement login;


	public WebElement getLogin() {
		return login;
	}


	public WebElement getUser() {
		return user;
	}


	public WebElement getPwd() {
		return pwd;
	}
	
	

}
