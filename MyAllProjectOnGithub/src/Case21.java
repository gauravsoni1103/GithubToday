

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		String mailTag = driver.findElement(By.id("_R_oiqjbjb9pb6amH1_")).getTagName();
		System.out.println("email field is : "+mailTag);
		
		String pass = driver.findElement(By.id("_R_oqqjbjb9pb6amH1_")).getTagName();
		System.out.println("password is :"+pass);
	
	}

}
