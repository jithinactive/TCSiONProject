package phptravels.s1;

import org.testng.annotations.Test;

import net.phptravels.s1.AddFundsPage;
import phptravels.base.TestBase;

public class TestAddFund extends TestBase{

	AddFundsPage objFund;
	
	@Test(priority = 6)
	public void AddFund() throws InterruptedException {
		objFund = new AddFundsPage(driver);
		
		objFund.setAddFund();
		objFund.setPaypalRdBtn();
		objFund.setAmount();
		objFund.setPayBtn();
		//objFund.setPayNowBtn();
		objFund.setCancelPay();
	}
}
