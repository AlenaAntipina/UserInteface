package pages;

import aquality.selenium.elements.ElementType;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ICheckBox;
import aquality.selenium.elements.interfaces.IElement;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import utils.RandomUtils;
import utils.RobotUtils;
import utils.StringUtils;

import java.io.File;
import java.util.List;

public class SecondCard extends Form {
    private static final By UNIQUE_ELEMENT = By.xpath("//div[@class='avatar-and-interests__form']");
    private static final String UNIQUE_ELEMENT_NAME = "Avatar and interests form";
    private final ITextBox TEXT_CARD_NUMBER = getElementFactory().getTextBox(By.xpath("//div[@class='page-indicator']"), "Number of card");
    private final IButton UPLOAD_AVATAR_BUTTON = getElementFactory().getButton(By.xpath("//a[@class='avatar-and-interests__upload-button']"), "Upload avatar");
    private final ICheckBox INTERESTS_CHECKBOX = getElementFactory().getCheckBox(By.xpath("//*[@class='avatar-and-interests__interests-list']"), "Interests Checkbox");
    private final By INTERESTS_ITEMS = By.xpath("//*[@class='avatar-and-interests__interests-list__item']//span[@class='checkbox small']");
    private final ICheckBox UNSELECT_ALL_INTERESTS = getElementFactory().getCheckBox(By.xpath("//div[contains(.,'Unselect all')]/span[@class='checkbox small'] "), "Checkbox Unselect All");
    private final IButton NEXT_BUTTON = getElementFactory().getButton(By.xpath("//button[contains(@class,'button--stroked button--white')]"), "Next Button");
    public SecondCard() {
        super(UNIQUE_ELEMENT, UNIQUE_ELEMENT_NAME);
    }

    public int getNumberOfCard(){
        return StringUtils.getNumberOfCard(TEXT_CARD_NUMBER.getText());
    }

    public void clickUploadAvatarButton(){
        File file = new File("src/test/java/data/avatar.JPG");
        String path = file.getAbsolutePath();
        UPLOAD_AVATAR_BUTTON.click();
        RobotUtils.uploadFile(path);
    }

    public void choseInterests(){
        UNSELECT_ALL_INTERESTS.click();
        List<IElement> list = INTERESTS_CHECKBOX.findChildElements(INTERESTS_ITEMS, ElementType.CHECKBOX);
        int quantityOfInterests = 2;
        String firstNotSelected = "Select all";
        String secondNotSelected = "Unselect all";
        int i = 0;
        while (i != quantityOfInterests){
            int index = RandomUtils.getRandomIndex(list.size());
            for (int j = 0; j < list.size(); j++){
                if (j == index && !list.get(j).getText().equals(firstNotSelected) && !list.get(j).getText().equals(secondNotSelected)){
                    list.get(j).click();
                    i++;
                    break;
                }
            }
        }
    }

    public void clickNextButton(){
        NEXT_BUTTON.click();
    }
}
