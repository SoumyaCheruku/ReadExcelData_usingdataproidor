package excel_testing.excel_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Permissionbase {
	public static WebDriver driver;
	@BeforeMethod
	public void start(){
		System.setProperty("webdriver.chrome.driver","//home//sbv6//Downloads//chromedriver");		
		driver =  new ChromeDriver(); 
		driver.get("http://192.168.2.140:8282/thcm/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='employeecode']")).sendKeys("1000");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Kishan@29");
		driver.findElement(By.xpath("//*[@id='loginid']/h4")).click();	
	}
	

}
