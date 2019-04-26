Feature: Mercury flights hooks Feature


Background: background scenario
Given user is on login page

@First
Scenario: Mercury flights login scenario
Given Mercury hooks login scenario

@Second
Scenario: Mercury flights itinery scenario
Given Mercury hooks itinery scenario

@Third
Scenario: profile scenario
Given hooks scenario

@Fourth
Scenario Outline: profile scenario
Given hooks of "username" and "password"

Examples:
| username | password |
| mercury | mercury |