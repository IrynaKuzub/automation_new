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
    String author;
    String message;

    public TopicMessage(Locator locator) {
       super(locator);
    }

    public String getauthor(int i)
    {
        GUILink elem = new GUILink(Locator.create("//form[@id='quickModForm']//div[" + i+ "]//div[@class='poster']//h4//a"));
        author= elem.getText();
        return author;
 /*       List<WebElement> list = this.driver().findElements(this.locator().getWDLocator());
        System.out.println(list.size());

      for (int i = 0; i <= list.size()-1; i++) {
            WebElement element = list.get(i);
            System.out.println(element.getText());
      }*/
     // List<WebElement> list = new List<WebElement>{};
        //return new GUIElement(this.locator().createChild(".//div[@class='poster']//h4//a"));

    }
    public String getmessage(int i) {
        GUILink elem2 = new GUILink(Locator.create("//form[@id='quickModForm']//div[" + i + "]//div[@class='inner']"));
        message = elem2.getText();
        return message;

    }

}
