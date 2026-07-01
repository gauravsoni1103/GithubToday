

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class case6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.id("userName")).sendKeys("Gaurav soni");
		driver.findElement(By.id("userEmail")).sendKeys("gs3513591@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Ajmer");
		driver.findElement(By.id("permanentAddress")).sendKeys("Foy sagar road");
		
		//this is use for scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)"); // scroll down 500px
		
		driver.findElement(By.id("submit")).click();
		
	}

}
