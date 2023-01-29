package phptravels.s1;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.*;

import net.phptravels.constants.AutomationConstants;
import net.phptravels.s1.LoginPage;
import net.phptravels.utilities.ExcelUtility;
import phptravels.base.TestBase;

public class LoginTest extends TestBase{

	
	LoginPage objLogin;
	@Test(priority = 0)
	public void loginpage() {
	  objLogin = new LoginPage(driver);
	  
	  objLogin.cookieClick();
	  objLogin.accntbtnclick();
	  objLogin.custloginclick();
	  
	}
	
	@Test(priority=1, enabled=true)
	public void invalidLoginTC001() throws IOException, InterruptedException {
		//Create Login Page object
	    objLogin = new LoginPage(driver);
	    String usrname= ExcelUtility.getS1CellData(1, 1);
	    String psswrd=ExcelUtility.getS1CellData(1, 2);
	    
	    objLogin.setEmail(usrname);
	    objLogin.setPass(psswrd);
	    objLogin.loginClick();
	    Thread.sleep(3000);
	   /* String ActualTitle = driver.getTitle();
	    System.out.println(ActualTitle);
	    String ExpTitle = 
	    */
	}
	
	@Test(priority=2, enabled=true)
	public void invalidLoginTC002() throws IOException, InterruptedException {
		objLogin = new LoginPage(driver);
		driver.navigate().refresh();
		
		String usrname = ExcelUtility.getS1CellData(2, 1);
		String psswrd = ExcelUtility.getS1CellData(2, 2);
		objLogin.setEmail(usrname);
		objLogin.setPass(psswrd);
		objLogin.loginClick();
		Thread.sleep(3000);
		
	
	}
	
	@Test(priority = 3, enabled = true)
	public void invalidLoginTC003() throws IOException, InterruptedException {
		objLogin = new LoginPage(driver);
		driver.navigate().refresh();
		
		String usrname= ExcelUtility.getS1CellData(3, 1);
	    String psswrd=ExcelUtility.getS1CellData(3, 2);
	    objLogin.setEmail(usrname);
	    objLogin.setPass(psswrd);
	    objLogin.loginClick();
	    Thread.sleep(3000);
	    
	}
	
	@Test(priority = 4, enabled = true)
	public void validLoginTC004() throws IOException, InterruptedException {
		objLogin = new LoginPage(driver);
		driver.navigate().refresh();
		
		String usrname= ExcelUtility.getS1CellData(4, 1);
	    String psswrd=ExcelUtility.getS1CellData(4, 2);
	    objLogin.setEmail(usrname);
	    objLogin.setPass(psswrd);
	    objLogin.loginClick();
	    Thread.sleep(3000);
	    String ActualURL = driver.getCurrentUrl();
	    System.out.println(ActualURL);
	    String expURL = AutomationConstants.DASHBOARDURL;
	    Assert.assertEquals(ActualURL, expURL);
	    System.out.println("***Login Successful***");
	}
	
}
