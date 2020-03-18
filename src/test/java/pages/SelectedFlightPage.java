package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectedFlightPage {
	private WebDriver driver;
	private By continueButton;
	
	public SelectedFlightPage(WebDriver driver) {
		this.driver = driver;
		continueButton = By.name("reserveFlights");
	}
	
	// En depart 1 option = 3, 2 option = 5, 3 option = 7, 4 option = 9 
	public void departFlight(String departF) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[3]/td[1]/input")));
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr["+departF+"]/td[1]/input")).click();
	}
	// En depart 1 option = 3, 2 option = 5, 3 option = 7, 4 option = 9 
	public void returnFlight(String returnF) {
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr["+returnF+"]/td[1]/input")).click();
		driver.findElement(continueButton).click();
	}
	
	
}
