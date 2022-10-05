package handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "//home/icliniq_n2/Music/AllFiles/geckodriver-v0.31.0-linux64/geckodriver");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");

		WebElement check1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[1]"));
		check1.click();
		Thread.sleep(2000);
		WebElement check2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[2]"));
		check2.click();
		Thread.sleep(2000);
		WebElement check3 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[3]"));
		check3.click();
		Thread.sleep(2000);
		WebElement check4 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[4]"));
		check4.click();	
		Thread.sleep(2000);
		
	    WebElement check5 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]"));
	    boolean rose = check5.isSelected();
	    System.out.println("The Output is:"+rose);
	    Thread.sleep(2000);

	    WebElement uncheck = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]"));
	    uncheck.click();
	    Thread.sleep(2000);
	    
	    WebElement uncheck2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[2]"));
	    uncheck2.click();
	    Thread.sleep(2000);
	    	
	    driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[3]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[4]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[5]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[6]")).click();
	    Thread.sleep(2000);
	    
	    driver.close();
	
	}

}
