package BaseLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseClass {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/reg/");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.redbus.in/");
	}

}
