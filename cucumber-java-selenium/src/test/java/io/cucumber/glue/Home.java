package io.cucumber.glue;

import io.cucumber.java.en.Then;
import io.cucumber.core.Context;
import io.cucumber.core.Manager;
import java.util.List;
import io.cucumber.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import java.util.ArrayList;

public class Home extends Context {
  public Home(Manager manager) {
    super(manager);

  }

    @Then("the expected 'Available Examples' list should be displayed")
    public void theExpectedAvailableExamplesListShouldBeDisplayed() {

      List<String> expectedExampleNames = List.of(
        "A/B Testing",
        "Add/Remove Elements",
        "Basic Auth (user and pass: admin)",
        "Broken Images",
        "Challenging DOM",
        "Context Menu",
        "Digest Authentication (user and pass: admin)",
        "Disappearing Elements",
        "Drag and Drop",
        "Dropdown",
        "Dynamic Content",
        "Dynamic Controls",
        "Dynamic Loading",
        "Entry Ad",
        "Exit Intent",
        "File Download",
        "File Upload",
        "Floating Menu",
        "Forgot Password",
        "Form Authentication",
        "Geolocation",
        "Horizontal Slider",
        "Infinite Scroll",
        "Inputs",
        "JavaScript Alerts",
        "JavaScript onload event error",
        "Key Presses",
        "Large & Deep DOM",
        "Multiple Windows",
        "Nested Frames",
        "Notification Messages",
        "Redirect Link",
        "Secure File Download",
        "Shadow DOM",
        "Shifting Content",
        "Slow Resources",
        "Sortable Data Tables",
        "Status Codes",
        "Typos",
        "WYSIWYG Editor");

      HomePage homePage = new HomePage(getDriver());
      List<String> actualExampleNames = homePage.getAvailableExampleNames();
      List<String> extra = new ArrayList<>(actualExampleNames);
      extra.removeAll(expectedExampleNames);
      List<String> missing = new ArrayList<>(expectedExampleNames);
      missing.removeAll(actualExampleNames);
      Assertions.assertTrue(
        extra.isEmpty() && missing.isEmpty(),
        () -> "Extra items not in expected list: " + extra + ", Missing items: " + missing
);
    }
}