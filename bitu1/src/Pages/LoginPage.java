package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	
		static WebDriver driver;
		  public LoginPage(WebDriver driver)
		    {
		    	this.driver=driver;
		    	
		    }
		//username
		@FindBy(id="user_login")
		WebElement userName;
		//password
		@FindBy(how=How.ID,using="user_pass")
		WebElement password;
		//loginBtn
		@FindBy(how=How.XPATH,using=".//*[@id='wp-submit']")
		WebElement submit_button;
		//forgot password
	    @FindBy(how=How.LINK_TEXT,using="Lost your password?")
		WebElement forget_password_link;
	    public void login_App(String uid,String pass)
	    {
	    userName.sendKeys(uid);
	    password.sendKeys(pass);
	    submit_button.click();
	    }
	   
	   public String getLoginTitle()
	   {return forget_password_link.getText();
		   
	   }
		
	}

