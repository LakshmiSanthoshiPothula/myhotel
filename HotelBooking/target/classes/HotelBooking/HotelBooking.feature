#Author:Santhoshi
@HotelBookingForm

Feature: SignUp

Background: User is on Signup page

Scenario: check the heading of the Sign up page
Given User is already in hotel booking page
Then check the heading of the page 

Scenario: Hotel Booking Failure when first Name is empty 
Given User is already in hotel booking page
When first Name is empty
And click submit
Then display the error msg to user and close

Scenario: Booking Successfull by entering correct info
Given User is already in hotel booking page
When on user entering valid data 
Then on successfull navigate to home page 

Scenario Outline: Validate the number of rooms alloted 
Given User is already in hotel booking page
When user enters <numberOfGuests>
Then for <numberOfGuests> allocate <numberOfRooms>
Examples:
|numberOfGuests|numberOfRooms|
|1|1|


Scenario Outline: Check for invalid mobile number
Given User is already in hotel booking page
When user enters <mobilenumber>
Then display error message
Examples:
|mobilenumber|
|64564|
|4654564|

