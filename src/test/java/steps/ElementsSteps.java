package steps;

import common.PageManager;
import common.ScenarioContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import tests.BaseTest;

public class ElementsSteps extends BaseTest {

    PageManager pageManager = new PageManager();
    ScenarioContext scenarioContext = new ScenarioContext();


    @Given("Open the web site elements")
    public void Open_the_web_site_elements() {
        pageManager.ElementsPage.openElements();
    }

    @When("User clicks the buttons button")
    public void user_clicks_the_buttons_button() {
        pageManager.ElementsPage.buttonsClick.click();
    }

    @Then("click me button becomes visible")
    public void click_me_button_becomes_visible() {
        Assertions.assertThat(pageManager.ElementsPage.clickMeClick.isDisplayed()).isTrue();
    }

    @When("User clicks Click Me button")
    public void user_clicks_click_me_button() {
        pageManager.ElementsPage.clickMeClick.click();
    }

    @Then("You have done a dynamic click text becomes visible")
    public void you_have_done_a_dynamic_click_text_becomes_visible() {
        String btnText = pageManager.ElementsPage.clickMeText.getText();
        Assertions.assertThat(btnText.equals("You have done a dynamic click")).isTrue();
    }
}
