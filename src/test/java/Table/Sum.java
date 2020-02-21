package Table;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

public class Sum {


    WebDriver wd;

    @Before
    public void login() throws InterruptedException {

        System.setProperty("webDriver.gecko.driver", "geckodriver.exe");
        wd = new FirefoxDriver();
        wd.get("https://www.w3schools.com/sql/sql_count_avg_sum.asp");
        wd.manage().window().maximize();

    }

    @Test
    public void sumTable() {
        double sum = 0.00;
        double expectedSum = 91.35;
        List<WebElement> rows = wd.findElements(By.xpath("//*[@id='main']/div[6]/table/tbody/tr/td[6]"));

        for (WebElement row : rows) {
            double no = Double.parseDouble(row.getText());
            sum = sum + no;
        }
        Assert.assertEquals(sum, expectedSum, 2);

    }


    @Test
    public void ProductNameList() throws InterruptedException {

        String[] expectedPdtName = {"Chais", "Chang", "Aniseed Syrup", "Chef Anton's Cajun Seasoning", "Chef Anton's Gumbo Mix"};
        List<WebElement> rows = wd.findElements(By.xpath("//*[@id=\"main\"]/div[6]/table/tbody/tr/td[2]"));

        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < rows.size(); i++) {

            String listText = rows.get(i).getText();
            names.add(listText);
            System.out.println(listText);
        }

    }

    @After
    public void exit() {
        wd.quit();

    }
}


