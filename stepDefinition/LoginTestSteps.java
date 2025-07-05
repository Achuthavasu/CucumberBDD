package stepDefinition;

import PageObject.LoginPage;
import io.cucumber.java.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class LoginTestSteps extends BaseClass {

@Before
public void setUp(){
    System.out.println("before test");
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
//multiple @Before can be created with order of executions if required
//@BeforeStep //executes before every step
//@AfterStep //executes after every step
@After
public void tearDown()
{
    System.out.println("after test");
//    if(sc.isFailed()==true)
//    {
//        // Take screenshot and store as a file
//        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        // Save the screenshot to desired location
//        File destination = new File("screenshot.png");
//}
    if(driver!=null){driver.quit();}
}
    @Given("User Launch Chrome Browser")
    public void user_launch_chrome_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        LoginPage loginPage= new LoginPage(driver);
    }
    @When("User open url {string}")
    public void user_open_url(String url) {

            driver.get(url);
    }
    @And("User enters email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String emailAdd, String pwd) {
        loginPage= new LoginPage(driver);}

    @And("Click on Login")
    public void click_on_login() {
        loginPage.clickLogin();
    }

    }

