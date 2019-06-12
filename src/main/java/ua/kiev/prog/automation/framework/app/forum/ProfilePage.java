package ua.kiev.prog.automation.framework.app.forum;
import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.PageObject;
import ua.kiev.prog.automation.framework.base.widget.GUIElement;


public class ProfilePage extends PageObject
{
    final private GUIElement _username = new GUIElement(Locator.create("//div[@id='profileview']//div[@class='content']//dl//dd[1]"));
    final private GUIElement _email = new GUIElement(Locator.create("//div[@id='profileview']//div[@class='content']//dl//dd[3]"));
    @Override
    final protected Locator readyLocator() {

        return Locator.create("//div[@id='profileview']");
    }
     final public String getUserName ()
     {
        return _username.getText();
     }
    final public String getEmail()
    {
        return _email.getText();
    }
}
