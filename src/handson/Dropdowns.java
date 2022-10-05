package handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "//home/icliniq_n2/Music/AllFiles/geckodriver-v0.31.0-linux64/geckodriver");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		WebElement dropdown = driver.findElement(By.id("dropdown1"));
		Select select = new Select(dropdown);
		select.selectByIndex(1);
		select.selectByValue("4");
		select.selectByVisibleText("Loadrunner");
		
	}

}
