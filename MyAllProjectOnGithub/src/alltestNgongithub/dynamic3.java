package alltestNgongithub;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class dynamic3 {
  public WebDriver driver;
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demoqa.com/webtables");
  }
  @Test (priority=0)
  public void add() {
	  driver.findElement(By.xpath("//*[@id='addNewRecordButton']")).click();
	  driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Gaurav");
	  driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys("Soni");
	  driver.findElement(By.xpath("//*[@id='userEmail']")).sendKeys("gs3513591@gmail.com");
	  driver.findElement(By.xpath("//*[@id='age']")).sendKeys("25");
	  driver.findElement(By.xpath("//*[@id='salary']")).sendKeys("25000");
	  driver.findElement(By.xpath("//*[@id='department']")).sendKeys("IT");
	  driver.findElement(By.xpath("//*[@id='submit']")).click();
  }
  @Test (priority=1)
  public void edit() {
	  driver.findElement(By.xpath("//*[@id='edit-record-4']")).click();
	  driver.findElement(By.xpath("//*[@id='firstName']")).clear();
	  driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Mayank");
	  driver.findElement(By.xpath("//*[@id='lastName']")).clear();
	  driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys("jain");
	  driver.findElement(By.xpath("//*[@id='userEmail']")).clear();
	  driver.findElement(By.xpath("//*[@id='userEmail']")).sendKeys("mayank@gmail.com");
	  driver.findElement(By.xpath("//*[@id='age']")).clear();
	  driver.findElement(By.xpath("//*[@id='age']")).sendKeys("28");
	  driver.findElement(By.xpath("//*[@id='salary']")).clear();
	  driver.findElement(By.xpath("//*[@id='salary']")).sendKeys("33000");
	  driver.findElement(By.xpath("//*[@id='department']")).clear();
	  driver.findElement(By.xpath("//*[@id='department']")).sendKeys("Finance");
	  driver.findElement(By.xpath("//*[@id='submit']")).click();
	  driver.findElement(By.xpath("//*[@id='delete-record-4']")).click();
  }

  @AfterTest
  public void afterTest() {
  }

}
