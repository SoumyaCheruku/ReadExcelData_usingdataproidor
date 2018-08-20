package excel_testing.excel_testing;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Learnbase {
	public static WebDriver driver;
	@BeforeMethod
	public void start() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","//home//sbv6//Downloads//chromedriver");
	//System.setProperty("webdriver.gecko.driver","D:\\pro2\\Healthcare\\src\\main\\java\\com\\browsers\\geckodriver.exe");
	driver =  new ChromeDriver(); 
	driver.get("http://192.168.2.140:8282/thcm/");
	Actions act = new Actions(driver);
	Thread.sleep(3000);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	}
	
	
	/*@AfterMethod
	public void end() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}*/

}
