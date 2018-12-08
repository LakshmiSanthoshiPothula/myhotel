package HotelBooking;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionHotelBooking {
	HotelBookingPageFactory hotelPageFact;
	
	WebDriver driver=null;

	@Given("^User is already in hotel booking page$")
	public void user_is_on_Sign_page(){
		System.setProperty("webdriver.chrome.driver", "D:\\BDD libs\\jar-files\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().to("file:///D:/BDD%20libs/App/hotelbooking.html");
	    
        hotelPageFact=new HotelBookingPageFactory(driver);
	}

	@Then("^check the heading of the page$")
	public void check_the_heading_of_the_page(){
		String title = driver.getTitle();
		if (title.equals("Hotel Booking"))
			System.out.println("title is same");
		else
			System.out.println(" Title doesnt match");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.close();
   
	    
	}
	
	
	@When("^first Name is empty$")
	public void first_Name_is_empty() throws InterruptedException{
		hotelPageFact.setFirsrName("");
		Thread.sleep(1000);
 
	}

	@When("^click submit$")
	public void click_submit() {
	   hotelPageFact.setButton();
	}

	@Then("^display the error msg to user and close$")
	public void display_the_error_msg_to_user_and_close() throws InterruptedException{
		String alertMessage = driver.switchTo().alert().getText();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println("alert :: "+alertMessage);
		Thread.sleep(2000);
		driver.close();
	    
	}

	@When("^on user entering valid data$")
	public void on_user_entering_valid_data() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		hotelPageFact.setFirsrName("Santhoshi");
		Thread.sleep(1000);
		hotelPageFact.setLastName("Sunaina");
		Thread.sleep(1000);
		hotelPageFact.setEmail("santhoshi@gmail.com");
		Thread.sleep(1000);
		hotelPageFact.setPhone("9568695479");
		Thread.sleep(1000);
		hotelPageFact.setCity("Chennai");
		Thread.sleep(1000);
		hotelPageFact.setState("Tamilnadu");
		Thread.sleep(1000);
		hotelPageFact.setPersons(3);
		Thread.sleep(1000);
		hotelPageFact.setCardholder("Satya");
		Thread.sleep(1000);
		hotelPageFact.setDebit("5858568858");
		Thread.sleep(1000);
		hotelPageFact.setCvv("456");
		Thread.sleep(1000);
		hotelPageFact.setMonth("6");
		Thread.sleep(1000);
		hotelPageFact.setYear("2020");
		
		
		
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		
	}

	@Then("^on successfull navigate to home page$")
	public void on_successfull_navigate_to_home_page() {
		hotelPageFact.setButton();
		driver.close();
		
	}
	
	@When("^user enters (\\d+)$")
	public void user_enters(int noOfPersons) throws InterruptedException  {
		
		hotelPageFact.setFirsrName("Santhu");
		Thread.sleep(1000);
		hotelPageFact.setLastName("Sunaina");
		Thread.sleep(1000);
		hotelPageFact.setEmail("Santhu@gmail.com");
		Thread.sleep(1000);
		hotelPageFact.setCity("Chennai");
		Thread.sleep(1000);
		hotelPageFact.setState("Tamilnadu");
		Thread.sleep(1000);
		hotelPageFact.setPersons(noOfPersons);
		Thread.sleep(2000);
	    
	}

	@Then("^for (\\d+) allocate (\\d+)$")
	public void for_allocate(int guests, int rooms)  {
		if (guests <= 3) {
			System.out.println("no of Rooms:" + rooms);
			assertEquals(1, rooms);
		} else if (guests <= 6) {
			System.out.println("no of Rooms:" + rooms);
			assertEquals(2, rooms);
		} else if (guests <= 9) {
			System.out.println("no of Rooms:" + rooms);
			assertEquals(3, rooms);
		}
	    
	}


	@Then("^display error message$")
	public void display_error_message(){
	    System.out.println("error");
	    
	}

	@When("^user enters (\\d+)$")
	public void userenters1(Integer phn) throws InterruptedException {
		hotelPageFact.setFirsrName("Santhoshi");
		Thread.sleep(1000);
		hotelPageFact.setLastName("Sunaina");
		Thread.sleep(1000);
		hotelPageFact.setEmail("santhoshi@gmail.com");
		Thread.sleep(1000);
		String phone=phn.toString();
		hotelPageFact.setPhone(phone);
		Thread.sleep(1000);
		hotelPageFact.setCity("Chennai");
		Thread.sleep(1000);
		hotelPageFact.setState("Tamilnadu");
		Thread.sleep(1000);
		hotelPageFact.setPersons(3);
		Thread.sleep(1000);
		hotelPageFact.setCardholder("Satya");
		Thread.sleep(1000);
		hotelPageFact.setDebit("5858568858");
		Thread.sleep(1000);
		hotelPageFact.setCvv("456");
		Thread.sleep(1000);
		hotelPageFact.setMonth("6");
		Thread.sleep(1000);
		hotelPageFact.setYear("2020");
		
		hotelPageFact.setButton();
		driver.close();
		
		
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		
	}





}
