package pages;

import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class MainPage extends Form {
    private static final By UNIQUE_ELEMENT = By.xpath("//*[contains(@class,'start view')]");
    private static final String UNIQUE_ELEMENT_NAME = "Unique element on Main page";
    private final ILink LINK_NEXT_PAGE = getElementFactory().getLink(By.xpath("//a[@class='start__link']"), "LINK - Please click HERE to GO to the next page");

    public MainPage() {
        super(UNIQUE_ELEMENT, UNIQUE_ELEMENT_NAME);
    }

    public void clickNextPageLink(){
        LINK_NEXT_PAGE.click();
    }
}