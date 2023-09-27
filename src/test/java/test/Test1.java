package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.Util;

public class Test1 extends Util {

	@Test
	public void test1() throws InterruptedException {

		WebElement userID = driver.findElement(By.name("uid"));

		WebElement password = driver.findElement(By.name("password"));

		WebElement btn = driver.findElement(By.name("btnLogin"));

		userID.sendKeys(userName);

		password.sendKeys(passWord);

		btn.click();
		
		Thread.sleep(3000);
		
		Assert.assertEquals(driver.getTitle(), "Guru99 Bank Manager HomePage");

	}

}
