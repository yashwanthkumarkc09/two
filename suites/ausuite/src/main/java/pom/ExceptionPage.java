
package pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindAll;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



import reuseablePackage.feature.AllActions;



public class ExceptionPage {

// public WebDriver driver=null;

// public ExceptionPage (WebDriver driver)
// 	{
// 		this.driver = driver;
// 		PageFactory.initElements(AllActions.driver, this);        // Reusable is a Reusable class where we initalize Web Driver ( public static WebDriver driver =null)
//     }
    
ThreadLocal<WebDriver> driver;
	 
	public ExceptionPage (ThreadLocal<WebDriver> driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver.get(), this);    
	}	


@FindBy(id="userName")public WebElement Eusername;

@FindBy(id="password")public WebElement Epassword;

@FindBy(id="WrongI")public WebElement Elogin;

@FindBy(xpath="//a[contains(text(),'Click to update')]")public WebElement EUpdateButton;
//pomStart
	


}
