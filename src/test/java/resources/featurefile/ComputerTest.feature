Feature: Computer Test
  As a user I want to navigate to Computers sub-menus

  @Sanity2
  Scenario: Verify user navigate to Desktop link successfully
    Given   I am on nopcommerce website homepage
    When    I click on Computers Link
    And     I click on Desktop Link
    Then    I should navigate to desktop page "<verifydesktoppage>"

    @Smoke2
    Scenario: Verify user navigate to Notebooks link successfully
      Given   I am on homepage
      When    I click on Computers Link
      And     I click on Notebooks Link
      Then    I should navigate to notebooks page "<verifynotebookspage>"

      @Regression3
      Scenario: Verify user navigate to Software link successfully
        Given   I am on homepage
        When    I click on Computers Link
        And     I click on Software Link
        Then    I should navigate to software page "<verifysoftwarepage>"


