package steps;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.FirstCard;
import pages.MainPage;
import pages.SecondCard;
import pages.ThirdCard;

public class StepsAsserts {
    private MainPage mainPage = new MainPage();
    private FirstCard firstCard = new FirstCard();
    private SecondCard secondCard = new SecondCard();
    private ThirdCard thirdCard = new ThirdCard();

    private SoftAssert softAssert;

    public void isMainPageOpen(){
        Assert.assertTrue(mainPage.state().isDisplayed(), "The main page is not opened.");
    }

    public void isFirstCardOpen(){
        Assert.assertTrue(firstCard.state().isDisplayed(), "The first card (login form) is not opened.");
    }

    public void isSecondCardOpen(){
        Assert.assertTrue(secondCard.state().isDisplayed(), "The second card (avatar and interests form) is not opened.");
    }

    public void isThirdCardOpen(){
        Assert.assertTrue(thirdCard.state().isDisplayed(), "The third card (personal details) is not opened.");
    }

    public void isHelpFormHide(){
        Assert.assertTrue(firstCard.isHelpFormHide(), "Help form is not closed");
    }

    public void isCookiesFormClosed(){
        Assert.assertTrue(firstCard.isCookiesFormClosed(), "Cookies form is not closed");
    }

    public void isTimerNull(){
        softAssert = new SoftAssert();
        softAssert.assertTrue(firstCard.state().isDisplayed(), "The next page (login form) is not opened.");
        String expectedTime = "00:00:00";
        softAssert.assertEquals(firstCard.getTime(), expectedTime, "Timer is not start with 00:00");
        softAssert.assertAll();
    }
}