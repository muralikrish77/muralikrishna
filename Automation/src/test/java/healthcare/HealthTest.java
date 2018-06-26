package healthcare;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;
import java.sql.DriverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class HealthTest {
	  WebDriver driver;
  @Test
  public void f() {
	  
	driver.findElement(By.name("UserLogin[username]")).sendKeys("admin");
	driver.findElement(By.name("UserLogin[password]")).sendKeys("admin");
	  
  }
  @BeforeTest
  public void beforeTest() {
	
			System.setProperty("webdriver.chrome.driver","D:\\selenium softwares\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://http://demo.elixiraid.com");
			//Driver.manage().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
