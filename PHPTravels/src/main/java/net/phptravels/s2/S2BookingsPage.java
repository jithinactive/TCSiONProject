package net.phptravels.s2;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class S2BookingsPage {

	WebDriver driver;
	 
	@FindBy(css=".sidebar-menu > li:nth-child(2) > a")
	private WebElement bookingsBtn;
	@FindBy(css=".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(5) > div:nth-child(1) > a")
	private WebElement VewVouchrBtn;
	@FindBy(css="div.col-md-6:nth-child(1) > ul")
	private WebElement VouchrConfirm;
	
	
 public S2BookingsPage(WebDriver driver){
	 this.driver = driver;
	  //This initElements method will create all WebElements
	 PageFactory.initElements(driver, this);
	    }
 public void setBookinsBtn() {
	 bookingsBtn.click();
 }
 public void setVewVouchrBtn() {
	 VewVouchrBtn.click();
 }
 public void setVouchrConfirm() {
	 ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	 driver.switchTo().window(tabs.get(1));
	 String Customer=VouchrConfirm.getText();
	 System.out.println(Customer);
	 boolean c=Customer.contains("user@phptravels.com");
	 System.out.println("***Is customer data contains email id :"+ c);
 }
}
