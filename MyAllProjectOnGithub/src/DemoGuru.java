

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGuru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		 driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("Gaurav");
		driver.findElement(By.name("lastName")).sendKeys("Soni");
		driver.findElement(By.name("phone")).sendKeys("8233991103");
		driver.findElement(By.name("userName")).sendKeys("gs3513591@gmail.com");
		
		driver.findElement(By.name("address1")).sendKeys("Foy Sagar Road Ajmer");
		driver.findElement(By.name("city")).sendKeys("Ajmer");
		driver.findElement(By.name("state")).sendKeys("Rajasthan");
		driver.findElement(By.name("postalCode")).sendKeys("305001");
		//driver.findElement(By.className("country")).("India");
		
		driver.findElement(By.id("email")).sendKeys("user1@test.com");
		driver.findElement(By.name("password")).sendKeys("user1");
		driver.findElement(By.name("confirmPassword")).sendKeys("user1");
		
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.linkText("SIGN-OFF")).click();
	}

}
