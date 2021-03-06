package com.bank.testcases;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.bank.base.*;
import com.bank.utility.*;

public class OpenAccountTest extends Baseclass {
	@Test(dataProviderClass=TestUtils.class,dataProvider="dp")
	public static void OpenAccountTest(String cust,String cur) {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"userSelect\"]")).click();
		Select customer=new Select(driver.findElement(By.xpath("//*[@id=\"userSelect\"]")));
		System.out.println("cust:"+cust);
		customer.selectByVisibleText(cust);
		driver.findElement(By.xpath("//*[@id=\"currency\"]"));
		Select currency=new Select(driver.findElement(By.xpath("//*[@id=\"currency\"]")));
		currency.selectByVisibleText(cur);
		System.out.println("cusr:"+cur);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/button")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}
	@Test(dataProviderClass=TestUtils.class,dataProvider="dp")
	public static void search(String name) throws InterruptedException {
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/button[3]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/form/div/div/input")).sendKeys(name);
	}
}
