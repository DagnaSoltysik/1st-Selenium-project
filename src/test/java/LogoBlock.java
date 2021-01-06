import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoBlock extends BasicElement{

    WebElement logoimage;

    public LogoBlock(WebElement element, WebDriver driver) {
        super(element, driver);
        logoimage = element.findElement(By.xpath("//img[@class='logo img-responsive']"));
    }
}
