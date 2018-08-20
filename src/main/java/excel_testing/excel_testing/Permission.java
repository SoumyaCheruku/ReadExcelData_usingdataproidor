package excel_testing.excel_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;



public class Permission extends Permissionbase {
	@Test(dataProvider="login")
	public void permission(String name, String status,String des) throws InterruptedException{
		driver.get("http://192.168.2.140:8282/thcm/PermissionTypeMaster");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='tableid']/div[2]/div[1]/div/button/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("pemissiontypenameId")).sendKeys(name);
		WebElement ele1 = driver.findElement(By.xpath("//*[@id='ddlstatus']"));
		ele1.sendKeys(status);
		Thread.sleep(1000);
		ele1.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.id("descriptionId")).sendKeys(des);
		Thread.sleep(1000);
		driver.findElement(By.id("btnsave")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[9]/div/div/div[2]/button[2]")).click();
		Thread.sleep(4000);
		
	}
	@DataProvider
	public Object[][] login() throws BiffException, IOException 
	{
		  Object [][]data= getExcelDat();
		  
		  return data;

	}
	private Object[][] getExcelDat() throws BiffException, IOException
	{
			FileInputStream fi= new FileInputStream("/home/sbv6/Desktop/Permission.xls");
			Workbook wb= Workbook.getWorkbook(fi);
			Sheet sh= wb.getSheet("data");
			String[][] arexceldada = new String[sh.getRows()][sh.getColumns()];
			for (int i = 0; i < sh.getRows(); i++) 
			{
				for (int j = 0; j < sh.getColumns(); j++) 
				{
					arexceldada[i][j]=sh.getCell(j, i).getContents();
				}
			}
			return arexceldada;
		}

}
