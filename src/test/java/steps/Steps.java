package steps;

import aquality.selenium.core.logging.Logger;
import pages.FirstCard;
import pages.MainPage;
import pages.SecondCard;

public class Steps {
    private MainPage mainPage = new MainPage();
    private FirstCard firstCard = new FirstCard();
    private SecondCard secondCard = new SecondCard();

    public void openMainPage(){
        Logger.getInstance().info("Step: open main page");
    }

    public void goToTheNextPage(){
        Logger.getInstance().info("Step: go to the next page");
        mainPage.clickNextPageLink();
    }

    public void enterDataInLoginForm(String password, String email, String domain){
        Logger.getInstance().info("Step: fill the login form, accept Terms&Conditions and go to the next card");
        firstCard.inputDataInLoginForm(password, email, domain);
        firstCard.choseDomainFromDropdownList();
        firstCard.acceptTermsAndConditions();
        firstCard.clickNextButton();
    }

    public void uploadAvatarChoseInterests(){
        Logger.getInstance().info("Step: upload avatar, chose interests and go to the next card");
        secondCard.clickUploadAvatarButton();
        secondCard.choseInterests();
        secondCard.clickNextButton();
    }

    public void hideHelpForm(){
        Logger.getInstance().info("Step: hide help form");
        firstCard.clickHelpFormHideButton();
    }

    public void acceptCookies(){
        Logger.getInstance().info("Step: accept cookies");
        firstCard.clickAcceptCookiesButton();
    }
}