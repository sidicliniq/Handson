package handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class recheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  System.setProperty("webdriver.gecko.driver","//home/icliniq_n2/Music/AllFiles/geckodriver-v0.31.0-linux64/geckodriver");
	  WebDriver driver = new FirefoxDriver();

  	  driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
	  WebElement a = driver.findElement(By.id("email"));
	  a.sendKeys("Sidmaghesh+4@icliniq.com");	
	
	
	}

}
