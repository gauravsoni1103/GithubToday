

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resize_case24 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resizable/");
		
		driver.switchTo().frame(0);
		
		WebElement handle = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(handle , 100,150).perform();
		
		Thread.sleep(5000);

	}
	
}

//Resize Code 

//WebElement resizeElement = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
//
//
//
//Actions actionsResize = new Actions(driver);
//
//
//
////provide the x and y offset values
//
//actionsResize.dragAndDropBy(resizeElement, 100, 50).perform();
