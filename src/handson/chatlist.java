package handson;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class chatlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "//home/icliniq_n2/Music/AllFiles/geckodriver-v0.31.0-linux64/geckodriver");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.icliniq.com/ask-a-doctor-online/icq100");
		driver.findElement(By.xpath("//*[@id=\"select2-speciality-container\"]/span"));
	    WebElement getopt =  driver.findElement(By.xpath("//*[@id=\"idBody\"]/span/span/span[1]/input"));
	    Select dri = new Select(getopt);
	    List<WebElement> size1 =  dri.getOptions();
	    int sri =  size1.size();
	    System.out.println("the total options are:" + sri);
		
	}

}
