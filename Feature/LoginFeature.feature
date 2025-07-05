Feature: Login
  Scenario: Login functionality testing
  Given User Launch Chrome Browser
  When User open url "https://admin-demo.nopcommerce.com/login"
  And User enters email as "abc" and Password as "abc"
  And Click on Login
#  And Close Browser

#    @sanity @regression
##  executes in both tags
#  Scenario Outline: Login functionality testing
##    this scenario will executes for two time
#    Given User Launch Chrome Browser
#    When User open url "https://admin-demo.nopcommerce.com/login"
#    And User enters email as "<email>" and Password as "<password>"
#    And Click on Login
#    And Close Browser
#    Examples:
#      |email|password|
#    |achutha.@gmail.com|dfjef|
