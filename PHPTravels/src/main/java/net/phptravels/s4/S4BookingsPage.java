package net.phptravels.s4;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class S4BookingsPage {

	WebDriver driver;
	public S4BookingsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="a.loadeffect:nth-child(6)")
	private WebElement dashboardBtn;
	public void setdashboardBtn() {
		dashboardBtn.click();
	}
	@FindBy(css=".col > div")
	private WebElement salesOverviewText;
	public String setsalesOverviewText() {
		return salesOverviewText.getText();
	}
	@FindBy(css=".col-lg-8 > div")
	private WebElement revenueBreakdown;
	public boolean setRevenueBreakChart() {
		return revenueBreakdown.isDisplayed();
	
	}
	
	@FindBy(css="a.nav-link:nth-child(12) > div:nth-child(1) > i")
	private WebElement toursMain;
	public void setToursManin() {
		
    	JavascriptExecutor js2 = (JavascriptExecutor) driver;
    	js2.executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent"
    				+ "('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" 
    			+ "arguments[0].dispatchEvent(evt);", toursMain);
	}
	
	@FindBy(css="#toursmodule > nav:nth-child(1) > a")
	private WebElement toursSub;
	public void setToursSub() {
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
    	js2.executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent"
    				+ "('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" 
    			+ "arguments[0].dispatchEvent(evt);", toursSub);
	}
	@FindBy(xpath="//*[text()='Manage Tours']")
	private WebElement ManageTours;
	public void setManageTours() {
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
    	js2.executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent"
    				+ "('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" 
    			+ "arguments[0].dispatchEvent(evt);", ManageTours);
	}
	
	@FindBy(css="li.nav-item:nth-child(2) > a")
	private WebElement BookingsBtn;
	public void setBookingsBtn() {
		BookingsBtn.click();
		
	}

	
}
