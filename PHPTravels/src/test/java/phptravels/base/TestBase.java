package phptravels.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop = null;
	
	//String driverPath1;
	//String driverPath2;
	
	public static void TestConfig(){
		
		
		    prop=new Properties();
		    
			FileInputStream ip;
				try {
					ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/" + "config.properties");
					prop.load(ip);
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
	}
	
	@BeforeTest
	public void onSetup() throws FileNotFoundException{
			TestConfig();
		
		String browserName = prop.getProperty("browser");
		//driverPath1 = System.getProperty("user.dir")+"/drivers/chromedriver.exe";
		//driverPath2 = System.getProperty("user.dir")+"/drivers/geckodriver.exe";
		
		if (browserName.equals("chrome")) {
			//System.setProperty("webdriver.chrome.driver", driverPath1);
			driver = new ChromeDriver();
					}
		
		else if (browserName.equals("firefox")) {
		//System.setProperty("webdriver.gecko.driver", driverPath2);
		driver = new FirefoxDriver();
		}
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@AfterMethod(enabled = true)
    public void tearDown(ITestResult iTestResult) throws IOException {
        if (iTestResult.FAILURE == iTestResult.getStatus()) {
            takeScreenshot(iTestResult.getName());
        }
    }
    public String takeScreenshot(String name) throws IOException {
    	
    	
    	/*Step 1) Convert web driver object to TakesScreenshot
          Step 2) Call getScreenshotAs method to create image file
          Step 3) Copy file to Desired Location*/
    	
        String dateName = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date());
    //Take the screenshot
        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        
        String destination =  System.getProperty("user.dir") + "\\screenshots\\" + name + dateName
                + ".png";
       
        File finalDestination = new File(destination);
     
        FileHandler.copy(source, finalDestination);
        //or FileUtils.copyFile import org.apache.commons.io.FileUtils;
        return destination;   
    }
    
	@AfterTest
	public void quitBrowser() throws Exception {
		Thread.sleep(10000);
		if(driver!=null) {
			driver.quit();
		}
	}
}
