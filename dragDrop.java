package seleniumpackege;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String URL="http://jqueryui.com/resources/demos/droppable/default.html";
		System.setProperty("Webdriver.chrome.driver","E://Selenium_Oxygen//workspace//seleniumtuts//Driver//chromedriver.exe");
		
		WebDriver driverobj= new ChromeDriver();
		driverobj.get(URL);
		
		driverobj.manage().window().maximize();
		
		WebElement fromele=driverobj.findElement(By.xpath("//*[text()='Drag me to my target']"));
		WebElement toele = driverobj.findElement(By
				.xpath("//div[contains(@id,'droppable')]"));
		
		
		Actions act = new Actions(driverobj);
		//act.dragAndDrop(fromele, toele).build().perform();
		//Actions.dragAndDrop(Sourcelocator, Destinationlocator)	
		
		/*Point pobj = toele.getLocation();
        int xcordi = pobj.getX();
        int ycordi = pobj.getY();
        System.out.println("Element's Position from top"+ycordi +" pixels.");
        System.out.println("Element's Position from left side"+xcordi +" pixels.");
        
		act.dragAndDropBy(fromele,xcordi,ycordi).build().perform();
		*/
		
		act.clickAndHold(fromele).perform();
		
	}

}
