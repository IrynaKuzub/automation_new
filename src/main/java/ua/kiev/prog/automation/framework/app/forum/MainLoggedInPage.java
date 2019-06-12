package ua.kiev.prog.automation.framework.app.forum;

import ua.kiev.prog.automation.framework.app.forum.blocks.MainMenuLoggedInBlock;
import ua.kiev.prog.automation.framework.app.forum.blocks.category.CategoryListBlock;
import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.PageObject;
import ua.kiev.prog.automation.framework.base.widget.GUILink;

public class MainLoggedInPage extends PageObject
{
    final public MainMenuLoggedInBlock mainMenu = new MainMenuLoggedInBlock();
    final public CategoryListBlock categoryList = new CategoryListBlock();
    GUILink linkProfile = new GUILink(this.readyLocator().create("//div[@class='user_block']//div//a"));
    @Override
    protected Locator readyLocator() {
        return mainMenu.logout.locator();
    }
    final public ProfilePage getProfilePage ()
    {
        linkProfile.click();
        return new ProfilePage();
    }


}
