import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.Assert;


public class ProfileTests extends BaseTest {

    @Test
    public void changeProfileName() throws InterruptedException {

        navigateToPage();

        provideEmail("dem@class.com");
        providePassword("te$t$tudent");
        clickSubmit();

        String randomName = generateRandomName();

        provideCurrentPassword("te$t$tudent");
        provideProfileName(randomName);
        clickSaveButton();

        Thread.sleep(2000);
        WebElement actualProfileName = driver.findElement(By.cssSelector("a.view-profile>span"));
        Assert.assertEquals(actualProfileName.getTect(). randomName);



    }

    @Test
    public void changeCurrentTheme() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ProfilePage profilePage = new ProfilePage(driver);

        loginPage.provideEmail("demo@class.com")
                .providePassword("te$t$tudent")
                .clickSubmit();

        homepage.clickProfileIcon();

        profilePage.chooseVioletTheme();

        Assert.assertTrue(profilePage.isViolentThemeSelected());
    }

      public ProfilePage(Webdriver givenDriver){
          super(givenDriver);
      }

      @FindBy(css = "[data-testid='theme-card-violet]")
      WebElement violetTheme;

      @FindBy(css = "[data-testid='theme-card-violet][class='theme selected']")
      WebElement selectedVioletTheme;

      public boolean isVioletThemeSelected(){
          findElement(selectedVioletTheme);
          return selectedVioletTheme.isDisplayed();
      }

      public ProfilePage chooseVioletTheme(){
          click(violetTheme);
          return this;
      }






}