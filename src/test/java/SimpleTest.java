import org.testng.annotations.Test;

public class SimpleTest extends BaseTest {

    @Test
    public void runTest() {
        Website website = new Website(driver);
        Header header = website.getHeader(); //przypisanie do zmiennej tego headera (to ten same ktory jest w website/ kiedy odpala się konstruktor Header który ustawia wartośc header?
        website.wait(2000);
        SearchBox searchBox = header.getSearchBox();
        searchBox.searchWithButtonClick("dress");
        website.wait(2000);
        website = new Website(driver);
        header = website.getHeader();
        website.wait(2000);
        searchBox = header.getSearchBox();
        searchBox.searchWithEnterPress("shirt");
    }

    @Test
    public void verifyThatHeaderIncludesThreeElements() {
        Website website = new Website(driver);
        Header header = website.getHeader();
        website.wait(4000);
        header.getSearchBox();
        header.getShoppingCart();
        header.getLogoBlock();
    }

    @Test
    public void hangOnWomenTab() {
        Website website = new Website(driver);
        Header header = website.getHeader();
        website.wait(4000);
        HeaderTabs headerTabs = header.getheaderTabs();
        headerTabs.moveToElement();
        website.wait(8000);

    }



}