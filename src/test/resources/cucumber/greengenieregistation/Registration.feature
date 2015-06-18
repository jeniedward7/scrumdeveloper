Feature: Registration

	Scenario: Register for car pooling
	Given Employee name "Sathiya" 
	And mobile number 9600091115 
	And Start location "ALN"
	And End location "OTP"
	When click on "Register"
	Then entered details should be "stored in database"