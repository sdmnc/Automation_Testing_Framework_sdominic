package Managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverManager {
    private WebDriver driver;
    private String webDriverType;

    public WebDriverManager(String driverType) {
        webDriverType = driverType;
    }

    private WebDriver createDriver() {
        switch (webDriverType) {
            case "CHROME":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "FIREFOX":
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("The driver was not created");
                System.out.println("There is not defined such type of Driver: " + webDriverType);

        }
        return driver;
    }

    public WebDriver getDriver() {
        if (driver == null) {
            driver = createDriver();
        }
        return driver;
    }

    public void closeDriver() {
        driver.quit();
    }


}