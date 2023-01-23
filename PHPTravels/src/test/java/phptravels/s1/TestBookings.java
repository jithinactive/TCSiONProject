package phptravels.s1;

import java.util.ArrayList;

import org.testng.annotations.Test;
import net.phptravels.s1.MyBookingsPage;
import phptravels.base.TestBase;

public class TestBookings extends TestBase{
	
	MyBookingsPage objbookings;
	LoginTest objlogin;
	
	@Test(priority=5)
	public void bookingsPage() throws InterruptedException{
	
		objbookings = new MyBookingsPage(driver);
		objbookings.setBookingsBtn();
		objbookings.setViewVouchrBtn();
		
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		 driver.switchTo().window(tabs.get(1));
		 Thread.sleep(3000);
		 String Customer=objbookings.setVouchrConfirm();
		 System.out.println(Customer);
		 boolean c=Customer.contains("user@phptravels.com");
		 System.out.println("***Is customer data contains email id :"+ c);
		 driver.close();
		 driver.switchTo().window(tabs.get(0));
	}

}
