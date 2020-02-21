import org.graalvm.compiler.java.JsrNotSupportedBailout;
import org.junit.Assert;
        import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

        import java.security.PublicKey;
        import java.sql.Driver;

public class PraticeQuestions {


    WebDriver driver = new ChromeDriver();
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @Test
    public void First() throws InterruptedException{
        System.setProperty("driver.chrome.driver","chromeDriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.toolsqa.com/automation-pratice-form/");
        driver.manage().window().maximize();

    }


    @Test
    public void Second() throws InterruptedException{
        driver.findElement(By.linkText("Partial Link Test")).isDisplayed();
        Assert.assertTrue(driver.findElement(By.linkText("Partial Link Test")).isDisplayed());
        System.out.println("Partial link test Exists");

    }

    @Test
    public void linkTest() throws InterruptedException{
        WebElement text = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]div/form/fieldset/div/[5]/a/strong"));
        String expectedstring = "Link Test";
        Assert.assertEquals(expectedstring,text.getText());
    }

    @Test
    public void FirstName() throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[8]/input")).sendKeys("Prabha");
    }

    @Test
    public void lastName() throws InterruptedException{
        driver.findElement(By.xpath("//[@id=\"lastName\"]/")).sendKeys("Bista");
    }

    @Test
    public void openChromeBrowser() throws InterruptedException{
        js.executeScript("window.scrollBy(0,1000)");
        WebElement target = driver.findElement(By.xpath("//*[@id=\"sex-1\"]"));
    }

    @Test
    public void OpenChromeBrowser() throws InterruptedException{

    }











}


