package steps;

import io.cucumber.java.en.Then;
 import pages.BasicPage;

 public class BasicPageDef {

   BasicPage basicPage = new BasicPage();

    @Then("click {string} button")
    public void clickButton(String arg0) {
        basicPage.clickButton(arg0);
    }

     @Then("click {string} button span")
     public void clickButtonSpan(String arg0) {
     basicPage.clickButtonSpan(arg0);
     }

  @Then("Content with {string} visible")
  public void contentWithVisible(String arg0) {
     basicPage.contentVisible(arg0);
  }
 }
