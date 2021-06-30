Feature: Login Test
  As a user I want to login into nopcommerce website

  @Sanity
  Scenario: Verify user is navigated to Login page successfully
    Given     I am on homepage
    When      I click on Login link
    Then      I should navigated to login page successfully "<verifyWelcomeMessage>"


  @Smoke
  Scenario Outline: Verify error message with Invalid credentials
    Given   I am on homepage
    When    I click on Login link
    And     I enter email "<email>"
    And     I enter password "<password>"
    And     I click on login button
    Then    I should see the error message "<errorMessage>"
    Examples:
      | email              | password | errorMessage              |
      | trp@yahoo.com      | ACD345   | No customer account found |
      | xyt@yahoo.com      | XYT24    | No customer account found |
      | rsvprrrr@yahoo.com | ggg      | No customer account found |

  @Regression1
  Scenario: Verify user should login successfully with Valid credentials
    Given   I am on homepage
    When    I click on Login link
    And     I enter email "sahi@gmail.com"
    And     I enter password "sahi2000"
    And     I click on login button
    Then    I should login successfully
