@Smoke

Feature: To Verify the Data generated in various PDF`s

Background: Open the Browser and Successfully Login to BMG Site

#-------------------------------------------------------------------------------
@Scenario-1
Scenario: Hello test1

Given navigate to the login page

When user successfully logged in

And user selected a product

Then logout from the session
