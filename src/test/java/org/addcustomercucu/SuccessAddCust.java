package org.addcustomercucu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuccessAddCust {
	
	public SuccessAddCust() {
		PageFactory.initElements(Base.driver, this);	
	}
	
	
	@FindBy(xpath="//table//tr[2]//b")
	private WebElement message;
	
	@FindBy(xpath="//table//tr[1]/td/h3")
	private WebElement customerNo;
	
	public WebElement getMessage() {
		return message;
	}

	public void setMessage(WebElement message) {
		this.message = message;
	}

	public WebElement getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(WebElement customerNo) {
		this.customerNo = customerNo;
	}


}
