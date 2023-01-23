package net.phptravels.s2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S2Search {
	WebDriver driver;

	public S2Search(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);	
	}

	@FindBy(id="select2-hotels_city-container")
	private WebElement searchField;
	public void setSearchField() {
		searchField.click();
	}
	@FindBy(css=".select2-search__field")
	private WebElement searchText;
	public void setSearchText(String strCity) {
		searchText.sendKeys(strCity);
	}
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li[1]")
	private WebElement SearchSel;
	public void setSearchSel() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(SearchSel));
		SearchSel.click();	
	}

	@FindBy(id="submit")
	private WebElement searchBtn;
	public void setSearchBtn() {
		searchBtn.click();
	}

}
