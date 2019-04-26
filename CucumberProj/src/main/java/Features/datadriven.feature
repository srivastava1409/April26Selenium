Feature: Free CRM login Feature
Scenario Outline: Free CRM login scenario

Given User is already on flights page
When Title of flights page is Free CRM
And User enters "mercury" and "mercury"
And User clicks login button
And User clicks on profile details
Then User enters details on profile page "<firstname>" and "<lastname>"

Examples:

| firstname | lastname |
| mercury | mercury |
| mercury | mercuryA |


