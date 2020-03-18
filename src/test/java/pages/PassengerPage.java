package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PassengerPage {
	private WebDriver driver;
	private By nameField1;
	private By nameField2;
	private By nameField3;
	private By nameField4;
	private By lastNameField1;
	private By lastNameField2;
	private By lastNameField3;
	private By lastNameField4;
	private By mealSelector1;
	private By mealSelector2;
	private By mealSelector3;
	private By mealSelector4;
	private By creditCardSelector;
	private By creditNumberField;
	private By expirationMonth;
	private By expirationYear;
	private By cardFirstNameField;
	private By cardMiddleNameField;
	private By cardLastNameField;
	private By addressField1;
	private By addressField2;
	private By cityField;
	private By stateProvinceField;
	private By postalCodeField;
	private By delAddressField1;
	private By delAddressField2;
	private By delCityField;
	private By delStateField;
	private By delPostalCode;
	private By securePurchaseButton;
	
	public PassengerPage(WebDriver driver) {
		this.driver = driver;
		nameField1 = By.name("passFirst0");
		nameField2 = By.name("passFirst1");
		nameField3 = By.name("passFirst2");
		nameField4 = By.name("passFirst3");
		lastNameField1 = By.name("passLast0");
		lastNameField2 = By.name("passLast1");
		lastNameField3 = By.name("passLast2");
		lastNameField4 = By.name("passLast3");
		mealSelector1 = By.name("pass.0.meal");
		mealSelector2 = By.name("pass.1.meal");
		mealSelector3 = By.name("pass.2.meal");
		mealSelector4 = By.name("pass.3.meal");
		creditCardSelector = By.name("creditCard");
		creditNumberField = By.name("creditnumber");
		expirationMonth = By.name("cc_exp_dt_mn");
		expirationYear = By.name("cc_exp_dt_yr");
		cardFirstNameField = By.name("cc_frst_name");
		cardMiddleNameField = By.name("cc_mid_name");
		cardLastNameField = By.name("cc_last_name");
		addressField1 = By.name("billAddress1");
		addressField2 = By.name("billAddress2");
		cityField = By.name("billCity");
		stateProvinceField = By.name("billState");
		postalCodeField = By.name("billZip");
		delAddressField1 = By.name("delAddress1");
		delAddressField2 = By.name("delAddress2");
		delCityField = By.name("delCity");
		delStateField =By.name("delState");
		delPostalCode = By.name("delZip");
		securePurchaseButton = By.name("buyFlights");
	}
	
	public void passengers(String passenger, String name, String lastName) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.presenceOfElementLocated(nameField1));
		if(passenger.equals("1")) {
			driver.findElement(nameField1).sendKeys(name);
			driver.findElement(lastNameField1).sendKeys(lastName);
			driver.findElement(mealSelector1).click();
			
		}else if(passenger.equals("2")) {
			driver.findElement(nameField1).sendKeys(name);
			driver.findElement(lastNameField1).sendKeys(lastName);
			driver.findElement(nameField2).sendKeys("Pedro");
			driver.findElement(lastNameField2).sendKeys("Picapiedra");
		}else if(passenger.equals("3")) {
			driver.findElement(nameField1).sendKeys(name);
			driver.findElement(lastNameField1).sendKeys(lastName);
			driver.findElement(nameField2).sendKeys("Pedro");
			driver.findElement(lastNameField2).sendKeys("Picapiedra");
			driver.findElement(nameField3).sendKeys("Juan");
			driver.findElement(lastNameField3).sendKeys("Lopez");
		}else {
			driver.findElement(nameField1).sendKeys(name);
			driver.findElement(lastNameField1).sendKeys(lastName);
			driver.findElement(nameField2).sendKeys("Pedro");
			driver.findElement(lastNameField2).sendKeys("Picapiedra");
			driver.findElement(nameField3).sendKeys("Juan");
			driver.findElement(lastNameField3).sendKeys("Lopez");
			driver.findElement(nameField4).sendKeys("Roberto");
			driver.findElement(lastNameField4).sendKeys("Bolainos");
		}
		
	}
	
	/*
	 card:
	 1 = American Express
	 2 = Mastercard
	 3 = Visa
	 4 = Discover
	 5 = Diners Club
	 6 = Carte Blanche
	 */
	public void creditCard(String card, String cardNumber, String month, String year, String name, String midName, String lastname) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.presenceOfElementLocated(creditCardSelector));
		driver.findElement(creditCardSelector).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.querySelector(\"body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(9) > td > table > tbody > tr:nth-child(2) > td:nth-child(1) > select > option:nth-child("+card+")\")");
		driver.findElement(creditNumberField).sendKeys(cardNumber);
		driver.findElement(expirationMonth).click();
		js.executeScript("document.querySelector(\"body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(9) > td > table > tbody > tr:nth-child(2) > td:nth-child(3) > select:nth-child(1) > option:nth-child("+month+")\")");
		driver.findElement(expirationYear).click();
		js.executeScript("document.querySelector(\"body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(9) > td > table > tbody > tr:nth-child(2) > td:nth-child(3) > select:nth-child(2) > option:nth-child("+year+")\")");
		driver.findElement(cardFirstNameField).sendKeys(name);
		driver.findElement(cardMiddleNameField).sendKeys(midName);
		driver.findElement(cardLastNameField).sendKeys(lastname);
		
	}
	
	//En country Argentina = 8
	public void billingAddress(String address,String city, String stateProvince, String postalCode, String country) {
		driver.findElement(addressField1).clear();
		driver.findElement(addressField1).sendKeys(address);
		driver.findElement(cityField).clear();
		driver.findElement(cityField).sendKeys(city);
		driver.findElement(stateProvinceField).clear();
		driver.findElement(stateProvinceField).sendKeys(stateProvince);
		driver.findElement(postalCodeField).clear();
		driver.findElement(postalCodeField).sendKeys(postalCode);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.querySelector(\"body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(16) > td:nth-child(2) > select > option:nth-child("+country+")\")");
	}
	
	public void deliveryAddress(String address, String city, String State, String postalCode, String country) {
		driver.findElement(delAddressField1).clear();
		driver.findElement(delAddressField1).sendKeys(address);
		driver.findElement(delCityField).clear();
		driver.findElement(delCityField).sendKeys(city);
		driver.findElement(delStateField).clear();
		driver.findElement(delStateField).sendKeys(State);
		driver.findElement(delPostalCode).clear();
		driver.findElement(delPostalCode).sendKeys(postalCode);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.querySelector(\"body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(22) > td:nth-child(2) > select > option:nth-child("+country+")\")");
		driver.findElement(securePurchaseButton).click();
	}
}
