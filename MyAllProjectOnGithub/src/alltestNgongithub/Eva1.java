package alltestNgongithub;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Eva1 {
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
	  driver.get("https://www.saucedemo.com/");
  }
@Test(priority=0)
public void logindetails() throws InterruptedException {
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	Thread.sleep(5000);
	String actual = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
	String expect = "Sauce Labs Backpack";
	Assert.assertEquals(actual, expect);
}
@Test(priority=1)
public void yourcart() {
	driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).click();
	driver.findElement(By.xpath("//*[@id=\"add-to-cart\"]")).click();
	driver.findElement(By.xpath("//*[@class=\"shopping_cart_link\"]")).click();
	String actual = driver.findElement(By.xpath("//*[@class=\"title\"]")).getText();
	String expect = "Your Cart";
	Assert.assertEquals(actual, expect);
	
	String actual1 = driver.findElement(By.xpath("//*[@class=\"inventory_item_name\"]")).getText();
	String expect1 = "Sauce Labs Backpack";
	Assert.assertEquals(actual1, expect1);
}
@Test (priority=2)
public void checkout() {
	driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
	String actual = driver.findElement(By.xpath("//*[@class=\"title\"]")).getText();
	String expect = "Checkout: Your Information";
	Assert.assertEquals(actual, expect);
	
	driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Gaurav");
	driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Soni");
	driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("305001");
}


@Test (priority=3)
public void continuue() {
	driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
	String actual = driver.findElement(By.xpath("//*[@class=\"title\"]")).getText();
	String expect = "Checkout: Overview";
	Assert.assertEquals(actual, expect);
	
	String actual1 = driver.findElement(By.xpath("//*[@class=\"inventory_item_name\"]")).getText();
	String expect1 = "Sauce Labs Backpack";
	Assert.assertEquals(actual1, expect1);
}
@Test(priority=4)
public void finish() {
	driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
	String actual = driver.findElement(By.xpath("//*[@class=\"title\"]")).getText();
	String expect = "Checkout: Complete!";
	Assert.assertEquals(actual, expect);
	
	String actual1 = driver.findElement(By.xpath("//*[@class=\"complete-header\"]")).getText();
	String expect1 = "Thank you for your order!";
	Assert.assertEquals(actual1, expect1);
}
@Test(priority=5)
public void backbutn() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
	String actual = driver.findElement(By.xpath("//*[@class=\"title\"]")).getText();
	String expect = "Products";
	Assert.assertEquals(actual, expect);
	
	driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
	
	driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
}



  @AfterTest
  public void afterTest() {
  }

}
