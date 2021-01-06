import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchBox extends BasicElement {

    WebElement textInput;
    WebElement searchButton;

    public SearchBox(WebElement element, WebDriver driver) {
        super(element, driver);
        textInput = element.findElement(By.id("search_query_top"));
        searchButton = element.findElement(By.xpath("//button[@name='submit_search']"));
    }

    public void searchWithEnterPress(String text) {
        insertText(text);
        textInput.sendKeys(Keys.ENTER);
    }

    private void insertText(String text) {
        clearInput();
        textInput.sendKeys(text);
    }

    public void clearInput() {
        textInput.clear();
    }

    public void searchWithButtonClick(String text) {
        insertText(text);
        searchButton.click();
    }
}