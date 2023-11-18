import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Homework21 extends BaseTest {

    String new PlaylistName = "Sample Edited Playlist";

    @Test
    public void renamePlaylist(){

        String updatedPlaylistMsg = "Updated playlist \"Sample Edited Playlist.\"";

        provideEmail("demo@class.com");
        providePassword("te$t$udent");
        clickSubmit();
        doubleClickPlaylist();
        enterNewPlaylistName();
        Assert.assertEquals(getRenamePlaylistSuccessMsg(), updatedPlaylistMsg);
    }

    public void doubleClickPlaylist(){
        WebElement playlistELement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".playlist:nth-child(3)")));
        actions.doubleClick(playlistElement).perform();
    }

    public void enterNewPLaylistName(){
        WebElement playlistInputField = wait.until(ExpectedConditions.visibilityOfELementLocated(By.cssSelector("[name ='name']")));

        playlistInputField.sendKeys(keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
        playlistInput.sendKeys(newPlaylistName);
        playlistInputField.sendKeys(Keys.ENTER);

    }

    public String getRenamePlaylistSuccessMsg(){
        WebElement notification = wait.until(ExpectedConditions.visiblityOfElementLocated(By.cssSelectar("div.success.show")));
        return notification.getText();
    }



}


}