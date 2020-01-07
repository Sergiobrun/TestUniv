package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By usernamefield = By.id("username");
    private By passfield = By.id("password");
    private By loginbtn = By.xpath("//button[@class = 'radius']");

    public LoginPage(WebDriver driver){
        this.driver =driver;
    }

    public SecureAreaPage Login(String username, String password){
        driver.findElement(usernamefield).sendKeys(username);
        driver.findElement(passfield).sendKeys(password);
        driver.findElement(loginbtn).click();
        return new SecureAreaPage(driver);
    }

}
