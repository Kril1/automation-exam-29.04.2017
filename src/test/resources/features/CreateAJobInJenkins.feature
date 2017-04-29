Feature: CreateAJobInJenkins

  @complete
  Scenario: Log In jenkins
    Given user with access to Jenkins
    When login in Jenkins
    And create new build job and configure it
    Then make the build
