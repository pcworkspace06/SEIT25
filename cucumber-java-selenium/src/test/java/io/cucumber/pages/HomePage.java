package io.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class HomePage extends Page {

  public HomePage(ChromeDriver driver) {
    super(driver);
    System.out.println("Homepage title is : " + getTitle().getText());
  }

  @FindBy(css = "h1")
  private WebElement title;
  public WebElement getTitle() {
    return title;
  }

  @FindBy(css = "#content ul li")
  private List<WebElement> listOfAvailableExamples;
  public List<String> getAvailableExampleNames() {
    return listOfAvailableExamples.stream().map(WebElement::getText).toList();
  }
  
  @FindBy(xpath = "//a[text()='Basic Auth']")
  private WebElement basicAuthLink;
  public void clickBasicAuthLink() {
    basicAuthLink.click();
    System.out.println("Clicked Basic Auth link");
  } 

  public void refresh() {
    driver.navigate().refresh();
    System.out.println("Refreshed page");
  }
}
