package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightsPage {
	private WebDriver driver;
	private By passengersSelector;
	private By departingFromSelector;
	private By onMonthSelector;
	private By onDaySelector;
	private By arrivingInSelector;
	private By returningMonthSelector;
	private By returningDaySelector;
	private By serviceClassSelector1;
	private By serviceClassSelector2;
	private By serviceClassSelector3;
	private By airlineSelector;
	private By continueButton;
	public FlightsPage(WebDriver driver) {
		this.driver = driver;
		passengersSelector = By.name("passCount");
		departingFromSelector = By.name("fromPort");
		onMonthSelector = By.name("fromMonth");
		onDaySelector = By.name("fromDay");
		arrivingInSelector = By.name("toPort");
		returningMonthSelector = By.name("toMonth");
		returningDaySelector = By.name("toDay");
		serviceClassSelector1 = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/input");
		serviceClassSelector2 = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]");
		serviceClassSelector3 = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]");
		airlineSelector = By.name("airline");
		continueButton = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input");
	} 
	
	public void flightFinder(String type, String passengers, String departingFrom, String onMonth, String onDay, String arrivingIn, String returningMonth, String returningDay, String serviceClass, String airline) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.presenceOfElementLocated(passengersSelector));
		//Type contiene 1 = Round Trip y 2 = One Way
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input["+type+"]")).click();
		driver.findElement(passengersSelector).click();
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/b/select/option["+passengers+"]")).click();
		/*Departing from: 1 = Acapulco
		                  2 = Frankfurt
		                  3 = London
		                  4 = New York
		                  5 = Paris
		                  6 = Portland
		                  7 = San Francisco
		                  8 = Seattle
		                  9 = Sydney
		                  10 = Zurich*/
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/select/option["+departingFrom+"]")).click();
		driver.findElement(onMonthSelector).click();
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[1]/option["+onMonth+"]")).click();
		driver.findElement(onDaySelector).click();
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[2]/option["+onDay+"]")).click();
		driver.findElement(arrivingInSelector).click();
		/*Arriving In: 1 = Acapulco
        2 = Frankfurt
        3 = London
        4 = New York
        5 = Paris
        6 = Portland
        7 = San Francisco
        8 = Seattle
        9 = Sydney
        10 = Zurich*/
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td[2]/select/option["+arrivingIn+"]")).click();
		driver.findElement(returningMonthSelector).click();
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/select[1]/option["+returningMonth+"]")).click();
		driver.findElement(returningDaySelector).click();
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/select[2]/option["+returningDay+"]")).click();
		/*
		 Service Class:
		 0 = Economy class
		 1 = Business class
		 3 = First class
		 */
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input["+serviceClass+"]")).click();
		driver.findElement(airlineSelector).click();
		/*
		 Airline:
		 1 = No Preference
		 2 = Blue Skies Airlines
		 3 = Unified Airlines
		 4 = Pangea Airlines
		 */
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/select/option["+airline+"]")).click();
		driver.findElement(continueButton).click();
	}
}
