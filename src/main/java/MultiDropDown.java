import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {
    public static void main(String[] args) throws InterruptedException {

//        tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
        //System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        //        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();

//        goto syntaxprojects.com
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");

//        get the drop Down
        WebElement DD = driver.findElement(By.xpath("//select[@id='multi-select']"));
//        use the select class
        Select sel =new Select(DD);

        String nj= "New Jersey";

//        Select by value
        sel.selectByValue(nj);
//        select by visible text
        String ohio = "Ohio";
        sel.selectByVisibleText(ohio);
//to slow
        Thread.sleep(2000);
//        When it come MultiSelect Drop Down we can also deselct
        sel.deselectByValue(nj);

        sel.deselectByVisibleText(ohio);

        System.out.println("The drop Down is multiple " + sel.isMultiple());





    }
}

