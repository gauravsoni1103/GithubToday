package alltestNgongithub;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class ParallelTest {
	
public WebDriver driver;
  @BeforeTest
  public void beforeTest() {
  }
  @Test (priority=0)
  public void chrome() throws InterruptedException {
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.saucedemo.com/");
	  
	  //both value blank
	  driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	  Thread.sleep(5000);
	  
	  String actual = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
	  String expect="Epic sadface: Username is required";
	  Assert.assertEquals(actual, expect);
	  
	  //password blank
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	  driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	  String actual1 = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
	  String expect1 ="Epic sadface: Password is required";
	  Assert.assertEquals(actual1,expect1);
  }
  @Test (priority=1)
  public void firefox() throws InterruptedException {
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.saucedemo.com/");
	  
	  
	//both value blank
	  driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	  Thread.sleep(5000);
	  
	  String actual = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
	  String expect="Epic sadface: Username is required";
	  Assert.assertEquals(actual, expect);
	  
	  //password blank
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	  driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	  String actual1 = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
	  String expect1 ="Epic sadface: Password is required";
	  Assert.assertEquals(actual1,expect1);
  }
	  
  @AfterTest
  public void afterTest() {
  }

}
