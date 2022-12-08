package utility;





import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class SeleniumOperations
{
	
	public static ChromeDriver driver=null;
	public static Actions act=null;
	public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
	
//browser Launch
	public static Hashtable<String, Object> browserLaunch(Object[]inputParameters)
	{
		try
		{
		String key=(String) inputParameters[0];
		String value=(String) inputParameters[1];
		System.setProperty(key, value);
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:browserLaunch, InputGiven: " + inputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:browserLaunch, InputGiven: " + inputParameters[0].toString());
		}
		return outputParameters;
	}
	
  //openApplication
	public static Hashtable<String,Object> openApplication(Object [] inputParameters)
	{
		try
		{
		String url=(String) inputParameters[0];
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:openApplication, InputGiven: " + inputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:openApplication, InputGiven: " + inputParameters[0].toString());
		}
		return outputParameters;
	}
	
//clickOnElement
	public static Hashtable<String,Object> clickOnElement(Object [] inputParameters)
	{
		try
		{

	   String xpath=(String) inputParameters[0];
		driver.findElementByXPath(xpath).click();

		String url=(String) inputParameters[0];
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:clickOnElement, InputGiven: " + inputParameters[0].toString());

		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:clickOnElement, InputGiven: " + inputParameters[0].toString());
		}
		return outputParameters;
     }
	
 //mouseOverAction
	public static Hashtable<String,Object> mouseOver(Object [] inputParameters)
	{
		try
		{
		String xpath=(String) inputParameters[0];
		 Actions act=new Actions(driver);
		
		WebElement a=driver.findElementByXPath(xpath);
	    act.moveToElement(a).build().perform();
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:mouseOver, InputGiven: " + inputParameters[0].toString());

		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:mouseOver, InputGiven: " + inputParameters[0].toString());
         }
		return outputParameters;
	  }
	
	//clickonMyProfile
	public static Hashtable<String,Object> clickonMyProfile(Object[]inputParameters)
	{
		try
		{
		String xpath=(String)inputParameters[0];
		driver.findElementByXPath(xpath).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:clickonMyProfile, InputGiven: " + inputParameters[0].toString());

		}
		catch(Exception e)
		{
			 outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MESSAGE", "methodUsed:clickonMyProfile, InputGiven: " + inputParameters[0].toString());
         }
		return outputParameters;
	}
	
	//enterUsername
	public static Hashtable<String,Object> Username(Object[] inputParameters)
	{
		try
		{
		String xpath=(String)inputParameters[0];
		String value=(String)inputParameters[1];
		driver.findElementByXPath(xpath).sendKeys(value);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:enterUsername, InputGiven: " + inputParameters[1].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:enterUsername, InputGiven: " + inputParameters[1].toString());
		}
		return outputParameters;

		
	}

//enterPassword
		public static Hashtable<String,Object> Password(Object[] inputParameters)
		{
			try
			{

			String xpath=(String)inputParameters[0];
			String value=(String)inputParameters[1];
			driver.findElementByXPath(xpath).sendKeys(value);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed:enterPassword, InputGiven: " + inputParameters[1].toString());

			}
			catch(Exception e)
			{
				outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MESSAGE", "methodUsed:enterPasword, InputGiven: " + inputParameters[1].toString());
			}
			return outputParameters;
		}
		
//click on LoginButton
		public static Hashtable<String,Object> clickonElement(Object[]inputParameters) 
		{
			try
			{
			String xpath=(String)inputParameters[0];
			driver.findElementByXPath(xpath).click();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed:clickonElement, InputGiven: " + inputParameters[0].toString());
			}
			catch(Exception e)
			{
				outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MESSAGE", "methodUsed:clickonElemewnt, InputGiven: " + inputParameters[0].toString());
			}
			return outputParameters;
		}
		
//validateLogin
		public static  Hashtable<String,Object> manageAddresses(Object[]inputParameters)
		{
			try
			{
			String requiredUrl=(String)inputParameters[0];  
			
			String catchUrl=driver.findElementByXPath(requiredUrl).getText(); 
			System.out.println(catchUrl);
			
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			if(requiredUrl.equalsIgnoreCase(catchUrl))
			{
			 System.out.println("Test Case Pass");	
			}
			else
			{
			 System.out.println("Test Case Fail");
			}
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed:manageAddresses, InputGiven: " + inputParameters[0].toString());
		
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
		   outputParameters.put("MESSAGE", "methodUsed:manageAddresses, InputGiven: " + inputParameters[0].toString());
		}
return outputParameters;
		
			
		}

		
	
}
	
	
	
	

	
	
	
	
			
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
	
	

