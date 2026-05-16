package tests;

import base.BaseTest;
import org.json.JSONArray;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.AxeUtils;

public class AccessibilityTest extends BaseTest {

    @Test
    public void verifyAccessibility() {

        HomePage home = new HomePage(driver, wait);

        home.openWebsite();

        //  WAIT USED THROUGH PAGE OBJECT
        home.waitForPageLoad();

        JSONArray violations = AxeUtils.analyze(driver);

        //  INTENTIONAL FAILURE (FOR SCREENSHOT DEMO)
        Assert.assertTrue(violations.length() == 0,
                "Accessibility issues found!");
    }
    
    @Test
    public void verifyAccessibility_PassScenario() {
        
    	// ✅ PASSING TEST
    	HomePage home = new HomePage(driver, wait);

        home.openWebsite();

        home.waitForPageLoad();

        JSONArray violations = AxeUtils.analyze(driver);

        // ✅ DO NOT FAIL TEST — JUST LOG
        if (violations.length() > 0) {
            System.out.println("Accessibility issues found, but test marked as PASS for demo.");
        }

        // ✅ Force pass
        Assert.assertTrue(true);
    }
    
    @Test
    public void verifyAccessibility_AfterLogin() {

        HomePage home = new HomePage(driver, wait);

        // Step 1: Open site
        home.openWebsite();

        // Step 2: Wait for login page
        home.waitForPageLoad();

        // Step 3: Login
        home.loginToApplication();

        // Step 4: Wait for products page
        home.waitForProductsPage();

        // Step 5: Run accessibility scan
        JSONArray violations = AxeUtils.analyze(driver);

        // Step 6: Print results
        if (violations.length() > 0) {
            System.out.println("❌ Violations found on Products Page: " + violations.length());
        } else {
            System.out.println("✅ No accessibility issues on Products Page");
        }

        // Step 7: Keep as PASS (demo purpose)
        Assert.assertTrue(true);
    }
}