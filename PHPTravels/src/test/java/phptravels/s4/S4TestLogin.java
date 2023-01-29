package phptravels.s4;

import java.io.IOException;

import org.testng.annotations.Test;

import net.phptravels.s4.S4LoginPage;
import net.phptravels.utilities.ExcelUtility;
import phptravels.base.TestBase;


public class S4TestLogin extends TestBase{

	S4LoginPage objlogin;
	@Test(priority=0)
	public void loginPage() throws InterruptedException {
		objlogin = new S4LoginPage(driver);
		objlogin.AccntClick();
		objlogin.setAdminLoginBtn();
		objlogin.setSwitchTab();
	}
	@Test(priority=1, enabled=true)
	public void invalidLoginTC001() throws IOException, InterruptedException {
		
	    objlogin = new S4LoginPage(driver);
   
	    String usrname= ExcelUtility.getS4CellData(1, 1);
	    String psswrd=ExcelUtility.getS4CellData(1, 2);
	    objlogin.setUserName(usrname);
	    objlogin.setPassword(psswrd);
	    objlogin.clickLogin();
	    Thread.sleep(3000);
	    String ActualTittle = driver.getTitle();
	    System.out.println(ActualTittle);
	}
	@Test(priority=2,enabled=true)
	public void invalidLoginTC002() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin = new S4LoginPage(driver);
	    driver.navigate().refresh();
	    //login to application
	    String usrname= ExcelUtility.getS4CellData(2, 1);
	    String psswrd=ExcelUtility.getS4CellData(2, 2);
	    objlogin.setUserName(usrname);
	    objlogin.setPassword(psswrd);
	    objlogin.clickLogin();
	    Thread.sleep(3000);
	    String ActualTittle = driver.getTitle();
	    System.out.println(ActualTittle);
	}
	@Test(priority=3,enabled=true)
	public void invalidLoginTC003() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin = new S4LoginPage(driver);
	    driver.navigate().refresh();
	    //login to application
	    String usrname= ExcelUtility.getS4CellData(3, 1);
	    String psswrd=ExcelUtility.getS4CellData(3, 2);
	    objlogin.setUserName(usrname);
	    objlogin.setPassword(psswrd);
	    objlogin.clickLogin();
	    Thread.sleep(3000);
	    String ActualTittle = driver.getTitle();
	    System.out.println(ActualTittle);
	}
	@Test(priority=4)
	public void validLoginTC004() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin = new S4LoginPage(driver);
	    driver.navigate().refresh();
	    //login to application
	    String usrname= ExcelUtility.getS4CellData(4, 1);
	    String psswrd=ExcelUtility.getS4CellData(4, 2);
	    objlogin.setUserName(usrname);
	    objlogin.setPassword(psswrd);
	    objlogin.clickLogin();
	    Thread.sleep(5000);
	    String ActualTittle = driver.getTitle();
	    System.out.println(ActualTittle);
	    System.out.println("***Login Successful***");
	}

	
}
