Feature: LogInJenkins

  @complete
  Scenario: Log In jenkins
    Given user with access to Jenkins
    When login in Jenkins
    Then logout from Jenkins
