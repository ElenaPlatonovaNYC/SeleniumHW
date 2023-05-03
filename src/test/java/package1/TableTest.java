package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TableTest {

    public static WebDriver driver;

    @BeforeMethod

    public void setUpMethod() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

    }

    @Test
    public void line6Check() {
        WebElement line6a = driver.findElement(By.cssSelector("#customers > tbody > tr:nth-child(6) > td:nth-child(1)"));
        Assert.assertEquals(line6a.getText(), "Adobe");
        WebElement line6b = driver.findElement(By.cssSelector("#customers > tbody > tr:nth-child(6) > td:nth-child(2)"));
        Assert.assertEquals(line6b.getText(), "Yoshi Tannamuri");
        WebElement line6c = driver.findElement(By.cssSelector("#customers > tbody > tr:nth-child(6) > td:nth-child(3)"));
        Assert.assertEquals(line6c.getText(), "Canada");

    }

    @DataProvider(name = "tableLines")
    public Object[][] data() {
        Object[][] tableContent = {
                {"Google", "Maria Anders", "Germany"},
                {"Meta", "Francisco Chang", "Mexico"},
                {"Microsoft", "Roland Mendel", "Austria"},
                {"Island Trading", "Helen Bennett", "UK"},
                {"Adobe", "Yoshi Tannamuri", "Canada"},
                {"Amazon", "Giovanni Rovelli", "Italy"}

        };
        return tableContent;
    }


//     @Test(dataProvider = "tableLines")
//    public void testTableContent(String company, String contact, String country){
//        return: company,contact, country;
//     }

}


