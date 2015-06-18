Feature: RPN Calculator

	
	Scenario: Input first scenario
	Given a input of "1 2 3 + -"
	When call "compute"
	Then result should be "-4.0"

	Scenario: Input second scenario
	Given a input of "6 2 * 3 /"
	When call "compute"
	Then result should be "4.0"
	
	Scenario: Input third scenario
	Given a input of "2 3 ^ 4 5 + +"
	When call "compute"
	Then result should be "17.0"
	
	Scenario: Input fourth scenario
	Given a input of "50 % 2 *"
	When call "compute"
	Then result should be "1.0"
	
	Scenario: Input fifth scenario
	Given a input of "3 ! 4 5 * +"
	When call "compute"
	Then result should be "26.0"
	
	Scenario: Input sixith scenario
	Given a input of "12 3 / !"
	When call "compute"
	Then result should be "24.0"
	
	Scenario: Input seventh scenario
	Given a input of "5 1 2 + 4 * + 3 -"
	When call "compute"
	Then result should be "14.0"
	