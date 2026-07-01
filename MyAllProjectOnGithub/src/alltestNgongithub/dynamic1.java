package alltestNgongithub;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class dynamic1 {
  public WebDriver driver;
  @BeforeTest
  public void beforeTest() {
	  ChromeOptions options = new ChromeOptions();
	  Map<String, Object> prefs = new HashMap<String, Object>();
	  prefs.put("credentials_enable_service", false);
	  prefs.put("profile.password_manager_enabled", false);
	  prefs.put("profile.password_manager_leak_detection", false);
	  options.setExperimentalOption("prefs", prefs);
	  driver = new ChromeDriver(options);
	  
	  
	  driver.manage().window().maximize();
	  driver.get("https://demo.guru99.com/test/newtours/");
  }
  @Test (priority=0)
  public void dynamicregister() {
	  driver.findElement(By.xpath("//*[@href='register.php']")).click();
  }
  @Test (priority=1)
  public void dynContactInfo() {
	  driver.findElement(By.xpath("//*[@name='firstName']")).sendKeys("Gaurav");
	  driver.findElement(By.xpath("//*[@name='lastName']")).sendKeys("Soni");
	  driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("8233991103");
	  driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("user1@test.com");
	  }
  @Test (priority=2)
  public void dynMailingInfo() {
	  driver.findElement(By.xpath("//*[@name='address1']")).sendKeys("26'b, Kirti Nagar");
	  driver.findElement(By.xpath("//*[@name='city']")).sendKeys("Ajmer");
	  driver.findElement(By.xpath("//*[@name='state']")).sendKeys("Rajasthan");
	  driver.findElement(By.xpath("//*[@name='postalCode']")).sendKeys("305001");
	  Select option = new Select(driver.findElement(By.xpath("//*[@name='country']")));
	  option.selectByValue("INDIA");
	  driver.findElement(By.xpath("//*[@class='cb-close']")).click();
  }
  @Test (priority=3)
  public void dynUserInfo() {
	  driver.findElement(By.xpath("//*[@id='email']")).sendKeys("user1@test.com");
	  driver.findElement(By.xpath("//*[@name='password']")).sendKeys("user1");
	  driver.findElement(By.xpath("//*[@name='confirmPassword']")).sendKeys("user1");
	  driver.findElement(By.xpath("//*[@name='submit']")).click(); 
  }

  @AfterTest
  public void afterTest() {
  }

}
