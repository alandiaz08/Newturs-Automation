package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driver.WebDriverManager;

public class HomePage extends WebDriverManager{ 
	private WebDriver driver;
	private By userNameField;
	private By passworddield;
	private By signInButton;
	
	public HomePage(WebDriver driver){
		this.driver =driver;
		userNameField = By.name("userName");
		passworddield = By.name("password");
		signInButton = By.name("login");
	}
	
	public void login(String user,String pass) {
		driver.findElement(userNameField).sendKeys(user);
		driver.findElement(passworddield).sendKeys(pass);
		driver.findElement(signInButton).click();
	}
	
	
}
