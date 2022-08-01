Feature: Test  methods in Sample Employee REST API testing


Scenario: Create employee records
Given To execute POST method
When set request header
And send a post http request
Then I receive 201 valid response

