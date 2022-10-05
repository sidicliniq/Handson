package handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class timecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "//home/icliniq_n2/Music/AllFiles/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
		WebElement a = driver.findElement(By.id("email"));
		a.sendKeys("Who are you");
				
		WebElement b = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		String c = b.getAttribute("value");
		System.out.println("The Text is:"+c);
		
		WebElement d = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		d.clear();
		d.sendKeys("Aravindhan SR7");
		
		WebElement e = driver.findElement(By.cssSelector("#contentblock > section > div:nth-child(13) > div > div > input[type=text]"));
		boolean f =  e.isEnabled();
		System.out.println("The output is:"+f);
		
		WebElement g = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		g.sendKeys("Need to append successfully");
		
		WebElement h = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		h.clear();
	}

}
