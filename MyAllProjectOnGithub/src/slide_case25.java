

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slide_case25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		
		driver.switchTo().frame(0);
	
		WebElement slide = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		Actions action = new Actions(driver);
		
		action.dragAndDropBy(slide , 100,50).perform();

	}

}
//driver.switchTo().frame(0);
//
//Actions move = new Actions(driver);
//
// WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/span"));
//
// move.dragAndDropBy(slider, 80, 0).perform();
