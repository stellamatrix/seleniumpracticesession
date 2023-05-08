package javaselfpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class beforetestexecution {
	WebDriver driver;
	@BeforeTest
	public void setupBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIK COP\\eclipse-workspace\\javaselfpractice\\browsserdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://netowsolutions.com/swadel/");
		driver.findElement(By.cssSelector("#layout > div > header > div.header_1.cz_menu_fx_fade_in > div > div > div.elms_right.header_1_right > div.cz_elm.icon_header_1_right_4.inner_icon_header_1_right_2 > a > i")).click();
	}
	
	@Test(priority=0)
	public void invalidLogin() throws InterruptedException {
		
		driver.findElement(By.id("username")).sendKeys("stellaajulor01@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("stellamatrix1610$A");
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);

	}
	
	@Test(priority=1)
	public void validLogin() throws InterruptedException {
		
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.id("username")).sendKeys("stellaajulor01@gmail.com");
		
		driver.findElement(By.name("password")).click();
		driver.findElement(By.id("password")).sendKeys("stellamatrix1610$A");
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
