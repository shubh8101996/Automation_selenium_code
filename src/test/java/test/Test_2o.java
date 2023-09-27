package test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.Util;

public class Test_2o extends Util {

	FileInputStream fis;
	Workbook workbook;
	Sheet sheet;

	@Test
	public void test1() throws IOException, InterruptedException {

		fis = new FileInputStream("C:\\Users\\anant\\2023 new\\ProjectGuruSite\\TestData\\testdata.xlsx");

		workbook = new XSSFWorkbook(fis);

		sheet = workbook.getSheet("data");

		WebElement userID = driver.findElement(By.name("uid"));

		WebElement password = driver.findElement(By.name("password"));

		WebElement btn = driver.findElement(By.name("btnLogin"));

		userID.sendKeys(sheet.getRow(1).getCell(0).toString());

		password.sendKeys(sheet.getRow(1).getCell(1).toString());

		btn.click();

		Thread.sleep(3000);

		Assert.assertEquals(driver.getTitle(), "Guru99 Bank Manager HomePage");

	}

	@Test
	public void test2() throws IOException, InterruptedException {

		fis = new FileInputStream("C:\\Users\\anant\\2023 new\\ProjectGuruSite\\TestData\\testdata.xlsx");

		workbook = new XSSFWorkbook(fis);

		sheet = workbook.getSheet("data");

		WebElement userID = driver.findElement(By.name("uid"));

		WebElement password = driver.findElement(By.name("password"));

		WebElement btn = driver.findElement(By.name("btnLogin"));

		userID.sendKeys(sheet.getRow(3).getCell(0).toString());

		password.sendKeys(sheet.getRow(3).getCell(1).toString());

		btn.click();

		Thread.sleep(3000);

		WebElement ManagerID = driver.findElement(By.xpath("//td[contains(text(),'mngr528304')]"));

		Assert.assertEquals(ManagerID.getText(), "mngr528304");

	}

	@Test
	public void test3() throws IOException, InterruptedException {

		fis = new FileInputStream("C:\\Users\\anant\\2023 new\\ProjectGuruSite\\TestData\\testdata.xlsx");

		workbook = new XSSFWorkbook(fis);

		sheet = workbook.getSheet("data");

		WebElement userID = driver.findElement(By.name("uid"));

		WebElement password = driver.findElement(By.name("password"));

		WebElement btn = driver.findElement(By.name("btnLogin"));

		userID.sendKeys(sheet.getRow(4).getCell(0).toString());

		password.sendKeys(sheet.getRow(4).getCell(1).toString());

		btn.click();

		Thread.sleep(3000);

		String exText = driver.switchTo().alert().getText();
		Assert.assertEquals(exText, "User or Password is not valid");
		driver.switchTo().alert().accept();
	}

	@Test
	public void test4() throws IOException, InterruptedException {

		fis = new FileInputStream("C:\\Users\\anant\\2023 new\\ProjectGuruSite\\TestData\\testdata.xlsx");

		workbook = new XSSFWorkbook(fis);

		sheet = workbook.getSheet("data");

		WebElement userID = driver.findElement(By.name("uid"));

		WebElement password = driver.findElement(By.name("password"));

		WebElement btn = driver.findElement(By.name("btnLogin"));

		userID.sendKeys(sheet.getRow(2).getCell(0).toString());

		password.sendKeys(sheet.getRow(2).getCell(1).toString());

		btn.click();

		Thread.sleep(3000);

		String exText = driver.switchTo().alert().getText();
		Assert.assertEquals(exText, "User or Password is not valid");
		driver.switchTo().alert().accept();
	}

}
