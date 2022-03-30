package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySecondWebDriverScript2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.adactinhotelapp.com");
		WebElement uname =driver.findElement(By.className("login_input"));
		uname.sendKeys("swati0000");
		driver.findElement(By.name("password")).sendKeys("nilam@12");
		driver.findElement(By.className("login_button")).click();
		driver.quit();
	}

}
