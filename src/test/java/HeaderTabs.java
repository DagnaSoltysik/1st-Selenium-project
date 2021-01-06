import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HeaderTabs extends BasicElement {

    WebElement womenTab;
    WebElement dressesTab;
    WebElement tshirtsTab;


    public HeaderTabs(WebElement element, WebDriver driver) {
        super(element, driver);
        womenTab = element.findElement(By.xpath("//*[contains(text(), 'Women')]"));
        dressesTab = element.findElement(By.xpath("//*[contains(text(), 'Dresses')]"));
        tshirtsTab = element.findElement(By.xpath("//*[contains(text(), 'T-shirts')]"));
    }

    public void moveToElement() {
        Actions hover = new Actions(driver);
        hover.moveToElement(womenTab).build().perform();

    }

}

