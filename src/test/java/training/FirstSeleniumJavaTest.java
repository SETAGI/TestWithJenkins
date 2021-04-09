package training;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstSeleniumJavaTest {

    private WebDriver driver;

    @Test
    public void testEasy(){
        driver.get("https://testautomationu.applitools.com/");
        driver.manage().window().maximize();

        String title = driver.getTitle();
        Assert.assertEquals(title,"Test Automation University | Applitools");
    }

    @BeforeTest
    public void beforeTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterTest
    public void afterTest(){
        driver.quit();
    }

}
