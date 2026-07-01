

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class case_26 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		//second tab open and back to first tab
		
		String firstTab = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		//back to first tab
		driver.switchTo().window(firstTab);
		
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Art of Testing");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/ntp-app//div/div[2]/ntp-searchbox//div/div/cr-searchbox-dropdown//div/div[1]/div/cr-searchbox-match[1]//div/div[1]/div[2]/span[3]/span[1]/span")).click();

	}

}
