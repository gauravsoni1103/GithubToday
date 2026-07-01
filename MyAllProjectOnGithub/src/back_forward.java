

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class back_forward {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		driver.get("https://google.com");
		
		driver.navigate().back();
		driver.navigate().refresh();
		
		driver.findElement(By.id("_R_oiqjbjb9pb6amH1_")).sendKeys("test@gmail.com");
		driver.findElement(By.id("_R_oqqjbjb9pb6amH1_")).sendKeys("test123");	
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[1]/div/div[3]/div/div/div")).click();
		
	}


}
