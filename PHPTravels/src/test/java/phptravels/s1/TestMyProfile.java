package phptravels.s1;

import java.io.IOException;

import org.testng.annotations.Test;
import net.phptravels.s1.MyProfilePage;
import net.phptravels.utilities.ExcelUtility;
import phptravels.base.TestBase;


public class TestMyProfile extends TestBase{

	MyProfilePage objprof;
	
	@Test(priority=7)
	public void Myprofile() throws IOException, InterruptedException {
		objprof= new MyProfilePage(driver);
		objprof.setMyProfileBtn();
		Thread.sleep(3000);
		
		String address1= ExcelUtility.getS1CellData(8, 0);
		String address2= ExcelUtility.getS1CellData(8, 1);
		String zip= ExcelUtility.getS1CellData(8, 2);
		String city= ExcelUtility.getS1CellData(8, 3);
		String state= ExcelUtility.getS1CellData(8, 4);
		
		objprof.setState(state);
		objprof.setCity(city);
		Thread.sleep(1000);
		objprof.setZip(zip);
		Thread.sleep(1000);
		objprof.setAdres1(address1);
		objprof.setAdres2(address2);
		objprof.setUpdProf();
		
	}
	
	@Test(priority=8)
	public void Logout() throws InterruptedException {
		objprof= new MyProfilePage(driver);
		objprof.setLogoutBtn();
		Thread.sleep(3000);
		String ActualTitle = driver.getTitle();
	    System.out.println(ActualTitle);
	}
}
