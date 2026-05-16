package utils;

import com.deque.html.axecore.results.Results;
import com.deque.html.axecore.results.Rule;
import com.deque.html.axecore.selenium.AxeBuilder;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class AxeUtils {

    public static JSONArray analyze(WebDriver driver) {

        AxeBuilder builder = new AxeBuilder();

        // Returns Results object
        Results results = builder.analyze(driver);

        List<Rule> violationsList = results.getViolations();

        JSONArray violations = new JSONArray();

        System.out.println("\n========== ACCESSIBILITY REPORT ==========");
        
        int critical = 0;
        int moderate = 0;
        int serious = 0;

        if (violations.length() == 0) {
            System.out.println("✅ No accessibility violations found");
        } 
        else 
        {

            System.out.println("❌ Total Violations: " + violations.length());
            System.out.println("------------------------------------------");

            for (int i = 0; i < violations.length(); i++) {

                JSONObject v = violations.getJSONObject(i);

                String impact = v.getString("impact");

                if ("critical".equals(impact)) critical++;
                else if ("serious".equals(impact)) serious++;
                else if ("moderate".equals(impact)) moderate++;

                System.out.println("Rule: " + v.getString("id"));
                System.out.println("Impact: " + impact);
                System.out.println("Description: " + v.getString("description"));
                System.out.println("------------------------------------------");
            }
            
            System.out.println("\n----- SEVERITY SUMMARY -----");
            System.out.println("Critical Issues: " + critical);
            System.out.println("Serious Issues: " + serious);
            System.out.println("Moderate Issues: " + moderate);
            System.out.println("-----------------------------");
        }
        
        return violations;
    }
}