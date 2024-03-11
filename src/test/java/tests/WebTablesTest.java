package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;
import steps.WebTablesSteps;

public class WebTablesTest extends BaseTest {
    WebTablesSteps appliedTabelSteps = new WebTablesSteps();

    @Test(priority = 1)
    public void openTablePage() {
        pageManager.WebTablesPage.openWebTables();
    }

    @Test(priority = 2)
    public void clickAdd() {
        pageManager.WebTablesPage.clickAddButton();
    }

    @Test(priority = 3)
    public void fillingTable() {
        Configuration.timeout = 20000;
        pageManager.WebTablesPage.fillTable("Semih", "Dinler", "50", "semih.dinler@gmail.com", "0", "Kalite");
    }

    @Test(priority = 4)

    public void submitData() {
        appliedTabelSteps.clickSubmit();
    }

    @Test(priority = 5)
    public void clickEditButton() {
        appliedTabelSteps.clickEditButton();
    }

//    @Test(priority = 5)
//    public void isTableOpen() {
//        appliedTabelSteps.isTableOpen2();
//    }

    @Test(priority = 6)
    public void newAge() {
        appliedTabelSteps.setNewAge();
    }

    @Test(priority = 7)
    public void submitNewAge() {
        appliedTabelSteps.submitNewAge();
    }
}
