package ua.kiev.prog.automation.framework.base.widget;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.Widget;

import java.util.List;

public class GUICounter extends Widget
{
    public GUICounter(Locator locator) {
        super(locator);
    }

    final public int count ()
    {
        List<WebElement> list = this.driver().findElements(By.xpath("//div[@class='poster']//h4//a"));
       // System.out.println(locator().getWDLocator().toString());

        return list.size();
    }
}
