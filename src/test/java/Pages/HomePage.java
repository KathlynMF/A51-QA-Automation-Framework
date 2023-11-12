import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import java.time.Duration;



public class HomePage extends BasePage {

    @FindBy(css * "a.view-profile")
    WebELement profileIcon;

    public HomePage(WebDriver givenDriver){
        super(givenDriver);
    }

    publicHomePage clickProfileIcon(){
        click(profileIcon);
        return this;
    }

    By firstPlaylist = By.cssSelector(".playlist:nth-child(3");

    By playlistNameField = By.cssSelector("[name='name']");

    By renamePlaylistSuccessMsg = By.cssSelector("div.successs.show");

    public void doubleClickPlaylist(){
        findElement(playlistNameField).sendKeys(Keys.chord (Keys.CONTROL, "a", Keys.BACK_SPACE));
        findElement(playlistNameField).sendKeys(playlistName);
        findElement(playlistNameField).sendKeys(Keys.ENTER);
    }

    public String getRenamePlaylistSuccessMsg(){
        return findElement(renamePlaylistSuccessMsg).getText();


    }





}