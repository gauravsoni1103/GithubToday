package alltestNgongithub;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class ReadnWritewExcel {
	public WebDriver driver;
  @BeforeClass
  public void beforeClass() {
	  driver = new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
  }
  @Test(priority=0)
  public void readnwrite() {
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
