package stepdefinitions;

import Base_Setup.Driver_Initializer;
import io.cucumber.java.en.Given;

public class OpenBrowser {
    public OpenBrowser() {

    }

    @Given("Open browser and go to google")
    public void open_browser_and_go_to_google() {
        // Write code here that turns the phrase above into concrete actions
        Driver_Initializer _driver;
        _driver = Driver_Initializer.getInstance();
        _driver.OpenTheDriver("http://www.google.com");
    }
}
