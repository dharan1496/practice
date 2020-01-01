package testFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//load yahoo url in google 
//
//
public class yahoo {
	public WebDriver driver;
	@BeforeTest
	public void setup() throws Throwable {
	   
	   
	}

	@Test
	public void main() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
	   driver.get("http://www.yahoo.com");
	   System.out.println(driver.getTitle()+" "+Thread.currentThread().getId());
	}

	@AfterTest
	public void teardown() throws Throwable {
		driver.quit();
	   
	}

}
