package ua.kiev.prog.automation.framework;

import org.openqa.selenium.WebDriver;
import ua.kiev.prog.automation.framework.app.forum.*;
import ua.kiev.prog.automation.framework.app.forum.blocks.category.BoardItemWidget;
import ua.kiev.prog.automation.framework.base.Session;

public class App
{
    static public void main (String[] args)
    {
        try {
            Session.get().driver().get("https://prog.kiev.ua/forum/index.php");
            MainPage mainPage = new MainPage();
            mainPage.confirmPage();
          //  mainPage.mainMenu.getHelpPage().mainMenu.getMainPage();
            LoginPage loginPage = mainPage.getLoginPage();
            String inputUserName =  "qaAutomationAccount";
            String inputEmail = "135798642";
            MainLoggedInPage mainPageLogged = loginPage.login(inputUserName,inputEmail);
            ProfilePage profilePage = mainPageLogged.getProfilePage();
            String realUserName =  profilePage.getUserName();
            String realEmail = profilePage.getEmail();
            //TopicListPage topics = mainPageLogged.categoryList.getCategory("Программирование").openBoard("Java SE");
            //topics.openTopicByName("Java Start Online ДЗ romanvoznyy");
            //TopicPage t;



        } finally {
            Session.get().close();
        }
    }
}
