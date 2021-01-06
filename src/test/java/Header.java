import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Header extends BasicElement {

    private WebElement logo;
    private SearchBox searchBox;
    private ShoppingCart shoppingCart;
    private LogoBlock logoBlock;
    private HeaderTabs headerTabs;

    public Header(WebElement element, WebDriver driver) {
        super(element, driver);
        logo = element.findElement(By.xpath("//img[@class='img-responsive']"));
        searchBox = new SearchBox(element.findElement(By.xpath("//div[@id='search_block_top']")), driver);
        shoppingCart = new ShoppingCart(element.findElement(By.xpath("//div[@class='col-sm-4 clearfix']")), driver);
        logoBlock = new LogoBlock(element.findElement(By.xpath("//div[@id='header_logo']")),driver);
        headerTabs = new HeaderTabs(element.findElement(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']")),driver);
    }

    public void clickLogo() {
        logo.click();
    }

    public SearchBox getSearchBox() {
        return searchBox;
    }
    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }
    public LogoBlock getLogoBlock(){
        return logoBlock;
    }
    public HeaderTabs getheaderTabs(){
        return headerTabs;
    }
}