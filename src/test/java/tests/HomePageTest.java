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
        // Set up WebDriver for Chrome
        System.setProperty("webdriver.chrome.driver", "src/drivers/windows/chromedriver.exe");
        driver = new ChromeDriver();

        // Set up WebDriver for Firefox
        // System.setProperty("webdriver.gecko.driver", "src/drivers/windows/geckodriver");
        // driver = new FirefoxDriver();

        // Set up WebDriver for Safari
        // driver = new SafariDriver();

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