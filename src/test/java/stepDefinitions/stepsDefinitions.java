package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import questions.ValidateQuantity;
import tasks.ClickOn;
import tasks.OpenWebsite;
import tasks.SelectProductQuantity;
import userInterfaces.CartPage;
import userInterfaces.HomePage;
import userInterfaces.ProductPage;

import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class stepsDefinitions {


    private Actor actor = Actor.named("User");
    private HomePage homePage;
    private ProductPage productPage;
    private CartPage cartPage;




    @Given("User enters the sanagel webpage")
    public void userEntersTheSanagelWebpage() {
        WebDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.manage().window().maximize();
        actor.whoCan(BrowseTheWeb.with(firefoxDriver));
        String pageURL = "https://sanangel.com.co/";
        actor.attemptsTo(OpenWebsite.at(pageURL));
    }

    @When("User select a product")
    public void userSelectAProduct() {
        actor.attemptsTo(ClickOn.ofTarget(homePage.product1));
    }


    @When("User adds the {string} quantities of the product to the shopping cart")
    public void userAddsTheQuantitiesOfTheProductToTheShoppingCart(String quantity) {
        SelectProductQuantity.ofQuantity(quantity, productPage.productQuantity).performAs(actor);
        actor.attemptsTo(ClickOn.ofTarget(productPage.addToCartButton));
    }

    @Then("User sees the {string} quantities of the product in the shopping cart page")
    public void userSeesTheQuantitiesOfTheProductInTheShoppingCartPage(String expectedQuantity) {
        actor.should(
                seeThat("displayed quantity",
                        ValidateQuantity.displayedQuantity(CartPage.quantityInputOneCartPage),
                        equalTo(Integer.parseInt(expectedQuantity))
                ));
    }

    @When("User adds the add another product to the shopping cart")
    public void userAddsTheAddAnotherProductToTheShoppingCart() {
        actor.attemptsTo(ClickOn.ofTarget(productPage.extraProduct2));
        actor.attemptsTo(ClickOn.ofTarget(productPage.addToCartButton));

    }
    @When("User adds the {string} quantities of the two product to the shopping cart")
    public void userAddsTheQuantitiesOfTheTwoProductToTheShoppingCart(String quantity) {
        SelectProductQuantity.ofQuantity(quantity, cartPage.quantityInputOneCartPage).performAs(actor);
        SelectProductQuantity.ofQuantity(quantity, cartPage.quantityInputTwoCartPage).performAs(actor);
    }

}



