Feature: Search a Cab

	Scenario: Load the destination
		Given that home page "URL" is hit
		When the "destination_query" is hit
		Then the Result  should be "OTP,TRIL"	
	Scenario: Load the Source
		Given that home page "URL" is hit
		When the "source_query" is hit
		Then the Result  should be "guindy,tbm,madura"
	Scenario: Search with Source
		Given the "Source" is selected
		When I click on  the "Search" button
		Then the Result field should be errorcode "-1"
	Scenario: Search with Destination
		Given the "Destination" is selected
		When I click on  the "Search" button
		Then the Result field should be errorcode "-1""

	Scenario: Search with Source and Destination
		Given the "Source" and "Destination" is selected
		When I click on  the "Search" button
		Then  display the result in "OTP,TRIL,guindy,tbm,madura"