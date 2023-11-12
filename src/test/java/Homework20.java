import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Homework20 extends BaseTest {

    @Test
    public void hoverOverPlayButton(){
        provideEmail("demo@class.com");
        providePassword("te$t$tudent");
        clicksubmit();
        Assert.assertTrue(hoverPlay().isDisplayed());
    }

    public WebElement hoverPlay(){
        WebElement play = driver.findElement(By.cssSelector("[data-testid='play-btn]"));
        actions.moveToElement(play).perform();
        return wait.until(ExpectedConditions.visibilityOf(play));
    }

    @Test

    public void countSongsInPlaylist(){

        provideEmail("demo@class.com");
        providePassword("te$t$tudent");
        clickSubmit();
        choosePlaylistByName("Playlist Demo");
        displayALlSongs();
        Assert.assertTrue(getPlaylistDetails().contains(Stromg.value0f(countSongs())));
    }

    public void choosePlaylistByName(String playlistName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),']" + playlistName + ")]"))).click();
    }

    public int countSongs() {
        return driver.findELement(By.cssSelector("section#playlistWrapper td.title")).size();
    }

    public String getPlaylistDetails(){
        return driver.findElement(By.cssSelector("span.meta.text-secondary span.meta")).getText();
    }

    public void displayAllSongs(){
        List<WebElement> songList = driver.findElement(By.cssSelector("section#playlistWrapper td.title"));
        System.out.println("Number of songs found: " + countSongs());
        for (WebElement e: songList){'
        System.out.println(e.getTest());
        }
    }

}