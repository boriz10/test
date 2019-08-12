
Feature: As a user I'd like to check weather in the any sity in the world

Scenario: verify weather by GET request for cities
Meta:
@Winter
When WS-User send GET request to endpoint '<city>'
Then WS-User receive HTTP response with status code '<statusCode>'
And in Response body attribute city should be equal '<value>'
Examples:
| city                   |  value                                                 | statusCode  |
| London                 |  London                                                | 200         |
| Kyiv                   |  Kyiv                                                  | 200         |
| NonExistingCity        |  An internal error occured while servicing the request | 400         |

Scenario: verify registration and re-registrarion of customer by POST request
Meta:
@Tangerine
When WS-User send POST request to endpoint 'register'
Then WS-User receive HTTP response with status code '<statusCode>'
And Response body should contains '<value>'
Examples:
| statusCode | value                            |
| 201        | Operation completed successfully |
| 200        | User already exists              |