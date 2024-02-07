package packet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	
	@Test
	public void doLogin() {
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Jenkins");
		
	}

}
