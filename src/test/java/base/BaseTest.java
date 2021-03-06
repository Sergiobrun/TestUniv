package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.util.List;

public class BaseTest {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);

        //driver.manage().window().setSize(new Dimension( 375, 812));
        /*
        WebElement inputsLink = driver.findElement(By.linkText("Shifting Content"));
        inputsLink.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("got interrupted!");
        }
        WebElement menuElement = driver.findElement((By.xpath("//a[@href = '/shifting_content/menu']")));
        menuElement.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("got interrupted!");
        }
        List<WebElement> links = driver.findElements(By.tagName("li"));
        System.out.println(links.size());
        //System.out.println(driver.getTitle());

         */
        //driver.quit();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

/*
    public static void main(String args[]){
        BaseTest test = new BaseTest();
        test.setUp();
    }
 */

}
