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
		WebElement fromele=driverobj.findElement(By.xpath("//*[text()='Drag me to my target']"));
  		WebElement toele = driverobj.findElement(By.xpath("//div[contains(@id,'droppable')]"));
  
		//Drag and drop the element by simply providing xpath 
		Actions act = new Actions(driverobj);
		act.dragAndDrop(fromele, toele).build().perform();
 		//Actions.dragAndDrop(Sourcelocator, Destinationlocator) 
  
 		//Using X and Y cordinate of Destination element
	  	Point pobj = toele.getLocation();
		int xcordi = pobj.getX();
		int ycordi = pobj.getY();
		System.out.println("Element's Position from top"+ycordi +" pixels.");
		System.out.println("Element's Position from left side"+xcordi +" pixels.");
	  	act.dragAndDropBy(fromele,xcordi,ycordi).build().perform();
  
 		//Applying Click And Hold action an any element 
  		act.clickAndHold(fromele).perform();
		
		
	}

}
