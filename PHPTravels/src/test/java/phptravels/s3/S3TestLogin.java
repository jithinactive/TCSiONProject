package phptravels.s3;

import java.io.IOException;
import org.testng.annotations.Test;

import net.phptravels.s3.S3LoginPage;
import net.phptravels.utilities.ExcelUtility;
import phptravels.base.TestBase;


public class S3TestLogin extends TestBase{

	S3LoginPage objlogin;
	
	
	@Test(priority=0)
	public void loginPage() throws InterruptedException {
		objlogin = new S3LoginPage(driver);
		driver.get("https://phptravels.net/admin");
		//objlogin.setAdminLoginBtn();
		//objlogin.setSwitchTab();
	}
	
	@Test(priority=1, enabled=true)
	public void invalidLoginTC001() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin = new S3LoginPage(driver);
//	    driver.navigate().refresh();
	    //login to application
	    String usrname= ExcelUtility.getS3CellData(1, 1);
	    String psswrd=ExcelUtility.getS3CellData(1, 2);
	    objlogin.setUserName(usrname);
	    objlogin.setPassword(psswrd);
	    objlogin.clickLogin();
	    Thread.sleep(3000);
	}
	@Test(priority=2,enabled=true)
	public void invalidLoginTC002() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin = new S3LoginPage(driver);
	    driver.navigate().refresh();
	    //login to application
	    String usrname= ExcelUtility.getS3CellData(2, 1);
	    String psswrd=ExcelUtility.getS3CellData(2, 2);
	    objlogin.setUserName(usrname);
	    objlogin.setPassword(psswrd);
	    objlogin.clickLogin();
	    Thread.sleep(3000);
	}
	@Test(priority=3,enabled=true)
	public void invalidLoginTC003() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin = new S3LoginPage(driver);
	    driver.navigate().refresh();
	    //login to application
	    String usrname= ExcelUtility.getS3CellData(3, 1);
	    String psswrd=ExcelUtility.getS3CellData(3, 2);
	    objlogin.setUserName(usrname);
	    objlogin.setPassword(psswrd);
	    objlogin.clickLogin();
	    Thread.sleep(3000);
	}
	@Test(priority=4)
	public void validLoginTC004() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin = new S3LoginPage(driver);
	    driver.navigate().refresh();
	    //login to application
	    String usrname= ExcelUtility.getS3CellData(4, 1);
	    String psswrd=ExcelUtility.getS3CellData(4, 2);
	    objlogin.setUserName(usrname);
	    objlogin.setPassword(psswrd);
	    objlogin.clickLogin();
	    Thread.sleep(5000);
	    System.out.println("***Login Successful***");
	}
}
