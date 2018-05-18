package seleniumpackege;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String URL="https://www.flipkart.com";
		System.setProperty("Webdriver.chrome.driver","E://Selenium_Oxygen//workspace//seleniumtuts//Driver//chromedriver.exe");
		
		WebDriver driverobj= new ChromeDriver();
		driverobj.get(URL);
		
		driverobj.manage().window().maximize();
		WebElement Username=driverobj.findElement(By.xpath("//input[@type='text' and @class='_2zrpKA']"));
		Username.sendKeys("shraddha.bhange24@gmail.com");
		WebElement pwd=driverobj.findElement(By.xpath("//input[@type='password' and @class='_2zrpKA _3v41xv']"));
		pwd.sendKeys("anshil24");
		
		WebElement login=driverobj.findElement(By.xpath("//button[@type='submit' and @class='_2AkmmA _1LctnI _7UHT_c']"));
		//login.submit();
		login.sendKeys(Keys.ENTER);
		
		WebElement women=driverobj.findElement(By.xpath("//*[contains(@title,'Women')]"));
		women.click();
	}

}
