package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SingInPage {
  private SelenideElement LoginInput = $x("//input[@id=\"email\"]");
  private SelenideElement PasswordInput = $x("//input[@id=\"password\"]");

  public void inputLogin(String text){
      LoginInput.setValue(text);
  }

  public void inputPassword(String text){
      PasswordInput.setValue(text);

  }
}
