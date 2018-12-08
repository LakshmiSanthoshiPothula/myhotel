package HotelBooking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HotelBookingPageFactory {
	WebDriver wd;

	public HotelBookingPageFactory(WebDriver driver) {
		this.wd =driver;
		PageFactory.initElements(wd, this);
	}

	public HotelBookingPageFactory() {
	
	}
	@FindBy(name = "txtFN")
	@CacheLookup
	WebElement firstName;
	
	@FindBy(name = "txtLN")
	@CacheLookup
	WebElement lastName;
	
	@FindBy(name = "Email")
	@CacheLookup
	WebElement email ;
	

	@FindBy(name ="Phone")
	@CacheLookup
	WebElement phone ;
	
	@FindBy(xpath = "/html/body/div/div/form/table/tbody/tr[6]/td[2]/textarea")
	@CacheLookup
	WebElement address;
	
	@FindBy(how = How.NAME, using = "city")
	@CacheLookup
	WebElement city;
	
	@FindBy(how = How.NAME, using = "state")
	@CacheLookup
	WebElement state;
	
	
	@FindBy(how = How.NAME, using = "persons")
	@CacheLookup
	int persons;

	@FindBy(xpath = "//*[@id='rooms']")
	@CacheLookup
	WebElement rooms;

	@FindBy(how = How.ID, using = "txtCardholderName")
	@CacheLookup
	WebElement cardholder;

	@FindBy(id = "txtDebit")
	@CacheLookup
	WebElement debit;

	@FindBy(name = "cvv")
	@CacheLookup
	WebElement cvv;

	@FindBy(id = "txtMonth")
	@CacheLookup
	WebElement month;

	@FindBy(id = "txtYear")
	@CacheLookup
	WebElement year;
	
	
	@FindBy(how = How.ID, using = "btnPayment")
	@CacheLookup
	WebElement button;
	


	public WebElement getFirsrName() {
		return firstName;
	}

	public void setFirsrName(String firsrNameTemp) {
		firstName.sendKeys(firsrNameTemp);
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(String lastNameTemp) {
		lastName.sendKeys(lastNameTemp);;
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(String emailTemp) {
		email.sendKeys(emailTemp);
	}

	public WebElement getPhone() {
		return phone;
	}

	public void setPhone(String phoneTemp) {
		phone.sendKeys(phoneTemp);
	}

	public WebElement getAddress() {
		return address;
	}

	public void setAddress(String addressTemp) {
		address.sendKeys(addressTemp);
	}

	public WebElement getCity() {
		return city;
	}

	public void setCity(String cityTemp) {
		Select cityData = new Select(city);
		cityData.selectByVisibleText(cityTemp);
	}

	public WebElement getState() {
		return state;
	}

	public void setState(String stateTemp) {
		Select stateData = new Select(state);
		stateData.selectByVisibleText(stateTemp);
	}
	
	
	
	
	public void setPersons(int noOfPErsons) {
		persons = noOfPErsons;
	}

	public void setCardholder(String cardholderName) {
		cardholder.sendKeys(cardholderName);
	}

	public void setDebit(String debitNum) {
		debit.sendKeys(debitNum);
	}

	public void setCvv(String cvvPin) {
		cvv.sendKeys(cvvPin);
	}

	public void setMonth(String monthTemp) {
		month.sendKeys(monthTemp);
	}

	public void setYear(String yearTemp) {
		year.sendKeys(yearTemp);
	}
	
	
	public int getPersons() {
		return persons;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getCardholder() {
		return cardholder;
	}

	public WebElement getDebit() {
		return debit;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}
	
	

	public WebElement getButton() {
		return button;
	}

	public void setButton() {
		button.click();
	}

	
	
}
