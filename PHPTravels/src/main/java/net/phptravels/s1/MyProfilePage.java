package net.phptravels.s1;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyProfilePage {
	
	WebDriver driver;
	
	public MyProfilePage(WebDriver driver) {
        this.driver = driver;
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
		State.clear();
		State.sendKeys(strState);
	}
    
    @FindBy(css="input[name='city']")
	private WebElement city;
    public void setCity(String strCity) {
		city.clear();
		city.sendKeys(strCity);
	}

    @FindBy(css="input[name='address1']")
	private WebElement Adres1;
    public void setAdres1(String strAdres1) {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", Adres1);
		Adres1.clear();
		Adres1.sendKeys(strAdres1);
	}

    @FindBy(css="input[name='address2']")
	private WebElement Adres2;
    public void setAdres2(String strAdres2) {
		Adres2.clear();
		Adres2.sendKeys(strAdres2);
	}

    @FindBy(css = "input[name='zip']")
    private WebElement Zip;
    public void setZip(String strZip) {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", Zip);
		
		wait.until(ExpectedConditions.visibilityOf(Zip));
		Zip.clear();
		Zip.sendKeys(strZip);
	}
    
    @FindBy(css="button.theme-btn:nth-child(1)")
	private WebElement UpdProf;
    public void setUpdProf() {
		UpdProf.sendKeys(Keys.RETURN);
	}
    
  //LogOut case
	
  	@FindBy(css=".sidebar-menu > li:nth-child(5) > a")
  	private WebElement logoutBtn;
  	public void setLogoutBtn() {
  		logoutBtn.click();
  	}

    

}
