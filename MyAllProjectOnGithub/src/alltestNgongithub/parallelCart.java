package alltestNgongithub;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class parallelCart {
public WebDriver driver;

  @BeforeTest
  @Parameters ("browser")
  public void beforeTest(@Optional("firefox")String browser) throws Exception {
	  if(browser.equalsIgnoreCase("chrome")) {
		  ChromeOptions options = new ChromeOptions();
		  Map<String, Object> prefs = new HashMap<String, Object>();
		  prefs.put("credentials_enable_service", false);
		  prefs.put("profile.password_manager_enabled", false);
		  prefs.put("profile.password_manager_leak_detection", false);
		  options.setExperimentalOption("prefs", prefs);
		  
		  driver = new ChromeDriver(options);
		  //driver = new ChromeDriver();
		  driver.manage().window().maximize();  
	  }
	  else if(browser.equalsIgnoreCase("firefox")) {
		  driver = new FirefoxDriver();
		  driver.manage().window().maximize();
	  }
	  else {
		  throw new Exception("Browser is Not Correct");
	  }
  }
  @Test(priority=0)
  public void main() {
	  driver.get("https://www.saucedemo.com/");
	  driver.findElement(By.id("user-name")).sendKeys("standard_user");
	  driver.findElement(By.id("password")).sendKeys("secret_sauce");
	  driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	  String actual = driver.findElement(By.xpath("//*[@id=\\\"header_container\\\"]/div[1]/div[2]/div")).getText();
	  String expect ="Swag Labs";
	  Assert.assertEquals(actual,expect);
  }
  @Test(priority=1)
  public void cart() {
	  driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	  driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
	  String actual = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
	  String expect = "Your Cart";
	  Assert.assertEquals(actual, expect);
  }
  @Test(priority=2)
  public void yourinfo() {
	  driver.findElement(By.id("checkout")).click();
	  driver.findElement(By.id("first-name")).sendKeys("Gaurav"); 
	  driver.findElement(By.id("last-name")).sendKeys("Soni");
	  driver.findElement(By.id("postal-code")).sendKeys("305004");
	  String actual = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
	  String expect = "Checkout: Overview";
	  Assert.assertEquals(actual, expect);
}
  @Test(priority=3)
  public void overview() {
	  driver.findElement(By.id("continue")).click();
	  String actual = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
	  String expect = "Checkout: Overview";
	  Assert.assertEquals(actual, expect);
  }
  @Test(priority=4)
  public void finish() {
	  driver.findElement(By.id("finish")).click();
	  String actual = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
	  String expect = "Checkout: Complete!";
	  Assert.assertEquals(actual, expect);  
  }
  @Test(priority=5)
  public void backhome() {
	  driver.findElement(By.id("back-to-products")).click();
	  driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
	  driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
  }

  @AfterTest
  public void afterTest() {
  }

}
