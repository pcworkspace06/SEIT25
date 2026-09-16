package io.cucumber.glue;

import io.cucumber.core.Context;
import io.cucumber.core.Manager;
import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;
import io.cucumber.pages.SortableDataTablesPage;
import org.junit.jupiter.api.Assertions;
import java.util.List;

public class SortableDataTablesSteps extends Context {
  public SortableDataTablesSteps(Manager manager) {
    super(manager);
  }

  @Then("the Example 1 table should display the expected results:")
  public void theExample1TableShouldDisplayExpectedResults(DataTable dataTable) {
    List<List<String>> expected = dataTable.asLists(String.class);
    expected = expected.subList(1, expected.size());

    SortableDataTablesPage page = new SortableDataTablesPage(getDriver());
    List<List<String>> actual = page.getTable1Data();
    Assertions.assertEquals(expected, actual);
  }
}