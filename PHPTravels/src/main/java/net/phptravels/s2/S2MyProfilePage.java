package net.phptravels.s2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class S2MyProfilePage {

WebDriver driver;
	
	public S2MyProfilePage(WebDriver driver){
		this.driver = driver;
			//This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".sidebar-menu > li:nth-child(4) > a")
	private WebElement MyProfileBtn;
	public void setMyProfileBtn() {
		MyProfileBtn.click();
	}
	
	@FindBy(css="input[name='state']")
	private WebElement State;
	public void setState(String strState) {
		State.sendKeys(strState);
	}

	@FindBy(css="input[name='city']")
	private WebElement city;
	public void setCity(String strCity) {
		city.sendKeys(strCity);
	}
	
	@FindBy(css="input[name='zip']")
	private WebElement Zip;
	public void setZip(String strZip) {
		Zip.sendKeys(strZip);
	}
	
	@FindBy(css="input[name='address1']")
	private WebElement Adres1;
	public void setAdres1(String strAdres1) {
		Adres1.sendKeys(strAdres1);
	}
	
	@FindBy(css="input[name='address2']")
	private WebElement Adres2;
	public void setAdres2(String strAdres2) {
		Adres2.sendKeys(strAdres2);
	}
	
	@FindBy(css="button.theme-btn:nth-child(1)")
	private WebElement UpdProf;
	public void setUpdProf() {
		UpdProf.click();
	}
	
	//LogOut case
	
	@FindBy(css=".sidebar-menu > li:nth-child(5) > a")
	private WebElement logoutBtn;
	public void setLogoutBtn() {
		logoutBtn.click();
	}
}
