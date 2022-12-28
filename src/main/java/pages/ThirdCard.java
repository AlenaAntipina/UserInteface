package pages;

import aquality.selenium.elements.ElementType;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

import java.util.List;

public class ThirdCard extends Form {
    private static final By UNIQUE_ELEMENT = By.xpath("//div[@class='personal-details']");
    private static final String UNIQUE_ELEMENT_NAME = "Personal details";
    private final By TEXT_CARD_NUMBER_LOCATOR = By.xpath("//div[@class='page-indicator']");

    public ThirdCard() {
        super(UNIQUE_ELEMENT, UNIQUE_ELEMENT_NAME);
    }

    public boolean isThirdCardOpen(){
        List<ITextBox> thirdCard = getElementFactory().findElements(TEXT_CARD_NUMBER_LOCATOR, ElementType.TEXTBOX);
        return !thirdCard.isEmpty();
    }
}