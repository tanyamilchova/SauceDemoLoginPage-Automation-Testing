# Sauce Demo Test Automation

This project is a test automation solution for the Sauce Demo login page. It includes test cases for different login scenarios using Selenium WebDriver, JUnit, and Maven. The tests are designed to validate various functionalities of the login form on the Sauce Demo website.

## Project Overview

- **Launch URL:** [https://www.saucedemo.com/](https://www.saucedemo.com/)
- **Test Automation Tool:** Selenium WebDriver
- **Project Builder:** Maven
- **Browsers:** Edge, Chrome
- **Locators:** XPath
- **Test Runner:** JUnit
- **Test Automation Approach:** BDD (Behavior-Driven Development)
- **Assertions:** Hamcrest
- **Optional Patterns:** Abstract Factory, Adapter, Decorator
- **Optional Logger:** Log4j

## Use Cases

### UC-1: Test Login Form with Empty Credentials

1. Type any credentials into the "Username" and "Password" fields.
2. Clear the inputs.
3. Hit the "Login" button.
4. Check the error message: **"Username is required"**.

### UC-2: Test Login Form with Username Provided but No Password

1. Type any credentials into the "Username" field.
2. Enter a password.
3. Clear the "Password" input.
4. Hit the "Login" button.
5. Check the error message: **"Password is required"**.

### UC-3: Test Login Form with Valid Credentials

1. Type a valid username from the accepted usernames.
2. Enter the password **"secret_sauce"**.
3. Click on "Login" and validate the title **"Swag Labs"** in the dashboard.

## Setup and Execution

### Prerequisites

- **Java Development Kit (JDK)**: Ensure that JDK 8 or higher is installed on your machine.
- **Maven**: Make sure Maven is installed for project build and dependency management.