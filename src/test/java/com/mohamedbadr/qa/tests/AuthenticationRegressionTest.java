package com.mohamedbadr.qa.tests;

import com.mohamedbadr.qa.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Automated Regression Suite for Authentication & Role-Based Access Control (RBAC).
 * Author: Mohamed Hamdi Badr
 */
public class AuthenticationRegressionTest {
    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new", "--window-size=1920,1080");
        driver = new ChromeDriver(options);
        driver.get("https://erpaccounts.gate-gold.com/admin/login");
        loginPage = new LoginPage(driver);
    }

    @Test(priority = 1, description = "TC-AUTH-01: Verify valid admin login redirects to Executive Dashboard")
    public void testValidAdminLogin() {
        loginPage.enterEmail("qa.admin@enterprise-erp.test")
                 .enterPassword("SecureQA#2026!");
        loginPage.clickLogin();
        Assert.assertTrue(loginPage.isDashboardDisplayed(), "Executive Dashboard should be displayed after valid login.");
    }

    @Test(priority = 2, description = "TC-AUTH-02: Verify invalid credentials trigger security alert banner")
    public void testInvalidPasswordShowsAlert() {
        loginPage.enterEmail("qa.admin@enterprise-erp.test")
                 .enterPassword("WrongPassword123");
        loginPage.clickLogin();
        Assert.assertTrue(loginPage.getErrorMessage().contains("Invalid credentials"), "Security error alert must appear.");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
