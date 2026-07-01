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

public class NewTest5 {
public WebDriver driver;
@BeforeTest
public void beforeTest() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/");
	
}
@Test (priority=0)
public void datenTime() {
	//enter Date
	WebElement datepick = driver.findElement(By.xpath("/html/body/form/input[1]"));
	datepick.sendKeys("25092013");
	datepick.sendKeys(Keys.TAB);
	//enter time
	datepick.sendKeys("1445PM");
	driver.findElement(By.xpath("/html/body/form/input[2]")).click();
	
	String actual = driver.findElement(By.xpath("/html/body/div[2]")).getText();
	String expect = "Your Birth Date is 2013-09-25\n"
			+ "Your Birth Time is 14:45";
	Assert.assertEquals(actual, expect);
//	
//	String actual1 = driver.findElement(By.xpath("/html/body/div[2]")).getText();
//	String expect1 = "Your Birth Time is 14:45";
//	Assert.assertEquals(actual1, expect1);
	
}


@AfterTest
public void afterTest() {
}

}
