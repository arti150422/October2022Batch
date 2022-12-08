package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt {

	public static void main(String[] args) throws Throwable 
	{
	    //LaunchBrowser
		System.setProperty("webdriver.chrome.driver","F:\\Automation Support\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//openApplication
		driver.get("https://www.flipkart.com/");
		
		// cancle login page
		driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();      
		//Move to element
		Actions act=new Actions(driver);
		
		WebElement a=driver.findElementByXPath("//*[text()='Login']");
	    act.moveToElement(a).build().perform();
	    
	    //click on my profile
	    driver.findElementByXPath("//*[text()='My Profile']").click();
	    
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    //enterUsername
	    driver.findElementByXPath("(//*[@type='text'])[2]").sendKeys("8010488270");
	    //enter Password
	    driver.findElementByXPath("//*[@type='password']").sendKeys("Arti");
	    //click on login button
	    driver.findElementByXPath("(//*[@type='submit'])[2]").click();
	    
	  Thread.sleep(5000);
	  driver.findElementByXPath("//*[text()='Manage Addresses']").click();
	  driver.findElementByClassName("_1QhEVk").click();
	  driver.findElementByXPath("//*[@name='name']").sendKeys("Abhi Gandal");
	  driver.findElementByXPath("//*[@name='phone']").sendKeys("8010488270");
	  driver.findElementByXPath("//*[@name='pincode']").sendKeys("415613");
	  driver.findElementByXPath("//*[@name='addressLine2']").sendKeys("6/2");
	  driver.findElementByXPath("//*[@name='addressLine1']").sendKeys("Ratnagiri");
	  driver.findElementByXPath("(//*[@type='button'])[2]").click();
	  
	    
	    
	    
		
	
	  
	  
	  
	  
	  
	  
	  
	  

	}

	
	}

