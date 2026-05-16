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

<img width="1896" height="847" alt="image" src="https://github.com/user-attachments/assets/216dac88-8635-44f6-9a2a-3ef6ddfcdab0" />
<img width="895" height="199" alt="image" src="https://github.com/user-attachments/assets/81e66461-f44a-4b1c-ae4c-cd43e34ea550" />



---

## Accessibility Report

<img width="1067" height="191" alt="image" src="https://github.com/user-attachments/assets/34074f86-b217-43e6-b126-89c7ee4189a2" />


---

## TestNG Result

<img width="895" height="199" alt="image" src="https://github.com/user-attachments/assets/dbdbf464-804b-4ace-aa44-872d38680e8b" />


---

## Failure Screenshot

<img width="1920" height="847" alt="verifyAccessibility" src="https://github.com/user-attachments/assets/e4e76dae-7d16-4f77-9ce7-39e24a887d5f" />


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
