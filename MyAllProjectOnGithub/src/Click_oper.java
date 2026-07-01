

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_oper {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		// Right - click
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		action.contextClick(element).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[3]")).click();
		
		//Double - click
		//driver.get("https://demo.guru99.com/test/simple_context_menu.html");
//		Actions action1 = new Actions(driver);
//		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
//		action1.doubleClick(element1).perform();
}

}
