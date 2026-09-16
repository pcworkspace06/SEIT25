package io.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;

public class SortableDataTablesPage extends Page {
  public SortableDataTablesPage(ChromeDriver driver) {
    super(driver);
  }

  @FindBy (css = "#table1 tbody tr")
    private List<WebElement> table1Rows;
    public List<List<String>> getTable1Data()   {
        List<List<String>> data = new ArrayList<>();    
        for (WebElement row : table1Rows)   {
            List<WebElement> cells =row.findElements(By.tagName("td"));;
            List<String> rowValues = cells.stream().map(WebElement::getText).limit(5).toList();

            data.add(rowValues);
        }
        return data;
    }   
}
