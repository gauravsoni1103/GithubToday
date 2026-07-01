

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_over {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		
		// Mouse hover
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.cssSelector("#nav-link-accountList > a > span"));
		//Thread.sleep(5000);
		action.moveToElement(element).perform();
		
	
	}

}
