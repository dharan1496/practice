package testFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class google {
	public WebDriver driver;
	public static String pageurl = null;
	@Test
	@Parameters({"url"})
	public void main1(String url) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		pageurl = url;
		driver.get(pageurl);
		System.out.println(driver.getTitle() + " " + Thread.currentThread().getId());
		driver.quit();
	}

}
