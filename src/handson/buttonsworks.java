package handson;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttonsworks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","//home/icliniq_n2/Music/AllFiles/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://testleaf.herokuapp.com/pages/Button.html");
		WebElement position = driver.findElement(By.id("position"));
		Point a = position.getLocation();
		int cross = a.getX();
		int zee = a.getY();
		System.out.println("X value is:"+cross +"Y value is:"+zee);
		
		WebElement color =driver.findElement(By.id("color"));
		String getcolor = color.getCssValue("background-color");
		System.out.println("Color is:"+getcolor);
		
		WebElement height =driver.findElement(By.xpath("//*[@id=\"size\"]"));
	    int h = height.getSize().getHeight();
	    int w = height.getSize().getWidth();
	    System.out.println("The Height is:"+h +"The Weight is:"+w);
		
	    
	    WebElement home = driver.findElement(By.id("home"));
	    home.click();
	    
	}
}
