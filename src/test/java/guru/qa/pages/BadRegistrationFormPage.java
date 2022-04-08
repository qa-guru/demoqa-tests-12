package guru.qa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class BadRegistrationFormPage {
    // locators
    String firstNameInput = "#firstName";

    // actions
    public BadRegistrationFormPage setFirstName(String value) {
        $(firstNameInput).setValue(value);

        return this;
    }
}
