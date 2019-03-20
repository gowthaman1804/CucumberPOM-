package org.addcustomercucu;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AddTariffPlan {
	
	 WebDriver driver;
	@Given("The user is in add tariif plan page")
	public void the_user_is_in_add_tariif_plan_page() {
	    Base base=new Base();
	    base.getdriver();
	    base.loadurl("http://demo.guru99.com/telecom/addtariffplans.php");	
	    }

	@When("The user fill the details in tariff plan")
	public void the_user_fill_the_details_in_tariff_plan() {
		Addtariffplanpom pom=new Addtariffplanpom();
		pom.getMonthlyrental().sendKeys("8000");
		pom.getFreelocalminutes().sendKeys("1000");
		pom.getFreeinternationalminutes().sendKeys("600");
		pom.getFreesmspack().sendKeys("300");
		pom.getLocalperminute().sendKeys("1");
		pom.getInternationalperminutescharges().sendKeys("10");
		pom.getSmscharges().sendKeys("3");
		
	}

	@When("The user click the submit button")
	public void the_user_click_the_submit_button() {
		Addtariffplanpom sub=new Addtariffplanpom();
		sub.getSubmitbtn().click();
	}

	@Then("The user should see the success msg")
	public void the_user_should_see_the_success_msg() {
		SuccessTariffPlan msg=new SuccessTariffPlan();
	Assert.assertEquals("Congratulation you add Tariff Plan",msg.getSuccessmessage().getText() );
	}
	}
	
