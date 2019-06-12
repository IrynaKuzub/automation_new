import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ua.kiev.prog.automation.framework.app.forum.*;
import ua.kiev.prog.automation.framework.base.Session;


public class MyJUnitTest extends Assert
{
    private String _url = "https://www.google.com.ua/";

    @Before
    public void setup ()
    {

    }

    @Test
    public void smokeTest() {
        Session.get().driver().get("https://prog.kiev.ua/forum/index.php");
        MainPage mainPage = new MainPage();
        mainPage.confirmPage();
        LoginPage loginPage = mainPage.getLoginPage();
        String inputUserName =  "qaAutomationAccount";
        String inputEmail = "135798642";
        MainLoggedInPage mainPageLogged = loginPage.login(inputUserName,inputEmail);
        ProfilePage profilePage = mainPageLogged.getProfilePage();
        String realUserName =  profilePage.getUserName();
        String realEmail = profilePage.getEmail();
        assertEquals(inputUserName, realUserName );
    }

    @Test
    public void closeTest() {
        // Создаем новую сессию
        Session session = Session.get();
        // Загружаем URL
        session.driver().get(this._url);
        // Закрываем сессию
        session.close();
        // Проверяем что загруженный URL не соответствует ожидаемому
        // При вызове session.driver() драйвер откроется заново
        assertNotEquals(this._url, session.driver().getCurrentUrl());
        // Закрываем сессию
        session.close();
    }
    @After
    public void after()
    {
        Session.get().close();
    }
}

