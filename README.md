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

---

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

Add screenshot here later.

---

## Accessibility Report

Add screenshot here later.

---

## TestNG Result

Add screenshot here later.

---

## Failure Screenshot

Add screenshot here later.

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
