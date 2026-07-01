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

public class NewTest4 {
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
	//driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/newtours/");
	driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
	//contact information
	driver.findElement(By.name("firstName")).sendKeys("Gaurav");
	driver.findElement(By.name("lastName")).sendKeys("Soni");
	driver.findElement(By.name("phone")).sendKeys("8233991103");
	driver.findElement(By.id("userName")).sendKeys("user1@test.com");
	
	//mailing information
	driver.findElement(By.name("address1")).sendKeys("26'b,Vaishali nagar");
	driver.findElement(By.name("city")).sendKeys("Ajmer");
	driver.findElement(By.name("state")).sendKeys("Rajasthan");
	driver.findElement(By.name("postalCode")).sendKeys("305001");
	//Using SELECT Method
	Select option = new Select(driver.findElement(By.name("country")));
	option.selectByValue("INDIA");
	
	//User information
	driver.findElement(By.id("email")).sendKeys("user1@test.com");
	driver.findElement(By.name("password")).sendKeys("user1");
	driver.findElement(By.name("confirmPassword")).sendKeys("user1");
	driver.findElement(By.xpath("//*[@id=\"cbox\"]/div/div/div/div/div/div[1]")).click();
	driver.findElement(By.name("submit")).click();
	
	
}
@Test (priority=0)
public void success() {
	String actual = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[1]/font")).getText();
	String expect =" Dear Gaurav soni,";
	
	Assert.assertEquals(actual, expect);
	driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a")).click();
}

@AfterTest
public void afterTest() {
}

}
