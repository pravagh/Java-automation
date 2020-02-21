package openBrowser;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

    @Test
    public void login() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("https://www.gmail.com");
        wd.manage().window().maximize();
        WebElement emailElement = wd.findElement(By.id("identifierId"));
        emailElement.sendKeys("qatesting567@gmail.com");

        WebElement nextButtonElement = wd.findElement(By.xpath("//*{'[@id=identifierNext']"));
        nextButtonElement.click();
        Thread.sleep(5000);
        WebElement txtPwd = wd.findElement(By.name("password"));
        txtPwd.sendKeys("Test@123");

        WebElement btnNext = wd.findElement(By.id("passwordNext"));
        btnNext.click();
        //Thread.sleep(5000);
        wd.quit();

    }






}
