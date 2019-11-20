
package pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindAll;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



import reuseablePackage.feature.AllActions;



public class EnterDetailsPage {

// public WebDriver driver=null;

// public EnterDetailsPage (WebDriver driver)
// 	{
// 		this.driver = driver;
// 		PageFactory.initElements(AllActions.driver, this);        // Reusable is a Reusable class where we initalize Web Driver ( public static WebDriver driver =null)
//     }
    
ThreadLocal<WebDriver> driver;
	 
	public EnterDetailsPage (ThreadLocal<WebDriver> driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver.get(), this);    
	}	


@FindBy(xpath="//input[@id='height']")public WebElement Height;

@FindBy(xpath="//input[@id='weight']")public WebElement Weight;

@FindBy(xpath="//select[@id='maritalStatus']")public WebElement MarriageStatus;

@FindBy(xpath="//select[@id='bloodGroup']")public WebElement BloodGroup;

@FindBy(xpath="//select[@id='numberOfChildren']")public WebElement Childrens;

@FindBy(xpath="//input[@id='residingCity']")public WebElement RecidencyCity;

@FindBy(xpath="//button[contains(text(),'Save')]")public WebElement Savebutton;

@FindBy(xpath="//a[@class='btn btn-primary dropdown-toggle blue-btn']")public WebElement Logout;
//pomStart
	


}
