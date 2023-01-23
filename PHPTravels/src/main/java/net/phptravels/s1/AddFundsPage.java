package net.phptravels.s1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddFundsPage {

	WebDriver driver;
    public AddFundsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css="li.user_wallet > a")
    private WebElement addFundBtn;

    @FindBy(id="gateway_paypal")
    private WebElement paypalbtn;
    
    @FindBy(css="input.form-control:nth-child(2)")
	private WebElement Amount;

    @FindBy(css="button.btn:nth-child(3)")
    private WebElement paybtn;

    @FindBy(css=".paypal-button-label-container")
    private WebElement payclick;

    	public void setAddFund() {
    		addFundBtn.click();
    	}
    	public void setPaypalRdBtn() {
    		paypalbtn.click();
    	}
    	public void setAmount() {
    		Amount.clear();
    		Amount.sendKeys("50");
    	}
    	
    	public void setPayBtn() {
    		paybtn.click();
    	}
    	public void setPayNowBtn() {
    		payclick.click();
    	}
    	
    	@FindBy(css="#Layer_1")
    	private WebElement backToInvce;
    	public void setCancelPay() throws InterruptedException {
    		Thread.sleep(3000);
    		backToInvce.click();
    		driver.findElement(By.cssSelector("a[class='yes']")).click();

    		Thread.sleep(2000);

    	}
}
