package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestHotelApp {
public static WebDriver driver;
public static String expectedTitle="Adactin.com - Search Hotel";
	@Before
	public void setUp() throws Exception {
	
	System.setProperty("webdriver.chrome.driver","F:\\Driver\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("http://www.adactinhotelapp.com");
	}
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	@Test
	public void test() {
		WebElement uname =driver.findElement(By.cssSelector("#username"));
		uname.sendKeys("swati0000");
		driver.findElement(By.name("password")).sendKeys("nilam@12");
		driver.findElement(By.cssSelector("#login")).click();
		String actualTitle = driver.getTitle();
		assertEquals(expectedTitle,actualTitle);
		
	}

}
