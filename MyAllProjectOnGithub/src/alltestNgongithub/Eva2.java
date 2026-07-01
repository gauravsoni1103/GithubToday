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

public class Eva2 {
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
 public void login() {
	 	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
 }
 @Test(priority=1)
 public void sZtoA() {
	 Select s = new Select(driver.findElement(By.xpath("//*[@class=\"product_sort_container\"]")));
	 s.selectByIndex(1);
	 String actual= driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div")).getText();
	 String expect = "Test.allTheThings() T-Shirt (Red)";
	 Assert.assertEquals(actual, expect);
 }
 @Test(priority=2)
 public void sLtoH() {
	 Select s = new Select(driver.findElement(By.xpath("//*[@class=\"product_sort_container\"]")));
	 s.selectByIndex(2);
	 String actual= driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div")).getText();
	 String expect = "Sauce Labs Onesie";
	 Assert.assertEquals(actual, expect);
 }
 @Test(priority=3)
 public void sHtoL() {
	 Select s = new Select(driver.findElement(By.xpath("//*[@class=\"product_sort_container\"]")));
	 s.selectByIndex(3);
	 String actual= driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div")).getText();
	 String expect = "Sauce Labs Fleece Jacket";
	 Assert.assertEquals(actual, expect);
 }
 @Test(priority=4)
 public void sAtoz() {
	 Select s = new Select(driver.findElement(By.xpath("//*[@class=\"product_sort_container\"]")));
	 s.selectByIndex(0);
	 String actual= driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
	 String expect ="Sauce Labs Backpack";
	 Assert.assertEquals(actual, expect);
	 driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
	 driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
 }
  @AfterTest
  public void afterTest() {
  }

}
