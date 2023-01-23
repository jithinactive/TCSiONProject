package phptravels.s2;

import org.testng.annotations.Test;

import net.phptravels.s2.S2AddFundPage;
import net.phptravels.s2.S2BookingsPage;
import net.phptravels.s2.S2MyProfilePage;
import phptravels.base.TestBase;

public class S2sidebarLinks extends TestBase{

	S2BookingsPage objbookings;
	S2AddFundPage objfund;
	S2MyProfilePage objProfile;
	
	@Test(priority=5)
	public void sidebar() {
		objbookings= new S2BookingsPage(driver);
		objfund= new S2AddFundPage(driver);
		objProfile= new S2MyProfilePage(driver);
		
		objbookings.setBookinsBtn();
		objfund.setAddFund();
		objProfile.setMyProfileBtn();
		
	}
}
