package alltestNgongithub;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class dynamic2 {
  public WebDriver driver;
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://artoftesting.com/sampleSiteForSelenium");
  }
  @Test (priority=0)
  public void dynSample() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id='fname']")).sendKeys("Gaurav");
	  driver.findElement(By.xpath("//*[@id='idOfButton']")).click();
	  //scrolling
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("scrollBy(0, 2500)");
	  //double click method
	  Actions action = new Actions(driver);
	  WebElement element = driver.findElement(By.xpath("//*[@id='dblClkBtn']"));
	  action.doubleClick(element).perform();
	  //alert message accept
	  Alert alert = driver.switchTo().alert();
	  System.out.println("Alert message is : "+alert.getText());
	  alert.accept();
	 
	  
	  Thread.sleep(5000);
  }
  @Test (priority=1)
  public void dynRadioButn() {
	  driver.findElement(By.xpath("//*[@id='male']")).click();
  }
  @Test (priority=2)
  public void dynCheckbocButn() {
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("scrollBy(0, 2500)");
	  
	  driver.findElement(By.xpath("(//*[@value='Automation'])[1]")).click();
  }
  @Test (priority=3)
  public void dynSelect() {
	  Select option = new Select(driver.findElement(By.xpath("//*[@id='testingDropdown']")));
	  option.selectByIndex(2);
  }
  @Test (priority=4)
  public void genratealert() {
	  //alert
	  driver.findElement(By.xpath("//*[@id=\"AlertBox\"]/button")).click();
	  Alert alert = driver.switchTo().alert();
	  alert.accept();
  }
  @Test (priority=5)
  public void genConfirmbox() {
	  //alert
	  driver.findElement(By.xpath("//*[@id=\"ConfirmBox\"]/button")).click();
	  Alert alert = driver.switchTo().alert();
	  alert.accept();
	  
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("scrollBy(0, 2500)");
  }
  @Test (priority=6)
  public void drop() {
	  //drag n drop
	  //driver.switchTo().frame(0);
		
	  WebElement source = driver.findElement(By.xpath("//html/body/div[2]/div/div/main/article/div/div/img"));
	  WebElement target = driver.findElement(By.xpath("//*[@id='targetDiv']"));
	  
	  Actions action = new Actions(driver);
	  action.dragAndDrop(source, target).perform();
		
  }
  @AfterTest
  public void afterTest() {
  }

}
