package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_login_page {

	public  Fb_login_page(WebDriver driver) {
		//Pagefactory.initElement(driver,this);
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email") private WebElement Email;
	
	@FindBy(xpath = "//input[@id='pass']") private WebElement PassWord;
	
	@FindBy(tagName = "button") private WebElement Login_Button;
	
	@FindBy (xpath = "//h2[contains(text(),'share with the peopl')]") private WebElement Welcome_Text;
	
	public void Enter_Email(String email) {
		Email.sendKeys(email);
	}
	
	public void Clear_Email() {
		Email.clear();
	}
	
	public void Enter_Password(String password) {
		PassWord.sendKeys(password);
	}
	
	public void Click_On_Login() {
		Login_Button.click();
	}
	
	public String Get_Welcome_Text() {
		return Welcome_Text.getText();
	}
	

}
	
