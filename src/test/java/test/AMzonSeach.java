package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AMzonSeach {

	@Test
	void testSearch() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anant\\2023 new\\ProjectGuruSite\\BrowserDrivers\\chrome\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));

		searchBox.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		searchBox.sendKeys("laptop");
		searchBtn.click();

	}

}
