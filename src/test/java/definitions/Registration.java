package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.validation.constraints.AssertTrue;

/**
 * Created by dgollapudi on 28/10/2016.
 */
public class Registration {

WebDriver driver;
    @Given("^registration link is available on sportsbook desktop page$")
    public void registration_link_is_available_on_sportsbook_desktop_page() throws Throwable {
        driver=new FirefoxDriver();
        driver.get("http://sports.williamhill-pp1.com/acc/en-gb");
        driver.manage().window().maximize();
        String s=driver.findElement(By.xpath("//div[@id='joinNowBtnHolder']/a/span")).getText();
        Assert.assertTrue(s.equals("Join Now"));


    }

    @Then("^I clicked on registartion link$")
    public void i_clicked_on_registartion_link() throws Throwable {
        driver.findElement(By.xpath("//div[@id='joinNowBtnHolder']/a/span")).click();

    }

    @Then("^entered all required fields and clicked on create account button$")
    public void entered_all_required_fields_and_clicked_on_create_account_button() throws Throwable {



    }

    @Then("^registration is successful$")
    public void registration_is_successful() throws Throwable {

    }


}
