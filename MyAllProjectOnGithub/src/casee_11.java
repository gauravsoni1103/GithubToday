

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class casee_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://artoftesting.com/sampleSiteForSelenium");
		driver.manage().window().maximize();
		
		Select testing = new Select(driver.findElement(By.id("testingDropdown")));
		testing.selectByValue("Manual");
		
		
	}

}
