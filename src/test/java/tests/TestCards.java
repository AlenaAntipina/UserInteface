package tests;

import data.LoginFormData;
import org.testng.annotations.Test;
import steps.Steps;
import steps.StepsAsserts;

public class TestCards extends BaseTest{
    private static Steps steps = new Steps();
    private static StepsAsserts asserts = new StepsAsserts();

    @Deprecated
    @Test
    public void cardsTest(){
        steps.openMainPage();
        asserts.isMainPageOpen();

        steps.goToTheNextPage();
        asserts.isFirstCardOpen();

        String password = LoginFormData.password();
        String email = password.charAt(0) + LoginFormData.email();
        String domain = LoginFormData.domain();
        steps.enterDataInLoginForm(password, email, domain);
        asserts.isSecondCardOpen();

        steps.uploadAvatarChoseInterests();
        asserts.isThirdCardOpen();
    }
}