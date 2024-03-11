package common;

import driver.DriverFactory;
import pages.Elements;
import pages.WebTables;

public class PageManager {
    public WebTables WebTablesPage;

    public Elements ElementsPage;

    public PageManager() {

        DriverFactory.initDriver();

        WebTablesPage = PageFactory.buildWebTablesPage();
        ElementsPage = PageFactory.buildElementsPage();

    }
}
