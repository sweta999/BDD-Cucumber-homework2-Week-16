Feature: Registration Test
  As a user I want to register into nopcommerce website

  @Sanity1
  Scenario: Verify user navigate to registration page successfully
    Given   I am on nopcommerce homepage
    When    I click on Register link
    Then    I should navigate to Register page successfully "<verifyMessage>"

  @Smoke1
  Scenario Outline: Verify error message with first name empty for registration
    Given   I am on homepage
    When    I click on Register link
    And     I select female radio button
    And     I leave first name box empty "<firstname>"
    And     I enter last name "<lastname>"
    And     I enter email in email field "<email>"
    And     I enter password in password field "<password>"
    And     I enter confirm password "<confirmpassword>"
    And     I click on Register button
    Then    I should see the error message First Name is required "<errorMessage>"
    Examples:
      | firstname | lastname | email          | password | errorMessage            |
      |           | sahi     | sahi@gmail.com | sahi2000 | First name is required. |

  @Regression2
  Scenario Outline: Verify user registered successfully
    Given   I am on homepage
    When    I click on Register link
    And     I select female radio button
    And     I enter first name "<firstname>"
    And     I enter last name "<lastname>"
    And     I enter email "<email>"
    And     I enter password "<password>"
    And     I enter confirm password "<confirmpassword>"
    And     I click on Register button
    Then    I should Register successfully "<registermessage>"
    Examples:
      | firstname | lastname | email          | password | confirmpassword |
      | suhana    | sahi     | sahi@gmail.com | sahi2000 | sahi2000        |


