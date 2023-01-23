package net.phptravels.s2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class S2LandingPage {
	WebDriver driver;

	@FindBy(css=".logo > a:nth-child(1) > img")
	private WebElement home;
	@FindBy(css=".active_hotels")
	private WebElement hotels;
	@FindBy(css=".active_flights")
	private WebElement flights;
	@FindBy(css=".active_tours")
	private WebElement tours;
	@FindBy(css=".active_visa")
	private WebElement visa;
	@FindBy(css=".active_blog")
	private WebElement blog;
	@FindBy(css=".active_offers")
	private WebElement offers;
	@FindBy(css="li.footm:nth-child(8) > a")
	private WebElement company;
	@FindBy(id="currency")
	private WebElement usd;
	@FindBy(css="ul.show > li:nth-child(7) > a")
	private WebElement Inr;
	
	  public S2LandingPage(WebDriver driver){
	        this.driver = driver;
	        //This initElements method will create all WebElements
	        PageFactory.initElements(driver, this);
	    }
	  
	  public void clickHome() {
		  home.click();
	  }
	  public void clickHotels() {
		  hotels.click();
	  }
	  public void clickFlights() {
		  flights.click();
	  }
	  public void clickTours() {
		  tours.click();
	  }
	  public void clickVisa() {
		  visa.click();
	  }
	  public void clickBlog() {
		  blog.click();
	  }
	  public void clickOffers() {
		  offers.click();
	  }
	  public void clickCompany() {
		  company.click();
	  }
	  
	  public void clickUsd() {
		  usd.click();
	  }
	  public void clickInr() {
		  Inr.click();
	  }
	  

}
