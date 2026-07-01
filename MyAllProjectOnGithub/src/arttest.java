

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class arttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://artoftesting.com/sampleSiteForSelenium");
		driver.findElement(By.id("fname")).sendKeys("123455");
		driver.findElement(By.id("fname")).clear();
		driver.findElement(By.id("idOfButton")).click();
		
		
		driver.findElement(By.id("male")).click();
		driver.findElement(By.className("Automation")).click();
		driver.findElement(By.className("Performance")).click();
	}

}
