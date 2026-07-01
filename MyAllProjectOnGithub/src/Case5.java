

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.id("APjFqb")).sendKeys("Art Of Testing");
		
		Thread.sleep(5000);//this is use for pause and wait for a few seconds
		
		driver.findElement(By.xpath("//*[@id=\"jZ2SBf\"]/div[1]/span")).click();
		
	}

}
