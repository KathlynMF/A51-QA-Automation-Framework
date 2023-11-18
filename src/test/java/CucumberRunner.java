import io.cucumber.testing.AbstractTestNGCucumberTests;
import io.cucumber.testing.CucumberOptions;
import io.cucumber.testing.TestNGCucumberRunner;
import org.testing.annotations.*;


@CucumberOptions(
        features = {"src/test/resources/features/Login.feature"})

public class CucumberRunner extendsAbstractTestNGCucumberTests {

    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void setUpCucumber(){
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @DataProvider
    public Object[][] features(){
        return testNGCucumberRunner.provideScenarios();
    }

    @AfterClass(alwaysRun = true){
        public void tearDownClass(){
            testNGCucumberRunner.finish();
        }
    }
}