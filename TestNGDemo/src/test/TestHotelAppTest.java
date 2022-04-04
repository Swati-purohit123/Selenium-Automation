package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestHotelAppTest {
	public static WebDriver driver;
  @Test
  public void TesthotelApp() {
	  WebElement uname =driver.findElement(By.id("username"));
		uname.sendKeys("swati0000");
		driver.findElement(By.id("password")).sendKeys("nilam@12");
		driver.findElement(By.id("login")).click();
		
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "F:\\Driver\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://adactinhotelapp.com");
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
