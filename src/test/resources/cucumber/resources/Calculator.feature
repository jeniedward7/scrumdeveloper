Feature: Calculator Add function

	Scenario: Positive number Addition
		Given the number 7 and 8
		When I select the "Add" as option
		Then the Result field should be 15
	Scenario: Second Positive number Addition
		Given the number 6 and 6
		When I select the "Add" as option
		Then the Result field should be 12 