#Author: ccha.bellaha@gmail.com

Feature: orange HRM Login page 
 
  Scenario: Login with valid credentials
    Given Admin is on login page 
    
    When Admin enter correct username"Admin" and correct password"admin123" 
  
    Then Admin is directed to  the home page  that contains message "Dashboard"
 
