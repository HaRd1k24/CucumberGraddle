package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.*;

public class BasicPage {
    public void clickButton(String text){
        $x("//a[text()='" + text + "']").click();

    }

    public void clickButtonSpan(String text){
        $x("//span[text()='"+ text + "']/..").click();

    }

    public void contentVisible(String text){
        $x("//*[text()='" + text + "']/..").shouldBe(Condition.visible);

    }
}
