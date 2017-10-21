package pack1;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FacebookScreenShotTest {
WebDriver driver;
	
    
	@Test
	public void captureScreenshot() throws Exception
	{
    	
    		driver=new FirefoxDriver();
    		  driver.manage().window().maximize();
    	    driver.get("http://www.facebook.com");
	driver.findElement(By.xpath(".//*[@id='emailasdasdas']")).sendKeys("Learn Automation");
	Thread.sleep(2000);
	}
	// It will execute after every test execution 
	@AfterMethod
	public void tearDown(ITestResult result)
	{
	// Here will compare if test is failing then only it will enter into if condition
	if(ITestResult.FAILURE==result.getStatus())
	{
	try 
	{	String timeStamp;
	File screenShotName;
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()); 
		screenShotName = new File("D:\\MyTest\\Screenshots\\"+timeStamp+".png");
		FileUtils.copyFile(scrFile, screenShotName);
		 System.out.println("screen shot taken");
		String filePath = screenShotName.toString();
		String path = "<img src=\"file://" + filePath + "\" alt=\"\"/>";;
		Reporter.log(path);
		
		// Create refernce of TakesScreenshot
	/*TakesScreenshot ts=(TakesScreenshot)driver;
	// Call method to capture screenshot
	File source=ts.getScreenshotAs(OutputType.FILE);
	 
	// Copy files to specific location here it will save all screenshot in our project home directory and
	// result.getName() will return name of test case so that screenshot name will be same
	FileUtils.copyFile(source, new File("./screenshotstore/"+result.getName()+".png"));*/
	 
	System.out.println("Screenshot path :"+path);
	} 
	catch (Exception e)
	{
	 
	System.out.println("Exception while taking screenshot "+e.getMessage());
	} 
	 
	 
	 
	}
	// close application
	//driver.quit();
	}
	 
	 
	 
	}

