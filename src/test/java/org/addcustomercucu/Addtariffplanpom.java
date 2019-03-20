package org.addcustomercucu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtariffplanpom {
	public Addtariffplanpom() {
		PageFactory.initElements(Base.driver, this);
}
	@FindBy(id="rental1")
	private WebElement monthlyrental;
	@FindBy(id="inter_minutes")
	private WebElement freeinternationalminutes;
	@FindBy(id="sms_pack")
	private WebElement freesmspack;
	@FindBy(id="minutes_charges")
	private WebElement localperminute;
	@FindBy(id="inter_charges")
	private WebElement internationalperminutescharges;
	@FindBy(id="sms_charges")
	private WebElement smscharges;
	@FindBy(name="submit")
	private WebElement submitbtn;
	@FindBy(xpath="//input[@value='Reset']")
	private WebElement resetbtn;
	public WebElement getMonthlyrental() {
		return monthlyrental;
	}
	public void setMonthlyrental(WebElement monthlyrental) {
		this.monthlyrental = monthlyrental;
	}
	public WebElement getFreelocalminutes() {
		return freelocalminutes;
	}
	public void setFreelocalminutes(WebElement freelocalminutes) {
		this.freelocalminutes = freelocalminutes;
	}
	public WebElement getFreeinternationalminutes() {
		return freeinternationalminutes;
	}
	public void setFreeinternationalminutes(WebElement freeinternationalminutes) {
		this.freeinternationalminutes = freeinternationalminutes;
	}
	public WebElement getFreesmspack() {
		return freesmspack;
	}
	public void setFreesmspack(WebElement freesmspack) {
		this.freesmspack = freesmspack;
	}
	public WebElement getLocalperminute() {
		return localperminute;
	}
	public void setLocalperminute(WebElement localperminute) {
		this.localperminute = localperminute;
	}
	public WebElement getInternationalperminutescharges() {
		return internationalperminutescharges;
	}
	public void setInternationalperminutescharges(WebElement internationalperminutescharges) {
		this.internationalperminutescharges = internationalperminutescharges;
	}
	public WebElement getSmscharges() {
		return smscharges;
	}
	public void setSmscharges(WebElement smscharges) {
		this.smscharges = smscharges;
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
	@FindBy(id="local_minutes")
	private WebElement freelocalminutes;
	
	
}

