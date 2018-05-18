package seleniumpackege;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String URL="https://www.flipkart.com";
		System.setProperty("Webdriver.chrome.driver","E://Selenium_Oxygen//workspace//seleniumtuts//Driver//chromedriver.exe");
		
		WebDriver driverobj= new ChromeDriver();
		driverobj.get(URL);
		
		driverobj.manage().window().maximize();
		WebElement Username=driverobj.findElement(By.xpath("//input[@type='text' and @class='_2zrpKA']"));
		Actions act = new Actions(driverobj);
		Action seriesofaction=act
				.moveToElement(Username)
				.click()
				.keyDown(Username,Keys.SHIFT)
				.sendKeys(Username, "Shraddha")
				.keyUp(Username,Keys.SHIFT)
		//This will type "Shraddha" in Upper Case		
				.doubleClick(Username)
		//This will highlight text "Shraddha"
				.contextClick().build();
		//This will bring context Menu
		seriesofaction.perform();
		//This is to perform all above actions.
		
		
	}

}
