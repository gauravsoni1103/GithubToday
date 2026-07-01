

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class case_7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/webtables");
		
		driver.findElement(By.id("addNewRecordButton")).click();
		driver.findElement(By.id("firstName")).sendKeys("Gaurav");
		driver.findElement(By.id("lastName")).sendKeys("Soni");
		driver.findElement(By.id("userEmail")).sendKeys("gs3513591@gmail.com");
		driver.findElement(By.id("age")).sendKeys("25");
		driver.findElement(By.id("salary")).sendKeys("40000");
		driver.findElement(By.id("department")).sendKeys("QA");
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"edit-record-4\"]")).click();
		
		//clear all the fields
		driver.findElement(By.id("firstName")).clear();
		driver.findElement(By.id("firstName")).sendKeys("Mayank");
		driver.findElement(By.id("lastName")).clear();
		driver.findElement(By.id("lastName")).sendKeys("jain");
		driver.findElement(By.id("userEmail")).clear();
		driver.findElement(By.id("userEmail")).sendKeys("mayank@gmail.com");
		driver.findElement(By.id("age")).clear();
		driver.findElement(By.id("age")).sendKeys("27");
		driver.findElement(By.id("salary")).clear();
		driver.findElement(By.id("salary")).sendKeys("45000");
		driver.findElement(By.id("department")).clear();
		driver.findElement(By.id("department")).sendKeys("Accountant");
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("delete-record-4")).click();
		
	}

}
