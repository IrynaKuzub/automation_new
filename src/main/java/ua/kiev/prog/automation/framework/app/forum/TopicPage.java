package ua.kiev.prog.automation.framework.app.forum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ua.kiev.prog.automation.framework.app.forum.blocks.category.BoardItemWidget;
import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.PageObject;
import ua.kiev.prog.automation.framework.base.widget.GUICounter;
import ua.kiev.prog.automation.framework.base.widget.GUIElement;
import ua.kiev.prog.automation.framework.base.widget.GUILink;

import java.util.ArrayList;
import java.util.List;

public class TopicPage extends PageObject
{
    @Override
    protected Locator readyLocator() {
        return Locator.create("//div[@id='forumposts']");
    }

    final private List<TopicMessage> list = new ArrayList<>();

    public TopicPage () {

        TopicMessage post = new TopicMessage(readyLocator());
        GUICounter counter = new GUICounter(this.readyLocator().createChild("./div[@class='poster']//h4//a"));

        for (int i = 1; i <= counter.count(); i++) {
            //System.out.println(post.getauthor(i) + post.getmessage(i));



        }
    }
}
