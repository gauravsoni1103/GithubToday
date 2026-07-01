

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/link.html");
		
		driver.findElement(By.xpath("/html/body/a[1]")).click();
		//Print a title name
		String pageTitle = driver.getTitle();
		System.out.print("1 Title name is : " + pageTitle);
		driver.navigate().back();
		
		driver.findElement(By.xpath("/html/body/a[2]")).click();
		String pageTitle1 = driver.getTitle();
		System.out.println("2 Title name is : " + pageTitle1);
		driver.navigate().back();
		
		
	}

}
