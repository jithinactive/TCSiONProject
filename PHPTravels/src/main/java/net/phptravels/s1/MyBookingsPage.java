package net.phptravels.s1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyBookingsPage {

	WebDriver driver;
    public MyBookingsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css=".sidebar-menu > li:nth-child(2) > a")
    private WebElement myBooking;

    @FindBy(css=".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(5) > div:nth-child(1) > a")
    private WebElement viewVoucher;
    
    @FindBy(css="div.col-md-6:nth-child(1) > ul")
	private WebElement VouchrConfirm;
    
    public void setBookingsBtn() {
   	 myBooking.click();
    }
    public void setViewVouchrBtn() {
   	 viewVoucher.click();
    }
    public String setVouchrConfirm() {
   	 
   	 return VouchrConfirm.getText();

    }
}
