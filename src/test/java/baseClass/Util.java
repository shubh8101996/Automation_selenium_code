package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Util {

	public WebDriver driver;
	public String userName = "mngr528304";
	public String passWord = "ebaveba";

	@BeforeMethod
	public void init() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anant\\2023 new\\ProjectGuruSite\\BrowserDrivers\\chrome\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.demo.guru99.com/V4/index.php");

		driver.manage().window().maximize();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@AfterMethod
	public void tearup() {
		driver.quit();

	}

}
