package tests;

import common.PageManager;
import driver.DriverFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected PageManager pageManager;
    //    protected SoftAssert softAssert;
    @BeforeClass
    public void setUp() {
        pageManager = new PageManager();
    }
//    @BeforeMethod
//    public void openDriver() {
//        Selenide.open();
//    }

//    @AfterMethod
//    public void clearCookies() {
//        DriverFactory.clearCookies();
//    }

    @AfterClass
    public void tearDown() {
        DriverFactory.close();
    }
}
