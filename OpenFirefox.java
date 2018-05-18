package seleniumpackege;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String URL = "https://mail.google.com/mail/u/0/";
		System.setProperty("webdriver.gecko.driver",
				"E://Selenium_Oxygen//workspace//seleniumtuts//Driver//geckodriver.exe");
		WebDriver geckobj = new FirefoxDriver();	 
		geckobj.get(URL);

	}

}
