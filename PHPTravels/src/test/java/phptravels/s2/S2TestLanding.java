package phptravels.s2;

import org.testng.annotations.Test;

import net.phptravels.s2.S2LandingPage;
import phptravels.base.TestBase;

public class S2TestLanding extends TestBase {

	S2LandingPage objlandg;
	@Test(priority=5)
	public void verifyhome() {
		objlandg= new S2LandingPage(driver);
		objlandg.clickHome();
//		String expectedTitle =AutomationConstants.HOME_PAGE_TITLE;
//	    String actualTitle = driver.getTitle();
//	    Assert.assertEquals(expectedTitle,actualTitle);
	}
	@Test(priority=6)
	public void verifyhotels() {
		objlandg= new S2LandingPage(driver);
		objlandg.clickHotels();
	}
	@Test(priority=7)
	public void verifyflights() {
		objlandg= new S2LandingPage(driver);
		objlandg.clickFlights();
	}
	@Test(priority=8)
	public void verifytours() {
		objlandg= new S2LandingPage(driver);
		objlandg.clickTours();
	}
	@Test(priority=9)
	public void verifyvisa() {
		objlandg= new S2LandingPage(driver);
		objlandg.clickVisa();
	}
	@Test(priority=10)
	public void verifyblog() {
		objlandg= new S2LandingPage(driver);
		objlandg.clickBlog();
	}
	@Test(priority=11)
	public void verifyoffers() {
		objlandg= new S2LandingPage(driver);
		objlandg.clickOffers();
	}
	@Test(priority=12)
	public void verifycompany() {
		objlandg= new S2LandingPage(driver);
		objlandg.clickCompany();
	}
	
	@Test(priority=13)
	public void verifyusd() {
		objlandg= new S2LandingPage(driver);
		objlandg.clickUsd();
		objlandg.clickInr();
	}
	
	
}
