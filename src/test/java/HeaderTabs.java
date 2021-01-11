import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HeaderTabs extends BasicElement {

    WebElement womenTab;
    WebElement dressesTab;
    WebElement tshirtsTab;
    WebElement womenSubTab;


    public HeaderTabs(WebElement element, WebDriver driver) {
        super(element, driver);
        womenTab = element.findElement(By.xpath("//*[contains(text(), 'Women')]"));
        dressesTab = element.findElement(By.xpath("//*[contains(text(), 'Dresses')]"));
        tshirtsTab = element.findElement(By.xpath("//*[contains(text(), 'T-shirts')]"));
        womenSubTab = element.findElement(By.xpath("//ul[@class='submenu-container clearfix first-in-line-xs']"));
    }

    public WebElement getWomenTab() {return womenTab; }

    public WebElement getDressesTab() {return dressesTab; }

    public WebElement getTshirtsTab() {return tshirtsTab; }

    public WebElement getWomenSubTab() {return womenSubTab; }

    public void moveToElement() {
        Actions hover = new Actions(driver);
        hover.moveToElement(womenTab).build().perform();
    }

    public void getListWomenSubTabElements() {
        getWomenSubTab();
        List<WebElement> listWomenTab = new ArrayList<WebElement>();
        listWomenTab.add(womenSubTab.findElement(By.xpath("//title")));

        for (WebElement e: listWomenTab){
            String text = e.getAttribute("title");
            System.out.println(text);
        }

        Iterator<WebElement> iterator = listWomenTab.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


}

