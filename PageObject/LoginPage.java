package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

    WebDriver driver;

    By email= By.xpath("//input[@class='email valid']");
    By password =By.xpath( "//input[@class='password valid']");
    By login = By.xpath("//button[@class='button-1 login-button']");
    By logOut = By.xpath("//a[@class='nav-link']");

    public LoginPage(WebDriver driver){
        this.driver = driver;

    }
        public void enterEmail (String emailAdd)
        {
            driver.findElement(email).sendKeys(emailAdd);
        }
        public void enterPassword(String passAdd)
        {
            driver.findElement(password).sendKeys(passAdd);
        }
        public void clickLogin()
        {driver.findElement(login).click();}
    public void clickLogOut()
    {driver.findElement(logOut).click();}


    }
