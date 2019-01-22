

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login
{
	WebDriver driver;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="pass")
	WebElement pwd;
	
	@FindBy(id="send2")
	WebElement login;

	public Login(WebDriver driver)
	{
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void typeEmail(String username)
	{
		email.sendKeys(username);
	}
	
	public void typePassword(String pass)
	{
		pwd.sendKeys(pass);
	}
	
	public void clickOnLogin()
	{
		login.click();
	}
	
	
	
	

}
