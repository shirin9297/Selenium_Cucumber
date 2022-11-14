@cross_browser_test
Feature: app_title_verification
  @grid_chrome
  Scenario: TC01_title_on_chrome
    Given user is on the application_url "https://www.bluerentalcars.com/"
    Then verify the page title is "Blue Rental Cars | Cheap, Hygienic, VIP Car Hire"
    Then close the remote driver

  @grid_edge
  Scenario: TC01_title_on_edge
    Given user is on the application_url with edge "https://www.bluerentalcars.com/"
    Then verify the page title is "Blue Rental Cars | Cheap, Hygienic, VIP Car Hire"
    Then close the remote driver