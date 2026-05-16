![Java](https://img.shields.io/badge/Java-17-orange)
![Selenium](https://img.shields.io/badge/Selenium-Automation-green)
![TestNG](https://img.shields.io/badge/TestNG-Framework-red)
![Maven](https://img.shields.io/badge/Maven-Build-blue)
![Accessibility](https://img.shields.io/badge/WCAG-Accessibility-purple)

> ♿ Automated Accessibility Testing Framework using Selenium WebDriver and Axe-core for WCAG validation.

# Selenium Accessibility Automation Framework

## 📌 Project Overview

This project is a Selenium-based Accessibility Automation Framework developed using Java, TestNG, Maven, and Axe-core.

The framework performs automated accessibility testing on the SauceDemo web application and validates WCAG accessibility standards across multiple pages.

The project includes:
- Login page accessibility testing
- Post-login products page accessibility testing
- Accessibility violation reporting
- Screenshot capture on failure
- Structured console reporting
- Severity categorization

Test Website: [SauceDemo](https://www.saucedemo.com)

---

# ✨ Key Features

- Automated accessibility scanning using Axe-core
- Selenium WebDriver automation
- Accessibility validation after login
- Screenshot capture on failure
- Structured console reporting
- Severity categorization
- Page Object Model (POM) framework
- Explicit waits using WebDriverWait
- Maven dependency management

# 🚀 Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Maven
- Axe-core Selenium Library
- Apache Commons IO

---

# 📂 Framework Structure

```text
src/test/java
│
├── base
│   └── BaseTest.java
│
├── pages
│   └── HomePage.java
│
├── tests
│   └── AccessibilityTest.java
│
├── utils
│   ├── AxeUtils.java
│   └── ScreenshotUtils.java
```

---

# ♿ Accessibility Features

The framework validates:

- Landmark regions
- Heading structure
- Accessible names
- Semantic HTML compliance
- WCAG accessibility standards

Accessibility scanning is implemented using Axe-core integrated with Selenium WebDriver.

---

# 🧪 Test Scenarios

## ✅ Scenario 1 — Accessibility Validation (Strict)

- Opens SauceDemo login page
- Runs accessibility scan
- Fails test if violations are found

---

## ✅ Scenario 2 — Accessibility Validation (Soft Assertion)

- Logs violations
- Allows execution to continue
- Demonstrates reporting flow

---

## ✅ Scenario 3 — Accessibility Scan After Login

- Performs login using:
  - Username: `standard_user`
  - Password: `secret_sauce`
- Navigates to Products page
- Runs accessibility scan after authentication

---

# ▶️ How to Run

## Clone Repository

```bash
git clone https://github.com/SapteshPawar/selenium-accessibility-framework.git
```

---

## Open in Eclipse

- Import as Maven Project
- Update Maven Dependencies

---

## Run Tests

Run using:

```bash
testng.xml
```

OR

```bash
mvn test
```

---

# 📊 Sample Accessibility Report

```text
========== ACCESSIBILITY REPORT ==========
✅ No accessibility violations found
==========================================
```

---

# 📸 Screenshots

## Console Output

<img src="https://github.com/user-attachments/assets/216dac88-8635-44f6-9a2a-3ef6ddfcdab0" width="800" />



---

## Accessibility Report

<img src="https://github.com/user-attachments/assets/34074f86-b217-43e6-b126-89c7ee4189a2" width="800" />


---

## TestNG Result

<img src="https://github.com/user-attachments/assets/dbdbf464-804b-4ace-aa44-872d38680e8b" width="800" />


---

## Failure Screenshot

<img src="https://github.com/user-attachments/assets/e4e76dae-7d16-4f77-9ce7-39e24a887d5f" width="800" />


---

# 🔥 Future Enhancements

- Extent Reports integration
- CI/CD with GitHub Actions
- Parallel execution
- Cross-browser testing
- Multi-page accessibility scanning
- HTML accessibility reports

---

# 👨‍💻 Author

Saptesh Pawar
