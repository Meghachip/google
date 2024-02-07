package packet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	
	
	@Test
	public void doLogin() {
		driver.get("https://www.way2automation.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"menu-item-27625\"]")).click();
		driver.findElement(By.name("email")).sendKeys("meghachip@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Changeme#23");
		
	}

}
