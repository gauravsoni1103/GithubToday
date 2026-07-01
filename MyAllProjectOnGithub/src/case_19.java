

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class case_19 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver; 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.name("cusid")).sendKeys("53920");
		driver.findElement(By.name("submit")).click();
		
		Alert alert1 = driver.switchTo().alert();
		String almess = alert1.getText();
		
		System.out.println("Alert message is : "+almess);
		alert1.accept();
		
		Thread.sleep(5000);
		
		Alert alert2 = driver.switchTo().alert();
		String almess1 = alert2.getText();
        System.out.println("Second alert message is: " + almess1);
        alert2.accept();
	}

}
