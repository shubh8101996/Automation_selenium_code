package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseClass.Util;

public class Test2 extends Util {

	@Test(dataProvider = "excelData")
	public void test2(String name, String pass) throws IOException, InterruptedException {

		WebElement userID = driver.findElement(By.name("uid"));

		WebElement password = driver.findElement(By.name("password"));

		WebElement btn = driver.findElement(By.name("btnLogin"));

		userID.sendKeys(name);

		password.sendKeys(pass);

		btn.click();

		Thread.sleep(3000);
		
		

				

	}

    @DataProvider(name = "excelData")
	public static Object[][] readExcelData() throws IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\anant\\2023 new\\ProjectGuruSite\\TestData\\testdata.xlsx");

		Workbook workbook = new XSSFWorkbook(fis);

		Sheet sheet = workbook.getSheet("data");

		int rowCount = sheet.getPhysicalNumberOfRows();
		int colCount = sheet.getRow(0).getPhysicalNumberOfCells();

		Object[][] data = new Object[rowCount - 1][colCount]; // Assuming the first row is header

		for (int i = 1; i < rowCount; i++) { // Start from row 1 (skip header)
			Row row = sheet.getRow(i);
			for (int j = 0; j < colCount; j++) {
				Cell cell = row.getCell(j);
				DataFormatter formatter = new DataFormatter();
				data[i - 1][j] = formatter.formatCellValue(cell);
			}
		}

		workbook.close();
		fis.close();
		return data;
	}

}
