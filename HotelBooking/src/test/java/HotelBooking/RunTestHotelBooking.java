package HotelBooking;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( plugin = {"pretty"},glue= {"HotelBooking"},features= {"src/test/resources/HotelBooking"})
public class RunTestHotelBooking {

}
