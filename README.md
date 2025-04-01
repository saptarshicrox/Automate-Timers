# Automation Project: EggTimer Countdown Test

## Overview

This automation project tests the countdown functionality of the [e.ggtimer.com](https://e.ggtimer.com) website.  
Using Selenium and TestNG, the test script verifies that the countdown timer starts and runs correctly for a specified duration.

## Tech Stack

- **Java**
- **Selenium WebDriver**
- **TestNG**
- **Maven** (for dependency management)

## Project Structure

```
├── src/main/java/com/Automate/automationTimer/uiPage/
│   ├── EggTimerPageTest.java  # Page Object Model for the EggTimer website
│
├── src/main/java/com/Automate/automationTimer/utility/
│   ├── BasePage.java  # Common functions (browser setup, utilities)
│
├── src/test/java/com/Automate/automationTimer/testing/
│   ├── GGtimerTest.java  # Test script for countdown timer
│
├── pom.xml  # Maven dependencies
└── README.md  # Project documentation
```

## Prerequisites

Before running the test, ensure you have the following installed:

- **Java 11+**
- **Maven**
- **Google Chrome** (latest version)
- **ChromeDriver** (matching your Chrome version)

## Setup Instructions

1. Clone the repository:
   ```sh
   git clone https://github.com/saptarshicrox/Automate-Timers.git
   cd automate-timer
   ```

2. Install dependencies using Maven:
   ```sh
   mvn clean install
   ```

3. Update the ChromeDriver path if needed in `BasePage.java`.

## Running the Test

To execute the test, run the following command:

```sh
mvn test
```

## Test Details

- **Test Class:** `GGtimerTest.java`
- **Test Function:** `timerTest()`

### Expected Behavior:

1. Launches the browser.
2. Navigates to [e.ggtimer.com](https://e.ggtimer.com).
3. Sets a timer for 25 seconds.
4. Verifies that the countdown starts.

## Reporting

Test results will be available in the `target/surefire-reports` directory.  
For better reporting, consider integrating **Extent Reports** or **ReportPortal**.

## Contribution

Feel free to contribute by opening a pull request or reporting an issue.

## License

This project is licensed under the **MIT License**.