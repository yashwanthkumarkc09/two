
package pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindAll;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



import reuseablePackage.feature.AllActions;



public class ImportingPage {

// public WebDriver driver=null;

// public ImportingPage (WebDriver driver)
// 	{
// 		this.driver = driver;
// 		PageFactory.initElements(AllActions.driver, this);        // Reusable is a Reusable class where we initalize Web Driver ( public static WebDriver driver =null)
//     }
    
ThreadLocal<WebDriver> driver;
	 
	public ImportingPage (ThreadLocal<WebDriver> driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver.get(), this);    
	}	


@FindBy(id="userName")public WebElement usernamei;

@FindBy(id="password")public WebElement passwordi;

@FindBy(id="loginBtn")public WebElement logini;

@FindBy(xpath="//span[contains(text(),'Happy Me')]")public WebElement HappyMeei;
//pomStart
	


}
