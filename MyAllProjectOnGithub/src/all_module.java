

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class all_module {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"Content\"]/p[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click(); //click on register
		
		//fill details of user information
		driver.findElement(By.name("username")).sendKeys("gaurav111111");
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[1]/tbody/tr[2]/td[2]/input")).sendKeys("gaurav");
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[1]/tbody/tr[3]/td[2]/input")).sendKeys("gaurav");
		
		//fill account information
		driver.findElement(By.name("account.firstName")).sendKeys("Gaurav");
		driver.findElement(By.name("account.lastName")).sendKeys("Soni");
		driver.findElement(By.name("account.email")).sendKeys("gs3513591+a1@gmail.com");
		driver.findElement(By.name("account.phone")).sendKeys("8233991103");
		driver.findElement(By.name("account.address1")).sendKeys("kirti nagar");
		driver.findElement(By.name("account.address2")).sendKeys("Foy sagar road");
		driver.findElement(By.name("account.city")).sendKeys("Ajmer");
		driver.findElement(By.name("account.state")).sendKeys("Rajasthan");
		driver.findElement(By.name("account.zip")).sendKeys("305001");
		driver.findElement(By.name("account.country")).sendKeys("INDIA");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");
		
		//fill profile details
		Select testing = new Select(driver.findElement(By.name("account.languagePreference")));
		testing.selectByValue("english");
		
		Select testing1 = new Select(driver.findElement(By.name("account.favouriteCategoryId")));
		testing1.selectByVisibleText("DOGS");
		
		driver.findElement(By.name("account.listOption")).click();
		driver.findElement(By.name("account.bannerOption")).click();
		
		driver.findElement(By.name("newAccount")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();
		driver.navigate().refresh();
		//driver.get("https://petstore.octoperf.com/");
		
		//Login
		//driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("password")).clear();
		
		driver.findElement(By.name("username")).sendKeys("gaurav111111");
		driver.findElement(By.name("password")).sendKeys("gaurav");
		driver.findElement(By.name("signon")).click();
		driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();
		
		
		
	}

}
