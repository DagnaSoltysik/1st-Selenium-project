import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasicElement {
    //tutaj możesz umieścić metody z których każdy komponent będzie dziedziczył

    protected WebElement element;
    protected WebDriver driver;

    public BasicElement(WebElement element, WebDriver driver) {
        this.element = element;
        this.driver = driver;
    }

    protected void wait(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
