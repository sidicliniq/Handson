package handson;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class first_level {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver","//home/icliniq_n2/Music/AllFiles/geckodriver-v0.31.0-linux64/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("sriprabhu muthukumar"+Keys.ENTER);
		
		
	
	}

}
