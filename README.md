# -- citademo
Sample task for Java + Cucumber + Webdriver

Project structure:

__reports__
- cucumber-html-report :: standard HTML report

__src/test__
- resources :: _*.feature_ files with Gherkin notation  

__src/test/java__
- bindings :: classes to define user steps @Given, @When, @Then
- pages :: classes to define web page elements and methods
- runners :: classes to launch tests
- users :: classes to define test users [not implemented]     


# PS -- citademo_py contains the simple test example implemented using Python
To run it:
- install Python 3.x on your machine -> https://www.python.org/
- install Selenium using cmd> *pip install selenium*
- run in the project root directory using cmd> *python test01_Login.py*
