package com.bank.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bank.base.*;
import com.bank.properties.*;
import com.bank.utility.TestUtils;

public class AddCustomerTest extends Baseclass{
	public static  ExcelReader excel;
	static int rows;
	static int cols;
	public static String e=Constant_info.Add_customer_excel_name;
	
	@Test(dataProviderClass=TestUtils.class,dataProvider="dp")
	public void AddCustomerTest(String fn,String ln,String pc) throws InterruptedException {
		 //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);

		 
		driver.findElement(By.xpath("//body/div/div/div/div/div/button[1]")).click();
		System.out.println("clicking add customer");
		Thread.sleep(3000);
		System.out.println(fn  +""+ln+""+pc);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys(fn);
		System.out.println("add first name customer"+fn);
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys(ln);
		System.out.println("add lastname name customer"+ln);
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys(pc);
		System.out.println("add pincode customer"+pc);
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/button")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
	
		
	}
	/*@DataProvider()
	public static Object[][] getData() {
		
		excel=new  ExcelReader(e);
		 rows=excel.getRowCount("Sheet1");
		 cols=excel.getColumnCount("Sheet1");
		 
	Object [][] data=new Object[rows-1][cols];
	for(int rowNum=2;rowNum<=rows;rowNum++) {
		for(int colNum=0;colNum<cols;colNum++) {
			
			data[rowNum-2][colNum]=excel.getCellData("Sheet1",colNum,rowNum);
			
		}
	}
return data;
	
	}*/

}
