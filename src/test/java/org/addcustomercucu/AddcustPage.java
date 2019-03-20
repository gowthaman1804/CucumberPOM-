package org.addcustomercucu;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AddcustPage {
	WebDriver driver;
	
	@Given("The user is in add customer page")
	public void the_user_is_in_add_customer_page() {
		Base base = new Base();
		base.getdriver();
		base.loadurl("http://demo.guru99.com/telecom/addcustomer.php");
	    
	}

	@When("The user fill in the customer details")
	public void the_user_fill_in_the_customer_details() {
		AddCustomerPom cust= new AddCustomerPom();
		cust.getFirstname().sendKeys("Gouthaman");
		cust.getLastname().sendKeys("Manohar");
		cust.getEmailid().sendKeys("gouthaman@gmail.com");
		cust.getAddress().sendKeys("Vellore");
		cust.getPhonenumber().sendKeys("1234567890");
		
	}

	@When("The user clicks the submit button")
	public void the_user_clicks_the_submit_button() {
		AddCustomerPom cust= new AddCustomerPom();
		cust.getSubmitbtn().click();
	}

	@Then("The user should see the success message")
	public void the_user_should_see_the_success_message() {
		SuccessAddCust succ= new SuccessAddCust();
		Assert.assertEquals("Please Note Down Your CustomerID", succ.getMessage().getText());
	}

	@Then("The user should see the customer ID")
	public void the_user_should_see_the_customer_ID() {
		SuccessAddCust succ= new SuccessAddCust();
		Assert.assertTrue(succ.getCustomerNo().isDisplayed());
	}



}
