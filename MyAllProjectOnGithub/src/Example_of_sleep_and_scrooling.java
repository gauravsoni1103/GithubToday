

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_of_sleep_and_scrooling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://www.google.com/");
//		driver.findElement(By.id("APjFqb")).sendKeys("youtube");
//		
//		Thread.sleep(5000);
//		
//		driver.findElement(By.xpath("//*[@id=\"jZ2SBf\"]/div[2]/span")).click();
		
		driver.get("https://demoqa.com/text-box");
		//scrolling
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");
		
		driver.findElement(By.id("userName")).sendKeys("Gaurav soni");
		driver.findElement(By.id("userEmail")).sendKeys("gs3513591@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Ajmer");
		driver.findElement(By.id("permanentAddress")).sendKeys("Foy sagar road");
		

		
		
		Thread.sleep(5000);
		driver.findElement(By.id("submit")).click();
		
	}

}
