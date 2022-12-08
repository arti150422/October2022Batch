package utility;

import java.util.Hashtable;

public class Calling
{
	
	public void main(String[]args)
	{
		//browser Launch
		Object [] input=new Object[2];
		input[0]="webdriver.chrome.driver";
		input[1]="F:\\Automation Support\\ChromeDriver.exe";
		SeleniumOperations.browserLaunch(input);
	
		//openApplication
		Object [] input1=new Object[1];
		input1[0]="https://www.flipkart.com/";
		SeleniumOperations.openApplication(input1);
	
       //clickonElement
		Object [] input2=new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		SeleniumOperations.clickOnElement(input2);
	

		 //mouseOver
		Object [] input3=new Object[1];
		input3[0]="//*[text()='Login']";
		SeleniumOperations.mouseOver(input3);
	
		//click on MyProfile
		Object [] input4=new Object[1];
		input4[0]="//*[text()='My Profile']";
		SeleniumOperations.clickOnElement(input4);
	
        //enterUsername
		Object [] input5=new Object[2];
		input5[0]="(//*[@type='text'])[2]";
		input5[1]="8010488270";
		SeleniumOperations.Username(input5);
	
		//enterPassword
		Object [] input6=new Object[2];
		input6[0]="//*[@type='password']";
		input6[1]="Arti";
		SeleniumOperations.Password(input6);
	
		//click on  LoginButton
		Object [] input7=new Object[2];
		input7[0]="(//*[@type='submit'])[2]";
		SeleniumOperations.clickOnElement(input7);
			
				
		//manageAddresses
		Object [] input8=new Object[2];
		input8[0]="//*[text()='Manage Addresses']";
	    SeleniumOperations.manageAddresses(input8);
				

		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
