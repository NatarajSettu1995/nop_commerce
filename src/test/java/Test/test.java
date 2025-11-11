package Test;

import org.openqa.selenium.WebDriver;

import PageObject.pageobject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class test{
	pageobject po;
@Given("User is on login page")
public void user_is_on_login_page() {
    po=new pageobject();
}
@When("User enter Email as {string} Password as {string}")
public void user_enter_email_as_password_as(String string, String string2) {
	po.getEmail().clear();
  po.getEmail().sendKeys(string);
  po.getPassword().clear();
  po.getPassword().sendKeys(string2);
}
@When("User Click on Login Button")
public void user_click_on_login_button() {
   po.getLogin().click();
}
@Then("Page text should be {string}")
public void page_text_should_be(String title){
	Assert.assertEquals("page title doesnt match",po.getafterlogintitle().getText(), title);
	po.getCatalog().click();
}
@When("User click on Logout Button")
public void user_click_on_logout_button() {
   po.getLogOut().click(); 
}
@Then("Page message should be {string}")
public void page_message_should_be(String msg){
	Assert.assertEquals("page title doesnt match",po.getloginpagevalidation().getText(), msg);
}

}