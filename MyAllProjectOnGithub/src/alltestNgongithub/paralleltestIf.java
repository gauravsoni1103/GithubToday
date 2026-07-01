package alltestNgongithub;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class paralleltestIf {
	public WebDriver driver;
  @BeforeTest
 
  @Parameters("browser")
  
  public void beforeTest(@Optional("firefox")String browser) throws Exception {
	  if (browser.equalsIgnoreCase("chrome")) {
		  
		  driver = new ChromeDriver();
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
  @Test (priority=0)
  public void bothblank() throws InterruptedException {
	  driver.get("https://www.saucedemo.com/");
	  driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	  Thread.sleep(3000);
	  String actual = driver.findElement(By.xpath("//*[@id=\\\"login_button_container\\\"]/div/form/div[3]/h3")).getText();
	  String expect = "Epic sadface: Username is required";
	  Assert.assertEquals(actual, expect);
  }
  @Test (priority=1)
  public void blankpass() throws InterruptedException {
	driver.navigate().refresh();	  
	driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	Thread.sleep(3000);
	String actual = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
	String expect ="Epic sadface: Password is required";
	Assert.assertEquals(actual,expect);  
	  }
  @Test (priority=2)
  public void trimUser() throws InterruptedException {
	  driver.navigate().refresh();
	  driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("   standard_user");
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	  driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	  Thread.sleep(3000);
	  String actual = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
	  String expect ="Epic sadface: Username and password do not match any user in this service";
	  Assert.assertEquals(actual,expect);
  }
  @Test (priority=3)
  public void minUser() throws InterruptedException {
	  driver.navigate().refresh();
	  driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("s");
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	  driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	  Thread.sleep(3000);
	  String actual = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
	  String expect ="Epic sadface: Username and password do not match any user in this service";
	  Assert.assertEquals(actual,expect);
  }
  @Test (priority=4)
  public void WroUser() throws InterruptedException {
	  driver.navigate().refresh();
	  driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("problem_user");
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	  driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	  Thread.sleep(3000);
	  String actual = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
	  String expect ="Epic sadface: Username and password do not match any user in this service";
	  Assert.assertEquals(actual,expect);
  }
  @Test (priority=5)
  public void Wropass() throws InterruptedException {
	  driver.navigate().refresh();
	  driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("problem_user");
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce123");
	  driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	  Thread.sleep(3000);
	  String actual = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
	  String expect ="Epic sadface: Username and password do not match any user in this service";
	  Assert.assertEquals(actual,expect);
  }
  @Test (priority=6)
  public void correctall() throws InterruptedException {
	  driver.navigate().refresh();
	  driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	  driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	  Thread.sleep(3000);
	  String actual = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div")).getText();
	  String expect ="Swag Labs";
	  Assert.assertEquals(actual,expect);
  }
  @AfterTest
  public void afterTest() {
  }

}
