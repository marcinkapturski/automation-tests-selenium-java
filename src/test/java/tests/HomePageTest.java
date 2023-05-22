package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import pages.HomePage;

public class HomePageTest {
    private WebDriver driver;
    private HomePage homePage;

    @Before
    public void setup() {
        String chromeDriverPath = System.getenv("CHROME_DRIVER_PATH");
        if (chromeDriverPath == null) {
            throw new IllegalArgumentException("CHROME_DRIVER_PATH environment variable is not set");
        }

        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @Test
    public void exampleTest() {
        homePage.open();

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
