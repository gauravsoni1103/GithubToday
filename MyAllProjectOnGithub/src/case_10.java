

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class case_10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

			WebDriver driver;
			driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/test/newtours/register.php");
			driver.manage().window().maximize();
			
			Select drpCountry = new Select(driver.findElement(By.name("country")));
			drpCountry.selectByVisibleText("INDIA");
			
			
			driver.get("http://output.jsbin.com/osebed/2");
			Select fruits = new Select(driver.findElement(By.xpath("//*[@id=\"fruits\"]")));
			fruits.selectByValue("banana");
			fruits.selectByIndex(1);
			fruits.selectByIndex(2);
			
			Thread.sleep(5000);
			
			fruits.deselectByIndex(0);
			Thread.sleep(5000);
			fruits.deselectAll();
	
	}

}

