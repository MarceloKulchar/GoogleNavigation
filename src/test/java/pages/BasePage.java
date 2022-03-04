package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BasePage {
    protected static WebDriver driver;
    

    static{
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
    }

    public BasePage(WebDriver driver){
        BasePage.driver = driver;

    }

    public static void navigateTo(String url){
        driver.get(url);
    }
}


