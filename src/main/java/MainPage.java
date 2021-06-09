import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public static String BASE_URL = "https://liquipedia.net/dota2/Main_Page";
    WebDriver driver;
    @FindBy(xpath="//div[@class='input-group-append']")
    WebElement searchButton;
    @FindBy(xpath = "//*[@class='search-input form-control']")
    WebElement searchField;
    @FindBy(xpath="//div[@class='main-page-banner-top-row']")
    WebElement mainPageTitle;

    public MainPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Set text in the searchField
    public void setTextInSearchField (String nigma) {
        searchField.sendKeys(nigma);
    }

    //Click on the searchButton
    public void clickSearch() {
        searchButton.click();

    }
    //Get the Main Page title
    public String getMainPageTitle () {
        return mainPageTitle.getText();
    }
}
