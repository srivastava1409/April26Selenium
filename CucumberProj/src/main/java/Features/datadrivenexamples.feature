Feature: flights mercury login Feature
Scenario Outline: flights mercury login  scenario

Given User is already on mercury page
When Title of mercury page 
Then User gives "<username>" and "<password>"



Examples:
| username | password |
| mercury | mercury |
| mercury | mercu |
