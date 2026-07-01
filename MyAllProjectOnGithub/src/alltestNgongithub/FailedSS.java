package alltestNgongithub;

import org.testng.annotations.Test;
import org.testng.internal.TestResult;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class FailedSS {
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
	  
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();     
   	  
  }

@Test (priority=0)
public void login() {
	driver.findElement(By.id("user-name")).sendKeys("standard_user"); 
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();		
	
}


@Test (priority=1)
public void product() {
	String actual = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
	String expect ="Sauce Labs Backpack";
	Assert.assertEquals(actual, expect);
	
	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
}

@Test (priority=2)
public void yourcart() {
	driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
	
	String actual=driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
	String expect="Sauce Labs Backpack1";
	Assert.assertEquals(actual, expect);
}
@Test (priority=3)
public void Checkout() {
	driver.findElement(By.id("checkout")).click();
	String actual = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
	String expect ="Checkout: Your Information1";
	
	Assert.assertEquals(actual, expect);
	
}
@Test (priority=4)
public void YourInformation() {
	driver.findElement(By.id("first-name")).sendKeys("Gaurav");
	driver.findElement(By.id("last-name")).sendKeys("Soni");
	driver.findElement(By.id("postal-code")).sendKeys("305004");
	
	driver.findElement(By.id("continue")).click();
}
@Test (priority=5)
public void overview() {
	String actual = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
	String expect ="Checkout: Overview";
	Assert.assertEquals(actual, expect);
	
	String actual1 = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
	String expect1= "Sauce Labs Backpack";
	Assert.assertEquals(actual1, expect1);
	
	driver.findElement(By.id("finish")).click();
	
}
@Test (priority=6)
public void Complete() {
	String actual = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
	String expect ="Checkout: Complete!";
	Assert.assertEquals(actual, expect);
	
	String actual1 = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2")).getText();
	String expect1="Thank you for your order!";
	Assert.assertEquals(actual1, expect1);
	
	driver.findElement(By.id("back-to-products")).click();
}

@Test (priority=7)
public void Product() throws InterruptedException {
	String actual = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
	String expect ="Products";
	Assert.assertEquals(actual, expect);
	
	driver.findElement(By.id("react-burger-menu-btn")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("logout_sidebar_link")).click();
}

@AfterMethod
public void Screenshot(ITestResult result) throws IOException {

if(ITestResult.FAILURE==result.getStatus()) {
	TakesScreenshot screenshot=(TakesScreenshot)driver;
	File src=screenshot.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("//Users/gauravsoni/Downloads/screenshot/"+result.getName()+".png"));
	}

}


@AfterTest
public void afterTest() {
}

}
