package alltestNgongithub;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Scrinshot1 {
public WebDriver driver;
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.saucedemo.com/");
  }
  @Test (priority=0)
  public void screenshot() throws IOException {
	  //Take ScreenShot
	  File sshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(sshot,new File("//Users//gauravsoni//Downloads//screenshot//Saucedemo.png"));
	  
	  }

  @AfterTest
  public void afterTest() {
  }

}
