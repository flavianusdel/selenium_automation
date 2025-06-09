# selenium_automation
UI Test Automation Framework using Java, Gradle, Cucumber, Selenium, and Serenity BDD. Includes Page Object Model and test scenarios for login functionality on HerokuApp.
# UI Test Framework with Cucumber, Java, Selenium, and Serenity

This project is a sample **UI test automation framework** built using:

- Java 11
- Gradle
- Cucumber (Gherkin syntax)
- Selenium WebDriver
- Serenity BDD
- Spring (for dependency injection)

It demonstrates the use of Page Object Model (POM) and includes positive, negative, and boundary test cases for a login page at [HerokuApp Login Page](https://the-internet.herokuapp.com/login).

---

## 📂 Project Structure
```
ui-test-framework/
├── build.gradle
├── settings.gradle
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── pages/
│   │   │       └── LoginPage.java
│   │   └── resources/
│   └── test/
│       ├── java/
│       │   ├── runners/
│       │   │   └── TestRunner.java
│       │   └── stepdefinitions/
│       │       └── LoginSteps.java
│       └── resources/
│           └── features/
│               └── login.feature
└── README.md
```

---

## ✅ Features Covered

- Login with valid credentials (Positive test)
- Login with invalid username (Negative test)
- Login with invalid password (Negative test)
- Boundary test for max username/password length

---

## 🧪 How to Run the Tests

### Prerequisites

- Java 11 installed
- IntelliJ IDEA (or any Java IDE)
- Gradle installed (or use the Gradle Wrapper)

### Run via IntelliJ

1. Open the project in IntelliJ
2. Right-click on `TestRunner.java` (under `runners`)
3. Click Run 'TestRunner'

### View Reports
Cucumber HTML report: target/cucumber-report.html
JUnit test report: build/reports/tests/test/index.html

---

## 🔗 Dependencies Used
Here are the main libraries defined in build.gradle:

```
// Cucumber
testImplementation 'io.cucumber:cucumber-java:7.15.0'
testImplementation 'io.cucumber:cucumber-junit:7.15.0'
testImplementation 'junit:junit:4.13.2'

// Selenium
testImplementation 'org.seleniumhq.selenium:selenium-java:4.19.1'

// Serenity BDD
implementation 'net.serenity-bdd:serenity-core:4.2.30'
implementation 'net.serenity-bdd:serenity-junit:4.2.30'
implementation 'net.serenity-bdd:serenity-screenplay-webdriver:4.2.30'
implementation 'net.serenity-bdd:serenity-cucumber:4.2.30'

// Spring Framework
implementation 'org.springframework:spring-context:5.3.31'
```

---

## 🌐 Test URL
The test cases are executed against the following public test site:
🔗 https://the-internet.herokuapp.com/login

---

## 📌 Notes
- This is a sample test framework and can be easily extended.
- Includes sample step definitions and POM implementation for login.
- Follows best practices with clear project separation and reusability.
  
---

📎 License
This project is open-source and licensed under the MIT License.
