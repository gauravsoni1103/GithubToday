

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Case_20 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver; 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/upload/");
		
		WebElement input = driver.findElement(By.id("uploadfile_0"));
		input.sendKeys("/Users/gauravsoni/Downloads/Dark Gray Modern Trading Course Instagram Post (2).png");
		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
		Thread.sleep(5000);		
		String msg = driver.findElement(By.xpath("//*[@id=\"res\"]/center")).getText();
		System.out.println(msg);

}
}