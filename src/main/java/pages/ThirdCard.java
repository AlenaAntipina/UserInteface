package pages;

import aquality.selenium.forms.Form;
import org.openqa.selenium.By;


public class ThirdCard extends Form {
    private static final By UNIQUE_ELEMENT = By.xpath("//div[@class='personal-details']");
    private static final String UNIQUE_ELEMENT_NAME = "Personal details";

    public ThirdCard() {
        super(UNIQUE_ELEMENT, UNIQUE_ELEMENT_NAME);
    }
}