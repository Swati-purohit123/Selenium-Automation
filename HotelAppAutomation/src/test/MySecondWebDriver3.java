package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MySecondWebDriver3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.adactinhotelapp.com");
		WebElement uname =driver.findElement(By.cssSelector("#username"));
		uname.sendKeys("swati0000");
		driver.findElement(By.name("password")).sendKeys("nilam@12");
		driver.findElement(By.cssSelector("#login")).click();
		new Select(driver.findElement(By.id("location"))).selectByVisibleText("London");
		new Select(driver.findElement(By.id("hotels"))).selectByIndex(3);
		new Select(driver.findElement(By.id("room_type"))).selectByIndex(2);
		new Select(driver.findElement(By.id("room_nos"))).selectByIndex(4);
		 WebElement date = driver.findElement(By.id ("datepick_in"));
		 date.click();
		 date.clear();
		 date.sendKeys("12/04/2022");
		 WebElement dat = driver.findElement(By.id ("datepick_out"));
		 dat.click();
		 dat.clear();
		 dat.sendKeys("14/04/2022");
		new Select(driver.findElement(By.id("adult_room"))).selectByIndex(2);
		new Select(driver.findElement(By.name("child_room"))).selectByIndex(2);
		driver.findElement(By.cssSelector("#Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.cssSelector("#continue")).click();
		driver.findElement(By.name("first_name")).sendKeys("Swati");
		driver.findElement(By.name("last_name")).sendKeys("Purohit");
		driver.findElement(By.name("address")).sendKeys("deogarh");
		driver.findElement(By.name("cc_num")).sendKeys("1234123412341234");
		new Select(driver.findElement(By.id("cc_type"))).selectByIndex(2);
		new Select(driver.findElement(By.id("cc_exp_month"))).selectByIndex(2);
		new Select(driver.findElement(By.id("cc_exp_year"))).selectByIndex(10);
		driver.findElement(By.name("cc_cvv")).sendKeys("789");
		driver.findElement(By.cssSelector("#book_now")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#search_hotel")).click();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver.findElement(By.cssSelector("#my_itinerary")).click();
		//driver.findElement(By.cssSelector("#logout")).click();
		
		
		
		
		
		
	}

	private static Select Select(WebElement findElement) {
		// TODO Auto-generated method stub
		return null;
	}

}
