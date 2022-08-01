Feature: Test  methods in Sample Employee REST API testing

Scenario: Get employee records
Given I set user services api endpoints
When set request header
And send a get http request
Then I receive valid response 

