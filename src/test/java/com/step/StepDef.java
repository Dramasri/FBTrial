package com.step;

import org.junit.Assert;

import com.pojo.POJO1;
import com.utility.Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDef extends Base {
	
	@Given("Launch the fb")
	public void launch_the_fb() {
		
		launch("https://www.facebook.com/");
	    
	}

	@When("Give the user name and password")
	public void give_the_user_name_and_password() {
		
		POJO1 pj = new POJO1();
		
		fill(pj.getUser(), "rama");
		
		fill(pj.getPwd(), "123456");
		
		clk(pj.getLogin());
	    
	}

	@Then("Click login button")
	public void click_login_button() {
		Assert.assertTrue(Hook.driver.getTitle().equals("Home"));
	}



}
