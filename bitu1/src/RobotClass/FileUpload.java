package RobotClass;


import java.awt.Robot;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FileUpload {
  @Test
  public void fileUploadExa() throws Throwable 
  {
	  WebDriver d=new FirefoxDriver();
	  StringSelection sel=new StringSelection("C:\\Users\\linkan\\Desktop\\deepak.docx");
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
	  d.get("http://my.monsterindia.com/create_account.html");
	  Thread.sleep(2000);
	  JavascriptExecutor js = (JavascriptExecutor)d;
	  js.executeScript("scroll(0,350)");
	  Thread.sleep(5000);

	 d.findElement(By.id("wordresume")).click();
	 
	  System.out.println("Browse button clicked");
	 
	 // Create object of Robot class
	Robot robot = new Robot();
	 Thread.sleep(1000);
	      
	  // Press Enter
	 robot.keyPress(KeyEvent.VK_ENTER);
	 
	// Release Enter
	 robot.keyRelease(KeyEvent.VK_ENTER);
	 
	  // Press CTRL+V
 robot.keyPress(KeyEvent.VK_CONTROL);
	 robot.keyPress(KeyEvent.VK_V);
	 
	// Release CTRL+V
	 robot.keyRelease(KeyEvent.VK_CONTROL);
	 robot.keyRelease(KeyEvent.VK_V);
	 Thread.sleep(1000);
	        
	        // Press Enter 
	  robot.keyPress(KeyEvent.VK_ENTER);
	 robot.keyRelease(KeyEvent.VK_ENTER);
	 
	  
	  
  }
}
