package handson;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","//home/icliniq_n2/Music/AllFiles/chromedriver_linux64/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
	WebElement index = driver.findElement(By.id("dropdown1"));
	Select drop12 = new Select(index);
	drop12.selectByIndex(4);
	
	WebElement text = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/select"));
	Select ready = new Select(text);
	ready.selectByVisibleText("Selenium");

	WebElement view = driver.findElement(By.xpath("//*[@id=\"dropdown3\"]"));
	Select val = new Select(view);
	val.selectByValue("2");
	
    WebElement op = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/select"));
    Select r = new Select(op);
    List<WebElement> z = r.getOptions();
    int t = z.size();
    System.out.println("The Output is:"+t);
	
		
	WebElement guess = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
	guess.sendKeys("Appium");
	
	}

}
