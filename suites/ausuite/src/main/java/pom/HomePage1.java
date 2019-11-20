
package pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindAll;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



import reuseablePackage.feature.AllActions;



public class HomePage1 {

// public WebDriver driver=null;

// public HomePage1 (WebDriver driver)
// 	{
// 		this.driver = driver;
// 		PageFactory.initElements(AllActions.driver, this);        // Reusable is a Reusable class where we initalize Web Driver ( public static WebDriver driver =null)
//     }
    
ThreadLocal<WebDriver> driver;
	 
	public HomePage1 (ThreadLocal<WebDriver> driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver.get(), this);    
	}	


@FindBy(xpath="//strong[contains(text(),'Welcome to MeeHappy')]")public WebElement WelcomeText;

@FindBy(xpath="//a[contains(text(),'Click to update')]")public WebElement UpdateButton;

@FindBy(xpath="//a[@id='edit-btn']//img")public WebElement EditIcon;
//pomStart
	


}
