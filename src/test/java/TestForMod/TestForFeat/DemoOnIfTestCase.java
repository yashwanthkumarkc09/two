
package TestForMod.TestForFeat;
import pom.LoginPage1;
import pom.DemoObjectsPage;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import reuseablePackage.feature.AllActions;
import reuseablePackage.feature.CustomizedReport2;
import reuseablePackage.feature.JavaMethods;
import java.net.MalformedURLException;

public class DemoOnIfTestCase extends  AllActions {
	AllActions actions=new AllActions();  
	JavaMethods javamethod =  new JavaMethods();  
    String fileName=this.getClass().getSimpleName();    //common
	String packageName=this.getClass().getPackage().getName();   
    String methodName;                                  //common
    // String path=new AllActions().folderCreation(fileName);   //common
    String reportRuncount = actions.getJsonValue(packageName,fileName, "ExecutionCount", "reportCount");//common added 27/03/19
    String suiteName = actions.getJsonValue(packageName,fileName,"SuiteName","suiteName");//common added 27/03/19
    String path = actions.folderCreation(reportRuncount,suiteName,fileName);   //common
	String path1 = actions.folderCreation1(reportRuncount,suiteName,fileName);

    String browserName=new AllActions().getJsonValue(packageName,fileName, "BrowserDetails", "Browser");   //common
    String  browserVersion=new AllActions().getJsonValue(packageName,fileName, "BrowserDetails", "Version");  //common

    String ipAddress=new AllActions().getJsonValue(packageName,fileName, "IpAddress", "IP"); //common
    //String packageName=this.getClass().getPackage().getName();   
    int implicitTimeOut=Integer.parseInt(new AllActions().getJsonValue(packageName,fileName, "Timeout", "ImplicitWait"));  //common
    String screenshotOption=new AllActions().getJsonValue(packageName,fileName, "ScreenshotOption", "CaptureOnEveryStep");  //c  //c
    String failScreenshotoption = new AllActions().getJsonValue(packageName,fileName, "ScreenshotOption", "CaptureOnFailure");//channged

String actualValue;
String expectedValue="Welcome to MeeHappy";
	
	@Test(priority=0)
	public void step_0() throws Exception                                              //------------Method auto creation ------------//
	{
	try
	{ 
	actions.OpenNewBrowser(browserName, browserVersion,ipAddress,implicitTimeOut);

	String videoPath=actions.startVideoRecord(reportRuncount,suiteName,fileName);
	String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();       
	actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
	Reporter.log(browserName);
    Reporter.log(browserVersion);
    Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
    Reporter.log(videoPath);


	}
	catch(Exception e)
	{
		String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
        actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
		//actions.CaptureOnFailure(reportRuncount,suiteName,fileName,failScreenshotoption);
		e.printStackTrace();
		actions.captureDOM(path,fileName);
		actions.stopVideoRecord();
		actions.CloseCurrentTab();
		throw e;
	}
	}
		@Test(priority=1)
        public void step_1() throws Exception
        {
        try
        {
            actions.EnterApplicationURL("http://web.meehappy.com:9090/login");

            String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
        actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
            }
        catch(Exception e)
        {

        String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
        actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));

        e.printStackTrace();
        actions.captureDOM(path,fileName);
        actions.stopVideoRecord();
        actions.CloseCurrentTab();
        driver.get().quit();
        throw e;
        } 
        };

            @Test(priority=2)
        public void step_2() throws Exception
        {
        try
        {
            actions.EnterData(new LoginPage1(driver).username,"balakrishna@opaltechsolutions.com");

            String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
        actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
            }
        catch(Exception e)
        {
        String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
        actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
        e.printStackTrace();
        actions.captureDOM(path,fileName);
        actions.stopVideoRecord();
        actions.CloseCurrentTab();
        driver.get().quit();
        throw e;
        } 
        };

            @Test(priority=3)
        public void step_3() throws Exception
        {
        try
        {
            actions.EnterData(new LoginPage1(driver).password,"Opal@1234");

            String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
        actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
            }
        catch(Exception e)
        {
        String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
        actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
        e.printStackTrace();
        actions.captureDOM(path,fileName);
        actions.stopVideoRecord();
        actions.CloseCurrentTab();
        driver.get().quit();
        throw e;
        } 
        };

            @Test(priority=4)
        public void step_4() throws Exception
        {
        try
        {
            actions.Click(new LoginPage1(driver).login);

            String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
        actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
            }
        catch(Exception e)
        {
        String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
        actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
        e.printStackTrace();
        actions.captureDOM(path,fileName);
        actions.stopVideoRecord();
        actions.CloseCurrentTab();
        driver.get().quit();
        throw e;
        } 
        };

            @Test(priority=5)
        public void step_5() throws Exception
        {
        try
        {
            actualValue=actions.GetObjectText(new DemoObjectsPage(driver).displayText);

            String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
        actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
            }
        catch(Exception e)
        {
        String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
        actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
        e.printStackTrace();
        actions.captureDOM(path,fileName);
        actions.stopVideoRecord();
        actions.CloseCurrentTab();
        driver.get().quit();
        throw e;
        } 
        };

            @Test(priority=6)
        public void step_6() throws Exception
        {
        try
        {
            actions.AssertEqualsForString(actualValue,expectedValue);

            String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
        actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
            actions.stopVideoRecord();   
        actions.CloseCurrentTab();   
        actions.AssertAll(); 
        driver.get().quit();
            }
        catch(Exception e)
        {
        String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
        actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
        e.printStackTrace();
        actions.captureDOM(path,fileName);
        actions.stopVideoRecord();
        actions.CloseCurrentTab();
        driver.get().quit();
        throw e;
        } 
        };

           
}