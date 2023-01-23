package net.phptravels.s2;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class S2LoginPage {

	WebDriver driver;
	public S2LoginPage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(css="#ACCOUNT")
	private WebElement accntbtn;
	public void setAccntBtn() {
		accntbtn.click();
	}
	
	@FindBy(css="ul.show > li:nth-child(4) > a")
	private WebElement AgentLoginBtn;
	 public void setAgentLoginBtn() {
		 AgentLoginBtn.click();
	 }
	 public void setSwitchTab() {
		 ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		 driver.close();
		 driver.switchTo().window(tabs.get(1));
	 }
	 
	@FindBy(css="input[placeholder='Email']")
    private WebElement username;
	public void setUserName(String strUserName){
	 	username.sendKeys(strUserName);     
	 }
	
    @FindBy(css="input[placeholder='Password']")
    private WebElement password; 
    public void setPassword(String strPassword){
        password.sendKeys(strPassword);
     }
    
    @FindBy(css=".btn-lg")
    private WebElement login;
    public void clickLogin() {
    	login.click();
    	
    }

    
    
}
