package handson;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class JJ 

{

	@Test
	public static void jj()
	{
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.gecko.driver","//home/icliniq_n2/Music/AllFiles/geckodriver-v0.31.0-linux64/geckodriver");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.icliniq.com/qa");
	WebElement s = driver.findElement(By.xpath("//*[@id=\"s\"]"));
	Select dive = new Select(s);
	dive.selectByValue("211");
	
	driver.findElement(By.xpath("/html/body/section[1]/div/form/div/div[2]/input[1]")).sendKeys("Are there any side effects of taking Ativan 2 mg and Rexipra Forte for a long time"+Keys.ENTER); 
		
	}

}
