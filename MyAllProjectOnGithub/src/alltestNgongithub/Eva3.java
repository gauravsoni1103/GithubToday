package alltestNgongithub;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Eva3 {
public WebDriver driver;
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.guru99.com/test/");
  }
  @Test (priority=0)
  public void enterDatenTime() {
	  //Date And Time
	  WebElement datepick = driver.findElement(By.xpath("//*[@name=\"bdaytime\"]"));
	  datepick.sendKeys("25092013");
	  datepick.sendKeys(Keys.TAB);
	  datepick.sendKeys("1445PM");
	  driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
	  String actual = driver.findElement(By.xpath("/html/body/div[2]")).getText();
	  String expect = "Your Birth Date is 2013-09-25\n"
				+ "Your Birth Time is 14:45";
	  Assert.assertEquals(actual, expect);
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
