import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCart extends BasicElement {

    WebElement shoppingCartButton;

    public ShoppingCart(WebElement element, WebDriver driver) {
        super(element, driver);
        shoppingCartButton = element.findElement(By.xpath("//div[@class='shopping_cart']"));
    }
}
