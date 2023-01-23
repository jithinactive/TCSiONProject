package phptravels.s2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import net.phptravels.s2.S2LoginPage;
import net.phptravels.utilities.ExcelUtility;
import phptravels.base.TestBase;


public class S2TestLogin extends TestBase{

	S2LoginPage objlogin;
	@Test(priority=0)
	public void loginPage() throws InterruptedException {
		objlogin = new S2LoginPage(driver);
		objlogin.setAccntBtn();
		objlogin.setAgentLoginBtn();
		objlogin.setSwitchTab();
		Thread.sleep(3000);
		driver.findElement(By.id("cookie_stop")).click();
	}
	
	@Test(priority=1, enabled=true)
	public void invalidLoginTC001() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin = new S2LoginPage(driver);
//	    driver.navigate().refresh();
	    //login to application
	    String usrname= ExcelUtility.getS2CellData(1, 1);
	    String psswrd=ExcelUtility.getS2CellData(1, 2);
	    objlogin.setUserName(usrname);
	    objlogin.setPassword(psswrd);
	    objlogin.clickLogin();
	    Thread.sleep(3000);
  }
	
	@Test(priority=2,enabled=true)
	public void invalidLoginTC002() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin = new S2LoginPage(driver);
	    driver.navigate().refresh();
	    //login to application
	    String usrname= ExcelUtility.getS2CellData(2, 1);
	    String psswrd=ExcelUtility.getS2CellData(2, 2);
	    objlogin.setUserName(usrname);
	    objlogin.setPassword(psswrd);
	    objlogin.clickLogin();
	    Thread.sleep(3000);
	}
	
	@Test(priority=3,enabled=true)
	public void invalidLoginTC003() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin = new S2LoginPage(driver);
	    driver.navigate().refresh();
	    //login to application
	    String usrname= ExcelUtility.getS2CellData(3, 1);
	    String psswrd=ExcelUtility.getS2CellData(3, 2);
	    objlogin.setUserName(usrname);
	    objlogin.setPassword(psswrd);
	    objlogin.clickLogin();
	    Thread.sleep(3000);
	}
	
	@Test(priority=4)
	public void validLoginTC004() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin = new S2LoginPage(driver);
	    driver.navigate().refresh();
	    //login to application
	    String usrname= ExcelUtility.getS2CellData(4, 1);
	    String psswrd=ExcelUtility.getS2CellData(4, 2);
	    objlogin.setUserName(usrname);
	    objlogin.setPassword(psswrd);
	    objlogin.clickLogin();
	    Thread.sleep(3000);
	    System.out.println("***Login Successful***");
	}
	
	
}