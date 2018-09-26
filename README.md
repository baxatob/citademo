# citademo
Sample task for Java + Cucumber + [Firefox]

Simple test will use invalid credentials to login into latvian Citadele internet-bank and then check the alert.

NB! -- Known architecture issues:
1) Currently all test data is hardcoded (url, user name etc.).
2) Page Object approach is NOT used here. 


# PS -- citademo_py contains the same test example implemented using Python and Page Object approach 
To run it:
- install Python 3.x on your machine -> https://www.python.org/
- install Selenium using cmd> *pip install selenium*
- run in the project root directory using cmd> *python test01_Login.py*
