Feature: Wiki Page Automation

  @wiki01
    #before
  Scenario: Mapping validation for share holder and share holding value
    #beforestep
    Given user extracts the share holder value from Infosys shareholding and stakeholders pattern table
    #afterstep
    #beforestep
    When user extracts the share holding value from Infosys shareholding and stakeholders pattern table
    #afterstep
    Then validating the mapping
    #afterstep
   #after

   @wiki02
     #before
  Scenario: infy table validation
    Given user extracts the column one and two values
     #after