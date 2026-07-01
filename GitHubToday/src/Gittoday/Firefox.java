package Gittoday;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();

	}

}
