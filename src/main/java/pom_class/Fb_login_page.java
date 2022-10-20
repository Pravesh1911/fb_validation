package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_login_page {

	
		public void Facebook_login_page (WebDriver _driver) {
			PageFactory.initElements(_driver, this);
			}
		@FindBy (id = "email")
		private WebElement Email_input_tab;
		
		@FindBy (id = "pass")
		private WebElement Password_input_tab;
		
		@FindBy (xpath = "//button[@value='1']")
		private WebElement Login_button;
		 
		
		public void Enter_Email (String Email) throws InterruptedException {
			Email_input_tab.sendKeys(Email);
			Thread.sleep(2000);
		}
		public void Enter_Password (String Password) {
			Email_input_tab.sendKeys(Password);
			
		}
		public void Click_login_button() { 
			Login_button.click();
			
			
		}
		
		
	}
	
