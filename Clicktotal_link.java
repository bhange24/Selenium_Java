package seleniumpackege;

import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.firefox.FirefoxDriver;

public class Clicktotal_link {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		 
		driver.get("http://toolsqa.wpengine.com/");
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
	     System.out.println(links.size()); 
         for (WebElement myElement : links){
        String link = myElement.getText(); 
        System.out.println(link);
        System.out.println(myElement);   
        if (link !=""){
            myElement.click();
            Thread.sleep(2000);
            System.out.println("third");
           }
           //Thread.sleep(5000);
         }
 
	}
	

}
