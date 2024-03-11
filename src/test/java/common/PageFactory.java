package common;

import pages.Elements;
import pages.WebTables;

public class PageFactory {

    public static WebTables buildWebTablesPage() {
        return new WebTables("https://demoqa.com/webtables");
    }

    public static Elements buildElementsPage() {
        return new Elements("https://demoqa.com/elements");
    }

}
