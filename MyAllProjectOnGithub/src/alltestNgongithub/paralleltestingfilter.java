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
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class paralleltestingfilter {
public WebDriver driver;

  @BeforeTest
  @Parameters("browser")
  public void beforeTest(@Optional("firefox")String browser) throws Exception {
	  if(browser.equalsIgnoreCase("chrome")) {
		  ChromeOptions options = new ChromeOptions();
		  Map<String, Object> prefs = new HashMap<String, Object>();

		  prefs.put("credentials_enable_service", false);

		  prefs.put("profile.password_manager_enabled", false);

		  prefs.put("profile.password_manager_leak_detection", false);

		  options.setExperimentalOption("prefs", prefs);

		  driver = new ChromeDriver(options);
		//  driver = new ChromeDriver();
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
  public void login() {
	  driver.get("https://www.saucedemo.com/");
	  driver.findElement(By.id("user-name")).sendKeys("standard_user");
	  driver.findElement(By.id("password")).sendKeys("secret_sauce");
	  driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	  String actual = driver.findElement(By.xpath("//*[@id=\\\"header_container\\\"]/div[1]/div[2]/div")).getText();
	  String expect ="Swag Labs";
	  Assert.assertEquals(actual,expect);
  }
  @Test(priority=1)
  public void filterztoa() throws InterruptedException {
	  driver.navigate().refresh();
	  Select option = new Select(driver.findElement(By.className("product_sort_container")));
	  option.selectByIndex(1);
	  Thread.sleep(3000);
	  String actual = driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div")).getText();
   	  String expect = "Test.allTheThings() T-Shirt (Red)";
	  Assert.assertEquals(actual, expect);
  }
@Test(priority=2)
public void ltoH() throws InterruptedException {
	Select option = new Select(driver.findElement(By.className("product_sort_container")));
	option.selectByIndex(2);
	Thread.sleep(3000); 
	String actual = driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div")).getText();
	String expect = "Sauce Labs Onesie";
	Assert.assertEquals(actual, expect);
}
@Test(priority=3)
public void htol() throws InterruptedException {
	Select option = new Select(driver.findElement(By.className("product_sort_container")));
	option.selectByIndex(3);
	Thread.sleep(3000);
	String actual = driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div")).getText();
	String expect = "Sauce Labs Fleece Jacket";
	Assert.assertEquals(actual, expect);
}
  @AfterTest
  public void afterTest() {
  }

}
