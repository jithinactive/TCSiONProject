package net.phptravels.s1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	/* Finding elements by Page Factory method*/
	
	@FindBy(id="cookie_stop")
	private WebElement cookie;
	public void cookieClick() {
		cookie.click();
	}
	
	@FindBy(css="#ACCOUNT")
	private WebElement accntbtn;
	public void accntbtnclick() {
		accntbtn.click();
	}
	
	@FindBy(css="ul.show > li:nth-child(1) > a")
	private WebElement custlogin;
	public void custloginclick() {
		custlogin.click();
	}
	
	@FindBy(css="div.modal-body:nth-child(2) > div:nth-child(1) > form:nth-child(2) > div:nth-child(1) > div:nth-child(2) > input")
	private WebElement custEmail;
	public void setEmail(String strEmail) {
		custEmail.sendKeys(strEmail);
	}
	
	@FindBy(css=".mb-2 > input")
	private WebElement custPass;
	public void setPass(String strPass) {
		custPass.sendKeys(strPass);
	}
	
	@FindBy(css="button.btn-lg")
	private WebElement loginbtn;
	public void loginClick() {
		loginbtn.click();
	}
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
