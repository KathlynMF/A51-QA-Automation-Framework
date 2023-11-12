import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;


public class Homework23 extends BaseTest {


    public static pickBrowser(String Browser) throws MalformedURLException{
        DesiredCapabilities caps = new DesiredCapabilities();
        String girdURL = "http://192.168.55.103:4444";
    }

    switch(browser){
        case "firefox":
            WebDriverManager.firefoxdriver().setup();
            return driver = new FireFoxDriver();

        case "Microsoft Edge":
            WebDriverManager.edgedriver().setup();
            EdgeOptions edgeOptions = new EdgeOptions();
            edgeOptions.addArguments("--remote-allow-origins=*");
            return driver = new EdgeDriver(edgeOptions);

        case "grid-edge":
            caps.setCapability("browserName", "Microsoft Edge");
            return driver = new RemoteWebDriver(URL.create(grid.URl).toUrl(), caps);

        case "grid-firefox":
            caps.setCapability("browserName", "firefox");
            return driver = new RemoteWebDriver(URL.create(grid.Url).toUrl(), caps);

        case "grid-chrome":
            caps.setCapability("browserName", "chrome");
            return driver = new RemoteWebDriver(URL.create(grid.Url).toUrl(), caps);

        default:
            WebDriverManager.chromedriver().setup();
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--remote-allow-origins=*");
            return driver = new ChromeDriver(chromeOptions);
    }

}
