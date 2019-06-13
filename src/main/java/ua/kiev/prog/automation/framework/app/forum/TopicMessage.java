package ua.kiev.prog.automation.framework.app.forum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ua.kiev.prog.automation.framework.app.forum.blocks.MainMenuBlock;
import ua.kiev.prog.automation.framework.app.forum.blocks.category.BoardItemWidget;
import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.PageObject;
import ua.kiev.prog.automation.framework.base.Widget;
import ua.kiev.prog.automation.framework.base.widget.GUIElement;
import ua.kiev.prog.automation.framework.base.widget.GUILink;

import java.util.List;

public class TopicMessage extends Widget
{
    public TopicMessage(Locator locator) {
       super(locator);
    }

    public String getauthor(int i)
    {
        GUILink author = new GUILink(Locator.create("//form[@id='quickModForm']//div[" + i+ "]//div[@class='poster']//h4//a"));
        return author.getText();
    }
    public String getmessage(int i) {
        GUILink message = new GUILink(Locator.create("//form[@id='quickModForm']//div[" + i + "]//div[@class='inner']"));
        return message.getText();

    }

}
