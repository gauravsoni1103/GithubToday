package alltestNgongithub;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest7 {
public WebDriver driver;
@BeforeTest
public void beforeTest() {
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/text-box");
	driver.findElement(By.id("userName")).sendKeys("Gaurav soni");
	driver.findElement(By.id("userEmail")).sendKeys("gs3513591@gmail.com");
	//scroll
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("scrollBy(0,250)");
	
	driver.findElement(By.id("currentAddress")).sendKeys("kirti nagar,Ajmer");
	driver.findElement(By.id("permanentAddress")).sendKeys("Foy Sagar Road, Ajmer");
	driver.findElement(By.id("submit")).click();
	
	
	
}
@Test (priority=0)
public void fullname() {
	//full name
	String actual = driver.findElement(By.id("name")).getText();
	String expect ="Name:"+"Gaurav soni";
	Assert.assertEquals(actual, expect);
}
@Test (priority=1)
public void email() throws InterruptedException {
	String actual = driver.findElement(By.id("email")).getText();
	String expect = "Email:"+"gs3513591@gmail.com";
	Assert.assertEquals(actual, expect);
	Thread.sleep(5000);
}
@Test (priority=2)
public void currentAdd() throws InterruptedException {
	String actual = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/form/div[6]/div/p[3]")).getText();
	String expect = "Current Address :"+"kirti nagar,Ajmer";
	Assert.assertEquals(actual, expect);
	Thread.sleep(5000);
}
@Test (priority=3)
public void permanentAdd() {
	String actual = driver.findElement(By.xpath("//html/body/div[1]/div/div/div/div[2]/div[1]/form/div[6]/div/p[4]")).getText();
	String expect = "Permananet Address :"+"Foy Sagar Road, Ajmer";
	Assert.assertEquals(actual, expect);
}

@AfterTest
public void afterTest() {
}

}
