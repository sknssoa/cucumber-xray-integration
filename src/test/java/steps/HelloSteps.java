package steps;

import io.cucumber.java.en.*;
import static org.junit.jupiter.api.Assertions.*;

public class HelloSteps {
    String message;
    @Given("I have a greeting")
    public void i_have_a_greeting() {
        message = "Hello BDD";
    }

    @When("I print the greeting")
    public void i_print_the_greeting() { /* simulate print */ }

    @Then("I see {string}")
    public void i_see(String expected) {
        assertEquals(expected, message);
    }
}
