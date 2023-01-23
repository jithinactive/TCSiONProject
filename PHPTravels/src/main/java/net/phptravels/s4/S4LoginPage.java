package net.phptravels.s4;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class S4LoginPage {

	WebDriver driver;
	public S4LoginPage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(css="#ACCOUNT")
	 private WebElement accntbtn;
	 public void AccntClick() {
		 accntbtn.click();
	 }
	 
	 @FindBy(css="ul.show > li:nth-child(8) > a")
	 private WebElement AdminLoginBtn;
	 public void setAdminLoginBtn() {
		 AdminLoginBtn.click();
	 }
	 public void setSwitchTab() throws InterruptedException {
		 ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		 driver.close();
		 driver.switchTo().window(tabs.get(1));
	 }
	 @FindBy(css=".form-signin > div:nth-child(1) > label:nth-child(1) > input")
	 private WebElement username;
	//Set user name in textbox
	 public void setUserName(String strUserName){
	 	username.sendKeys(strUserName);     
	 }
	 @FindBy(css="div.mb-2:nth-child(2) > label:nth-child(1) > input")
	 private WebElement password; 
	//Set password in password textbox
	 public void setPassword(String strPassword){
	    password.sendKeys(strPassword);
	 }
	 @FindBy(css=".btn-block")
	 private WebElement login;
	public void clickLogin() {
		// TODO Auto-generated method stub
		login.click();
	}
}
