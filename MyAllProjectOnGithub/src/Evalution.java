

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Evalution {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.booking.com/");

		
		Thread.sleep(3000);



		//Close pop-up
		driver.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);

		//Enter a name and date 
		driver.findElement(By.id(":R55amr5:")).sendKeys("Canada");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"autocomplete-result-0\"]/div/div/div/div")).click();

		//check in date

		driver.findElement(By.xpath("//span[@data-date='2026-04-28']")).click();

		//check out date

		driver.findElement(By.xpath("//span[@data-date='2026-05-02']")).click();

		//add /subs adult
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div/div/div/div/div/div/div[2]/div/div/form/div/div[3]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\":Rdamr5:\"]/div/div[1]/div[2]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\":Rdamr5:\"]/div/div[1]/div[2]/button[1]")).click();

		//add children and select age criteria

		driver.findElement(By.xpath("//*[@id=\":Rdamr5:\"]/div/div[2]/div[2]/button[2]")).click();

		Thread.sleep(5000);

		Select drpCountry = new Select(driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/main/div[1]/div/div/div/div/div/div/div/div[2]/div/div/form/div/div[3]/div/div/div/div/div[3]/div/div/select")));

		drpCountry.selectByIndex(6);

		Thread.sleep(5000);

		

		driver.findElement(By.xpath("//*[@id=\":Rdamr5:\"]/div/div[5]/div[2]/button[2]")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\":Rdamr5:\"]/button")).click();

		driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div/div/div/div/div/div/div[2]/div/div/form/div/div[4]/button/span[2]")).click();


		 
	
		 
	}

}
