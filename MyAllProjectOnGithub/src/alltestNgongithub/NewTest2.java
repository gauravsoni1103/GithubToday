package alltestNgongithub;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest2 {
 
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
	  
//	  driver = new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
	  
  }

  
  @Test (priority=0)
  public void UsernameNpass ()  {
	    driver.findElement(By.id("user-name")).sendKeys("standard_user"); 
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
	
  }
  
  
  @Test (priority=1)
  public void ZToA ()  {
		
		
		Select option = new Select(driver.findElement(By.className("product_sort_container")));
		option.selectByIndex(1);
		
		String actual = driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div")).getText();
		String expect = "Test.allTheThings() T-Shirt (Red)";
		Assert.assertEquals(actual, expect);
		
  }
  @Test (priority=2)
  public void lowTOhigh()  {
		
		
		Select option = new Select(driver.findElement(By.className("product_sort_container")));
		option.selectByIndex(2);
		
		String actual = driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div")).getText();
		String expect = "Sauce Labs Onesie";
		Assert.assertEquals(actual, expect);
		
  }
  @Test (priority=3)
  public void highTOlow()  {
		
		
		Select option = new Select(driver.findElement(By.className("product_sort_container")));
		option.selectByIndex(3);
		
		String actual = driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div")).getText();
		String expect = "Sauce Labs Fleece Jacket";
		Assert.assertEquals(actual, expect);
		
		
  }
  @Test (priority=4)
  public void menuandlogout() throws InterruptedException {
	  
	  driver.findElement(By.id("react-burger-menu-btn")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
	  
  }
  

  
  @AfterTest
  public void afterTest() {
  }

}
