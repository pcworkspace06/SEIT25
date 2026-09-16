Feature: The Internet
  This feature covers (some) Example pages on 'the-internet.herokuapp.com'

  @TEST_TI_0001
  Scenario: Homepage has a list of links to Expected examples
    Given the page under test is 'https://the-internet.herokuapp.com'
    Then the expected 'Available Examples' list should be displayed
    
  @TEST_TI_0002
  Scenario: Basic Auth allows validated access
    Given the page under test is 'https://the-internet.herokuapp.com'
    When valid credentials are supplied for 'Basic Auth'
    And the user is redirected to 'Basic Auth' page
    Then 'Congratulations' message should be displayed

  @TEST_TI_0003
  Scenario: Sortable Data Tables - Example 1 displays the expected 4 results
    Given the page under test is 'https://the-internet.herokuapp.com/tables'
    Then the Example 1 table should display the expected results:
        | Last Name | First Name  | Email                 |  Due    | Web Site                  |
        | Smith     | John        | jsmith@gmail.com      | $50.00  | http://www.jsmith.com     |
        | Bach      | Frank       | fbach@yahoo.com       | $51.00  | http://www.frank.com      |
        | Doe       | Jason       | jdoe@hotmail.com      | $100.00 | http://www.jdoe.com       |
        | Conway    | Tim         | tconway@earthlink.net | $50.00  | http://www.timconway.com  |