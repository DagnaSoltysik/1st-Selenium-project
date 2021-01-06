import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Website extends BasicElement {

    private Header header;

    public Website(WebDriver driver) {
        super(driver.findElement(By.tagName("body")), driver);
        header = new Header(element.findElement(By.xpath("//header[@id='header']//div[@class='row']")), driver);
    }

    public Header getHeader() {
        return header;
    }
}

