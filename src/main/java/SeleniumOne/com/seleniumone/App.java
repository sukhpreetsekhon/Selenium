package SeleniumOne.com.seleniumone;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class App
{
    public static void main( String[] args )
    {
    	//declare drivers
    	WebDriver driver;
    	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
    	driver = new FirefoxDriver();
    	
    	//declare urls
    	String baseURL = "http://www.facebook.com";
    	String TagName = "";
    	
    	//test case
    	driver.get(baseURL);
    	TagName = driver.findElement(By.id("pass")).getTagName();
    	System.out.println(TagName);
    	
    	//close everything
    	driver.close();
        System.exit(0);
    	
        
        
    }
}
