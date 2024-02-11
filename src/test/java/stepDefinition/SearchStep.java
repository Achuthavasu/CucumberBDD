package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SearchStep {

    @Given("user launch chrome browser")
    public void user_launch_chrome_browser() {
        System.out.println("opens browser");
    }

    @And("user opens google search")
    public void user_opens_google_search() {

        System.out.println("browser is open");
    }
    @When("user enter a text in search box")
    public void user_enter_a_text_in_search_box() {
        System.out.println("user enters text in google search page");
    }

    @And("hits enter")
    public void hits_enter() {
        System.out.println("enter texts");
    }

    @When("close the browser")
    public void close_the_browser() {
        System.out.println("closes the browser");
    }
}
