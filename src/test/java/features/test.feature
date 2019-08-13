Feature: Login Feature

  Scenario: Login as user
    Given User is on homepage
    When user navigates to homepage
   And user enters username with "blog.cucumber@gmail.com "and password with "Cucumber@blog"
    Then message is displayed "true"
 
 
  Scenario: Login as user
    Given User is on homepage
    When user navigates to homepage
    And user enters username with "blog.cucumber1@gmail.com "and password with "Cucumber@blog1"
    Then message is displayed "false"

