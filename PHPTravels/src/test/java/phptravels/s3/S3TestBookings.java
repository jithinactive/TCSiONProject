package phptravels.s3;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import net.phptravels.s3.S3BookingsPage;
import phptravels.base.TestBase;

public class S3TestBookings extends TestBase{

	S3BookingsPage objbook;
	@Test(priority = 5)
	public void BookingsBtn() throws InterruptedException {
		objbook= new S3BookingsPage(driver);
		objbook.setBookingsBtn();
		Thread.sleep(3000);
	}
	@Test(priority = 6)
	public void BookVerificationTC006() throws InterruptedException {
		objbook= new S3BookingsPage(driver);
		String PaidBC=objbook.setPaidBookCount();
		String zero="0";
		
		if(PaidBC.contains(zero)) {
			System.out.println("***No Paid Bookings Found***");
		}
		else {	
			objbook.setPaidBook();
			Thread.sleep(2000);
			System.out.println("Paid Bookings Count: "+PaidBC);
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/main/div/div[2]"
					+ "/div/div/div[2]/div/table/tbody/tr[1]/td[14]/a")).click();
			ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
			Thread.sleep(2000);
			driver.switchTo().window(tabs.get(1));
			driver.close();
			 driver.switchTo().window(tabs.get(0));
			}
		}
	@Test(priority = 7)
	public void BookVerificationTC007() throws InterruptedException {
		String CancelBC=objbook.setCancelledBookCount();
		String zero="0";
		
		if(CancelBC.contains(zero)) {
			System.out.println("***No Cancelled Bookings Found***");
		}
		else {	
			objbook.setCancelledBook();
			System.out.println("Cancelled Bookings Count: "+CancelBC);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/main/div/div[2]"
					+ "/div/div/div[2]/div/table/tbody/tr/td[15]/button")).click();
		Thread.sleep(3000);
		// not deleting the booking, because other users need it
		driver.switchTo().alert().dismiss();
		}
	}
	@Test(priority = 8)
	public void BookVerificationTC008() throws InterruptedException {	
		String PendingBC=objbook.setPendingBookCount();
		String zero="0";
		
		if(PendingBC.contains(zero)) {
			System.out.println("***No Pending Bookings Found***");
		}
		else {	
			objbook.setPendingBook();
			System.out.println("Pending Bookings Count: "+PendingBC);
			Thread.sleep(3000);
			Select bookstat=new Select(driver.findElement(By.xpath("/html/body/div[2]/div[2]/main/div/div[2]"
					+ "/div/div/div[2]/div/table/tbody/tr[1]/td[11]/select")));
			bookstat.selectByVisibleText("Confirmed");
			Thread.sleep(2000);
			String ConfirmBC=objbook.setConfirmBookCount();
			System.out.println("Changed Confirmed Bookings Count: "+ConfirmBC);
		}
	}
	@Test(priority = 9,enabled = true)
	public void RevertChanges() throws InterruptedException {
		objbook= new S3BookingsPage(driver);
		String ConfirmedBC=objbook.setConfirmBookCount();
		String zero="0";
		if(ConfirmedBC.contains(zero)) {
			System.out.println("***No Confirmed Bookings Found***");
		}
		else {
			objbook.setConfirmBook();
			System.out.println("Confirmed Bookings Count: "+ ConfirmedBC);
			Thread.sleep(2000);
			Select confirmBookstat = new Select(driver.findElement(By.xpath("/html/body/div[2]/div[2]/main/div/div[2]"
					+ "/div/div/div[2]/div/table/tbody/tr[1]/td[11]/select")));
			confirmBookstat.selectByVisibleText("Pending");
		}
		
	}
	@Test(priority = 10)
	public void WebsiteLink() throws InterruptedException {
		objbook = new S3BookingsPage(driver);
		Thread.sleep(2000);
		objbook.setWebsiteLink();
		Thread.sleep(2000);
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		 driver.switchTo().window(tabs.get(1));
		Thread.sleep(2000);
		String HomTtle=driver.getTitle();
		System.out.println(HomTtle);
	}
	
}
