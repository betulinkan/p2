package ActualTestCase;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;

import org.testng.annotations.Test;


import Pages.LoginPage;

import Utility.BrowserFactoty;


public class VerifyValidLogin 
{


  @Test
  
public void validUserCheck ()
  
{
	
WebDriver driver= BrowserFactoty.StartBrowser("firefox", "http://demosite.center/wordpress/wp-login.php");
	
LoginPage login_page=PageFactory.initElements(driver,LoginPage.class);

	 login_page.login_App("admin","demo123");
	
//Boolean flag=login_page.getLoginTitle().contains("Lost your password?");
	
//Assert.assertTrue(flag, "msg is verified");
	
//System.out.println("passed");

  }
}
