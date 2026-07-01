package alltestNgongithub;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest8 {
public WebDriver driver;
@BeforeTest
public void beforeTest() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/buttons");
}
@Test (priority=0)
public void doubleclick() throws InterruptedException {
	Actions action = new Actions(driver);
	WebElement element = driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
	action.doubleClick(element).perform();
	Thread.sleep(5000);
	
	String actual = driver.findElement(By.xpath("//*[@id=\"doubleClickMessage\"]")).getText();
	String expect = "You have done a double click";
	Assert.assertEquals(actual, expect);
}
@Test (priority=1)
public void rightclick() {
	Actions action = new Actions(driver);
	WebElement element = driver.findElement(By.id("rightClickBtn"));
	action.contextClick(element).perform();
	
	String actual = driver.findElement(By.id("rightClickMessage")).getText();
	String expect = "You have done a right click";
	Assert.assertEquals(actual, expect);
}
@Test (priority=1)
public void clickme() {
	driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div[1]/div[3]/button")).click();
	
	String actual = driver.findElement(By.id("dynamicClickMessage")).getText();
	String expect = "You have done a dynamic click";
	Assert.assertEquals(actual, expect);
}

@AfterTest
public void afterTest() {
}

}
