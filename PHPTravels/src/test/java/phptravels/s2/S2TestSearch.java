package phptravels.s2;

import org.testng.annotations.Test;

import net.phptravels.s2.S2Search;
import phptravels.base.TestBase;

public class S2TestSearch extends TestBase{
	
S2Search objSearch;
	
	@Test(priority = 14)
	public void search() throws InterruptedException {
		objSearch= new S2Search(driver);
		objSearch.setSearchField();
		objSearch.setSearchText("Dubai");
		Thread.sleep(2000);
		objSearch.setSearchSel();
		objSearch.setSearchBtn();
		
	}

}
