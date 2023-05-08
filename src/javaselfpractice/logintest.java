package javaselfpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//system properties
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIK COP\\eclipse-workspace\\javaselfpractice\\browsserdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netowsolutions.com/swadel/");
		driver.findElement(By.cssSelector("#layout > div > header > div.header_1.cz_menu_fx_fade_in > div > div > div.elms_right.header_1_right > div.cz_elm.icon_header_1_right_4.inner_icon_header_1_right_2 > a > i")).click();
		//to login
		driver.findElement(By.id("username")).sendKeys("stellaajulor01@gmail.com");
		driver.findElement(By.id("password")).sendKeys("stellamatrix1610$A");
		driver.findElement(By.name("login")).click();
	}

}
