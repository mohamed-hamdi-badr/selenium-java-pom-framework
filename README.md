# 🤖 Selenium WebDriver + Java + TestNG Automation Framework (POM)

[![Java 17](https://img.shields.io/badge/Java_17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://github.com/mohamed-hamdi-badr)
[![Selenium 4](https://img.shields.io/badge/Selenium_4.25-43B02A?style=for-the-badge&logo=selenium&logoColor=white)](https://github.com/mohamed-hamdi-badr)
[![TestNG](https://img.shields.io/badge/TestNG_7.10-10B981?style=for-the-badge)](https://github.com/mohamed-hamdi-badr)
[![Design Pattern](https://img.shields.io/badge/Pattern-Page_Object_Model_(POM)-6366F1?style=for-the-badge)](https://github.com/mohamed-hamdi-badr)

Modular UI & Hybrid API Test Automation Framework built with **Java 17**, **Selenium WebDriver 4**, **TestNG**, **RestAssured**, and **Maven** using the **Page Object Model (POM)** architecture.

---

## 🏗️ Architecture Highlights

- **Strict Page Object Model (POM):** Separation of WebElement locators/page actions (`src/main/java/com/mohamedbadr/qa/pages`) from TestNG assertions (`src/test/java/com/mohamedbadr/qa/tests`).
- **Explicit Waits Only:** Zero `Thread.sleep()` calls — utilizes `WebDriverWait` and `ExpectedConditions` for deterministic CI execution.
- **Headless CI Ready:** Configured with Chrome `--headless=new` for fast regression runs in GitHub Actions / Jenkins.

---

## 🚀 Running the Test Suite

```bash
mvn clean test
```

---

## 👤 Author
**Mohamed Hamdi Badr** — Dual ISTQB® Certified Software QA Engineer (`CTFL v4.0` & `CT-MAT`)
- 🌐 Portfolio: [mohamed-hamdi-badr.github.io](https://mohamed-hamdi-badr.github.io)
- 💼 LinkedIn: [linkedin.com/in/mohamed-hamdi-badr](https://www.linkedin.com/in/mohamed-hamdi-badr/)
