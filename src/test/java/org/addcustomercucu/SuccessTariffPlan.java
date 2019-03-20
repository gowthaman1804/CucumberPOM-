package org.addcustomercucu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuccessTariffPlan {
	public SuccessTariffPlan() {
		PageFactory.initElements(Base.driver,this);
}
	@FindBy(xpath="//div/h2")
	private WebElement successmessage;
	public WebElement getSuccessmessage() {
		return successmessage;
	}
	public void setSuccessmessage(WebElement successmessage) {
		this.successmessage = successmessage;
	}
	
	
	
	

}
