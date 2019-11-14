Feature:

  @api
  Scenario:

    When the performs a GET request to the "employee_service"
    Then the user gets a "200" successful response
    And the total number of employees is printed on screen
    And the name of the employee with maximum ID value is printed on screen
    And a list of employees with salaries > 5000 is printed on screen


#    When the user sends a "POST" request "employee.json" to the "employee_service" with a higher salary
#    Then the user gets a "200" successful response

