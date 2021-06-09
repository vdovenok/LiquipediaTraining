import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBasics {
    WebDriver driver;
    MainPage objMainPage;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
        driver = new ChromeDriver();
        driver.get(MainPage.BASE_URL);
       // driver.manage().timeouts().implicitlyWait(java.time.Duration 5);
    }
    @Test
    public void Test_Main_Page_Appear_Correct () {
        objMainPage = new MainPage(driver);
        Assert.assertTrue(objMainPage.getMainPageTitle().toLowerCase().contains("welcome to"));

        //Approach TeamPage
        objMainPage.setTextInSearchField("nigma");
        objMainPage.clickSearch();

    }

}
