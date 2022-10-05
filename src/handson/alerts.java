package handson;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class alerts {

	@Test
	public static void alert() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"//home/icliniq_n2/Music/AllFiles/geckodriver-v0.31.0-linux64/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("http://testleaf.herokuapp.com/pages/Alert.html");
		WebElement cloud = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
		cloud.click();
		Alert acc = driver.switchTo().alert();
		Thread.sleep(2000);
		acc.accept();

		WebElement D = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		D.click();
		Alert dis = driver.switchTo().alert();
		Thread.sleep(2000);
		dis.dismiss();

		WebElement E = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		E.click();
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("Talent ellam onnum ila bro.. Kiruba Kiruba Kiruba Kiruba");
		Thread.sleep(2000);
		prompt.accept();
		
	}
}