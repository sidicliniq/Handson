package handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radiobutton 

{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "//home/icliniq_n2/Music/AllFiles/geckodriver-v0.31.0-linux64/geckodriver");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/radio.html");
	
		WebElement radio = driver.findElement(By.xpath("//*[@id=\"yes\"]"));
		radio.click();
		
		WebElement firstbutton = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input[1]"));
		WebElement secondbutton = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input[2]"));
		boolean one = firstbutton.isSelected();
		boolean two = secondbutton.isSelected();
		System.out.println("First button is"+one+"Second button is:"+two);					
				
	}

}
