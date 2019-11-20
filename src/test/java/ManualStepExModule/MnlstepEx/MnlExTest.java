
// package ManualStepExModule.MnlstepEx;
// import pom.LoginPage1;
// import pom.HomePage1;
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
// public class MnlExTest extends  AllActions {
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
