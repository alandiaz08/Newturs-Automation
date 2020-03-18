package test;



import org.testng.annotations.Test;

import driver.WebDriverManager;
import pages.FlightConfirmationPage;
import pages.FlightsPage;
import pages.HomePage;
import pages.PassengerPage;
import pages.SelectedFlightPage;

public class TestOne extends WebDriverManager{
	@Test
	public void test() {
		HomePage home = new HomePage(driver);
		home.login("kuruken", "1156911006");
		FlightsPage flight = new FlightsPage(driver);
		//La cantidad de pasajeros tiene que ser igual en passengers como flights
		flight.flightFinder("1","1", "1", "8", "12", "2", "9", "4", "2", "1");
		SelectedFlightPage SelectedFlight = new SelectedFlightPage(driver);
		SelectedFlight.departFlight("5");
		SelectedFlight.returnFlight("5");
		PassengerPage passenger = new PassengerPage(driver);
		passenger.passengers("1", "Sasuke", "Uchiha");
		passenger.creditCard("1", "1234123412341234", "2", "3", "Sasuke", "No", "Uchiha");
		passenger.billingAddress("Rivadavia 123", "Buenos Aires", "Buenos Aires", "1424", "8");
		passenger.deliveryAddress("Rivadavia 123", "Buenos Aires", "Buenos Aires", "1424", "8");
		FlightConfirmationPage FlightConfirmation = new FlightConfirmationPage(driver);
		FlightConfirmation.FlightConfirmation();
	}
}
