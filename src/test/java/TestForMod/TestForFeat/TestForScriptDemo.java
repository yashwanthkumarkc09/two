
// package TestForMod.TestForFeat;
// import pom.LoginPage1;
// import java.io.File;
// import java.io.IOException;
// import org.openqa.selenium.support.ui.WebDriverWait;
// import org.testng.ITestResult;
// import org.testng.Reporter;
// import org.testng.annotations.AfterClass;
// import org.testng.annotations.AfterTest;
// import org.testng.annotations.Test;
// import reuseablePackage.feature.AllActions;
// import reuseablePackage.feature.CustomizedReport2;
// import reuseablePackage.feature.JavaMethods;
// import java.net.MalformedURLException;
// public class TestForScriptDemo extends  AllActions {
// 	AllActions actions=new AllActions();  
// 	JavaMethods javamethod =  new JavaMethods();  
//     String fileName=this.getClass().getSimpleName();    //common
// 	String packageName=this.getClass().getPackage().getName();   
//     String methodName;                                  //common
//     // String path=new AllActions().folderCreation(fileName);   //common
//     String reportRuncount = actions.getJsonValue(packageName,fileName, "ExecutionCount", "reportCount");//common added 27/03/19
//     String suiteName = actions.getJsonValue(packageName,fileName,"SuiteName","suiteName");//common added 27/03/19
//     String path = actions.folderCreation(reportRuncount,suiteName,fileName);   //common
// 	String path1 = actions.folderCreation1(reportRuncount,suiteName,fileName);
//     String browserName=new AllActions().getJsonValue(packageName,fileName, "BrowserDetails", "Browser");   //common
//     String  browserVersion=new AllActions().getJsonValue(packageName,fileName, "BrowserDetails", "Version");  //common
//     String ipAddress=new AllActions().getJsonValue(packageName,fileName, "IpAddress", "IP"); //common
//     //String packageName=this.getClass().getPackage().getName();   
//     int implicitTimeOut=Integer.parseInt(new AllActions().getJsonValue(packageName,fileName, "Timeout", "ImplicitWait"));  //common
//     String screenshotOption=new AllActions().getJsonValue(packageName,fileName, "ScreenshotOption", "CaptureOnEveryStep");  //c  //c
//     String failScreenshotoption = new AllActions().getJsonValue(packageName,fileName, "ScreenshotOption", "CaptureOnFailure");//channged

// int excelValueCount;
	
// 	@Test(priority=0)
// 	public void step_0() throws Exception                                              //------------Method auto creation ------------//
// 	{
// 	try
// 	{ 
// 	actions.OpenNewBrowser(browserName, browserVersion,ipAddress,implicitTimeOut);
// 	String videoPath=actions.startVideoRecord(reportRuncount,suiteName,fileName);
// 	String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();       
// 	actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);

// 	Reporter.log(browserName);
//     Reporter.log(browserVersion);
//     Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
//     Reporter.log(videoPath);


// 	}
// 	catch(Exception e)
// 	{
// 		String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
//         actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
//         Reporter.log(browserName);
//         Reporter.log(browserVersion);
//         Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
// 		//actions.CaptureOnFailure(reportRuncount,suiteName,fileName,failScreenshotoption);
// 		e.printStackTrace();
// 		actions.captureDOM(path,fileName);
// 		actions.stopVideoRecord();
// 		actions.CloseCurrentTab();
// 		throw e;
// 	}
// 	}
// 		@Test(priority=1)
//         public void step_1() throws Exception
//         {
//         try
//         {
//             excelValueCount=javamethod.ExcelRowCount("./Excel/UsersForloop.xlsx","Sheet1");

//             String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
//         actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
//         Reporter.log(browserName);
//         Reporter.log(browserVersion);
//         Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
//             }
//         catch(Exception e)
//         {
//         String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
//         actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
//         Reporter.log(browserName);
//         Reporter.log(browserVersion);
//         Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
//         e.printStackTrace();
//         actions.captureDOM(path,fileName);
//         actions.stopVideoRecord();
//         actions.CloseCurrentTab();
//         driver.get().quit();
//         throw e;
//         } 
//         };

//             @Test(priority=2)
//         public void step_2() throws Exception
//         {
//         try
//         {
//             for(int i=1; i<=excelValueCount;i++){
// actions.EnterApplicationURL("http://web.meehappy.com:9090/login");
// actions.EnterData(new LoginPage1(driver).username,actions.getData("./Excel/UsersForloop.xlsx","Sheet1",i,0));
// actions.EnterData(new LoginPage1(driver).password,actions.getData("./Excel/UsersForloop.xlsx","Sheet1",i,1));
// actions.Click(new LoginPage1(driver).login);
// }//For-End

//             String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
//         actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
//         Reporter.log(browserName);
//         Reporter.log(browserVersion);
//         Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
//             actions.stopVideoRecord();   
//         actions.CloseCurrentTab();   
//         actions.AssertAll(); 
//         driver.get().quit();
//             }
//         catch(Exception e)
//         {
//         String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
//         actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
//         Reporter.log(browserName);
//         Reporter.log(browserVersion);
//         Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
//         e.printStackTrace();
//         actions.captureDOM(path,fileName);
//         actions.stopVideoRecord();
//         actions.CloseCurrentTab();
//         driver.get().quit();
//         throw e;
//         } 
//         };

           
// }