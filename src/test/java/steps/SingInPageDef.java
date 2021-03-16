package steps;

import io.cucumber.java.en.Then;
import pages.SingInPage;

public class SingInPageDef {
    private final String log = "leva.trapeznikov@mail.ru";
    private final String pass = "TestCucumber123";

    SingInPage singInPage = new SingInPage();


    @Then("input login")
    public void inputLogin() {
        singInPage.inputLogin(log);
    }

    @Then("input password")
    public void inputPassword() {
        singInPage.inputPassword(pass);
    }
}
