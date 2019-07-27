
Feature: Test CRUD methods in Sample REST API

Scenario: POST post example
Given I Set GET method api endpoint 'London'
When I Send GET HTTP request
Then I receive valid HTTP response code '200'
And Response body contains attribute 'City' is 'London'