Feature: Vytrack app login feature
  As a truck driver I can access Vehicle under Fleet module.
  Background: User is already in login page
    Given user is on the login page
#  Scenario Outline: Verify user login
#    Given user login with "<username>" and "<password>"
#
#    Examples:
#      | username      | password      |
#      | salesManagerUsername | UserUser123 |
#      | storeManagerUsername | UserUser123 |
#      | truckDriverUsername | UserUser123 |


  Scenario: Login as Driver
    When truck driver login with "username" and "password"
    Then truck driver see all Vehicle information
    And truck driver can  see general information by clicking any car
    And truck driver can  add Event
    Then   Truck driver can  reset the setting




