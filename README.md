# AutomationPlayWright

This project is a Playwright automation framework developed using Java, TestNG, Maven, and the Page Object Model (POM).

## Assignment

The automation performs the following steps:

1. Open Google.
2. Search for a keyword.
3. Print the title of the first search result.

## Technologies Used

- Java
- Playwright
- TestNG
- Maven
- Page Object Model (POM)
- Git/GitHub
- Eclipse

## Project Structure

src
└── test
    └── java
        ├── base
        │   └── Base.java
        ├── pages
        │   └── GooglePage.java
        └── tests
            └── GoogleTest.java

## Setup

### Prerequisites

Install the following:

- Java JDK 21
- Maven
- Eclipse IDE
- Git

### Clone the Repository

Clone the project from GitHub:

git clone <your-github-repository-url>

Open the project in Eclipse as a Maven project.

### Install Maven Dependencies

Right-click the project in Eclipse:

Maven → Update Project

Maven will download the required Playwright and TestNG dependencies.

## How to Run the Test

### Using Eclipse

1. Open the project in Eclipse.
2. Open:

src/test/java/tests/GoogleTest.java

3. Right-click `GoogleTest.java`.
4. Select:

Run As → TestNG Test

5. The browser will open.
6. Google will be opened.
7. The test searches for "playwright automation".
8. The title of the first search result is printed in the console.

### Using Maven

Open a terminal in the project directory and run:

mvn test

## Approach

The project follows the Page Object Model (POM) design pattern.

### Base Class

`Base.java` contains common Playwright setup and cleanup code.

It:

- Creates the Playwright instance.
- Launches the Chromium browser.
- Creates a BrowserContext.
- Creates a Page.
- Takes a screenshot when a test fails.
- Closes the browser and Playwright after the test.

### Page Class

`GooglePage.java` contains Google-related locators and actions.

It:

- Locates the Google search box.
- Enters the search keyword.
- Presses Enter.
- Gets the title of the first search result.

### Test Class

`GoogleTest.java` contains the actual test scenario.

It:

1. Opens Google.
2. Creates the GooglePage object.
3. Searches for "playwright automation".
4. Gets and prints the first search result title.

## Example Output

First search result: playwright automation

## Conclusion

This project demonstrates basic Playwright automation using Java, TestNG, Maven, and the Page Object Model design pattern.
