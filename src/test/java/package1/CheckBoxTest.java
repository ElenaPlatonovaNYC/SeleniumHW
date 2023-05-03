package package1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;

@Test
public class CheckBoxTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
    }

    @Test
    public void selectCheckBoxWithOption4() {
        // WebElement checkBox4 = driver.findElement (By.cssSelector("[value='Option-4']"));
        WebElement checkBox4 = driver.findElement(By.xpath("//*[@value='Option-4']"));
        checkBox4.click();

        WebElement checkBoxText = driver.findElement(By.xpath("//label[*[@value='Option-4']]"));
//        WebElement checkBoxText=driver.findElement(By.cssSelector("label:has(>[value=\"Option-4\"])"));

        Assert.assertEquals(checkBoxText.getText(), "Option 4");
        //Assert.assertEquals(true, checkBox4.isSelected(), "the checkBox is not selected");
        Assert.assertTrue(checkBox4.isSelected(),"the checkBox is not selected");
    }
    @Test
    public void lastCheckBoxShouldDisplayMessege() {
        WebElement lastCheckbox = driver.findElement(By.id("myCheck"));
        //  WebElement lastCheckbox= driver.findElement(By.xpath("//*[@id=\"myCheck\"]"));
        lastCheckbox.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement demoWindow = driver.findElement(By.xpath("//*[@id=\"GFG_DOWN\"]"));
        // WebElement demoWindow = driver.findElement(By.id("GFG_DOWN"));
        String expectedText = "Syntax Practice.";
        try {
            wait.until(ExpectedConditions.textToBePresentInElement(demoWindow, expectedText));
        } catch (TimeoutException timeoutException) {
            Assert.fail("Cannot locate text '" + expectedText + "' near the checkbox", timeoutException);
        }



    }
    @Test
    public void takeScreenshot() {

        TakesScreenshot ss = (TakesScreenshot) driver;
//        take the scrren shot as file

        File sourceFile = ss.getScreenshotAs(OutputType.FILE);

//        save the file in computer
      //  FileUtils.copyFile(sourceFile,new File("" + "C:\\Users\\angel\\IdeaProjects\\SeleniumHW"));



    }

    @AfterMethod

    public void tearDown() {
        driver.close();
    }

}
