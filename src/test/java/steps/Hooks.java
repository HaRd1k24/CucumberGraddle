package steps;


import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.open;

public class Hooks {

    @Before
    public void openURl(){
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        open("https://grinfer.com/");
    }
}
