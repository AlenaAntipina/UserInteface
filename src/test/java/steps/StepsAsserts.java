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

    @Deprecated
    public void isMainPageOpen(){
        Assert.assertTrue(mainPage.isDisplayed(), "The main page is not opened.");
    }

    public void isFirstCardOpen(){
        int expectedCardNumber = 1;
        Assert.assertEquals(firstCard.getNumberOfCard(), expectedCardNumber, "The first card (login form) is not opened.");
    }

    public void isSecondCardOpen(){
        int expectedCardNumber = 2;
        Assert.assertEquals(secondCard.getNumberOfCard(), expectedCardNumber, "The second card (avatar and interests form) is not opened.");
    }

    public void isThirdCardOpen(){
        Assert.assertFalse(thirdCard.isThirdCardOpen(), "The third card (personal details) is not opened.");
    }

    @Deprecated
    public void isNextPageOpen(){
        Assert.assertTrue(firstCard.isDisplayed(), "The next page (login form) is not opened.");
    }

    public void isHelpFormHide(){
        Assert.assertTrue(firstCard.isHelpFormHide(), "Help form is not closed");
    }

    public void isCookiesFormClosed(){
        Assert.assertTrue(firstCard.isCookiesFormClosed(), "Cookies form is not closed");
    }

    @Deprecated
    public void isTimerNull(){
        softAssert = new SoftAssert();
        softAssert.assertTrue(firstCard.isDisplayed(), "The next page (login form) is not opened.");
        String expectedTime = "00:00:00";
        softAssert.assertEquals(firstCard.getTime(), expectedTime, "Timer is not start with 00:00");
        softAssert.assertAll();
    }
}