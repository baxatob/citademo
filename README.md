# -- citademo
Sample task for Java + Cucumber + Webdriver

Run as Maven project -> lifecycle "test"

Project structure:

__reports__
- cucumber-html-report :: standard HTML report [will be provided after the test execution]

__src/test__
- resources :: _*.feature_ files with Gherkin notation  

__src/test/java__
- bindings :: classes to define user steps @Given, @When, @Then
- pages :: classes to define web page elements and methods
- runners :: classes to launch tests
