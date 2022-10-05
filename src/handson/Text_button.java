package handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Text_button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "//home/icliniq_n2/Music/AllFiles/geckodriver-v0.31.0-linux64/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
		WebElement c = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		c.sendKeys("sidmaghesh@icliniq.com");
		Thread.sleep(4000);
		c.clear();
		
		WebElement d = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input"));
		String e = d.getAttribute("value");
		System.out.println("The Text is:"+e);
		
		WebElement f = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		f.clear();
		f.sendKeys("Aravindhan SR7");
		
		WebElement g = driver.findElement(By.cssSelector("#contentblock > section > div:nth-child(13) > div > div > input[type=text]"));
		boolean h =  g.isEnabled();
		System.out.println("The output is:"+h);
		
		}	
}
