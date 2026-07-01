

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtask_print_text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/");
		//Enter a DOB
		WebElement datePicker = driver.findElement(By.xpath("/html/body/form/input[1]"));
		datePicker.sendKeys("22062000");
		datePicker.sendKeys(Keys.TAB);
		//Enter a Time
		datePicker.sendKeys("0307");
		//Click on submit button
		driver.findElement(By.xpath("/html/body/form/input[2]")).click();
		//Print a text body
		String txtbox = driver.findElement(By.xpath("/html/body/div[2]")).getText();
		System.out.print("Result is : "+ txtbox);
		
	}

}
