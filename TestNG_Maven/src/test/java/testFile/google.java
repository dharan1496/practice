package testFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//load gmail in google
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
		Thread.sleep(4000);
		//driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle() + " " + Thread.currentThread().getId());
		driver.findElement(By.id("input")).sendKeys("dharani");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println("success");
		driver.quit();
	}

}
