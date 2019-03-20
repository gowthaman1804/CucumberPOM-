package org.addcustomercucu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPom {
	public AddCustomerPom() {
		PageFactory.initElements(Base.driver,this);

}

@FindBy(id="fname")
private WebElement firstname;

@FindBy(id="lname")
private WebElement lastname;

@FindBy(id="email")
private WebElement emailid;

@FindBy(name="addr")
private WebElement address;

@FindBy(id="telephoneno")
private WebElement Phonenumber;

@FindBy(name="submit")
private WebElement submitbtn;

@FindBy(xpath="//input[@value='Reset']")
private WebElement resetbtn ;


public WebElement getFirstname() {
	return firstname;
}

public void setFirstname(WebElement firstname) {
	this.firstname = firstname;
}

public WebElement getLastname() {
	return lastname;
}

public void setLastname(WebElement lastname) {
	this.lastname = lastname;
}

public WebElement getEmailid() {
	return emailid;
}

public void setEmailid(WebElement emailid) {
	this.emailid = emailid;
}

public WebElement getAddress() {
	return address;
}

public void setAddress(WebElement address) {
	this.address = address;
}

public WebElement getPhonenumber() {
	return Phonenumber;
}

public void setPhonenumber(WebElement phonenumber) {
	Phonenumber = phonenumber;
}

public WebElement getSubmitbtn() {
	return submitbtn;
}

public void setSubmitbtn(WebElement submitbtn) {
	this.submitbtn = submitbtn;
}

public WebElement getResetbtn() {
	return resetbtn;
}

public void setResetbtn(WebElement resetbtn) {
	this.resetbtn = resetbtn;
}



}





