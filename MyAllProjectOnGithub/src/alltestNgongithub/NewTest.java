package alltestNgongithub;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
public WebDriver driver;
@BeforeTest
public void beforeTest() {
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/newtours/");	
}
@Test (priority=0)
public void VerifytiTTle() {
	String actual = driver.getTitle();
	String expect ="Welcome: Mercury Tours";
	Assert.assertEquals(actual, expect);
}

@AfterTest
public void afterTest() {	
}

}
