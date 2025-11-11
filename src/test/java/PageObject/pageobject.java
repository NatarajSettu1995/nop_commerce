package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.base;

public class pageobject extends base{
	public pageobject()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='Email']")
	private WebElement email;
	
	public WebElement getEmail() {
		return email;
	}
	
	@FindBy(xpath="//input[@id='Password']")
	private WebElement password;
	
	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement login;
	
	public WebElement getLogin() {
		return login;
	}
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement LogOut;
	
	public WebElement getLogOut()
	{
		return LogOut;
	}
	
@FindBy(xpath="//h1[normalize-space(text()) = 'Dashboard']")
private WebElement afterlogintitle;

public WebElement getafterlogintitle()
{
	return afterlogintitle;
}

@FindBy(xpath="//div[@class='title']//strong")
private WebElement loginpagevalidation;

public WebElement getloginpagevalidation()
{
	return loginpagevalidation;
}
}
