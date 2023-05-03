package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BigTableTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://cosmocode.io/automation-practice-webtable/");
        driver.manage().window().maximize();
    }

    @Test
    public void test10rows() {
        String[][] expectedCellValues = {
                {"Afghanistan", "Kabul", "Afghani", "Dari Persian; Pashto"},
                {"Albania", "Tirane", "Lek", "Albanian"},
                {"Algeria", "Algiers", "Algerian Dinar", "Arabic; Tamazight; French"},
                {"Andorra", "Andorra la Vella", "Euro", "Catalan"},
                {"Angola", "Luanda", "Kwanza", "Portuguese"},
                {"Antigua & Barbuda", "Saint John’s", "East Caribbean Dollar", "English"},
                {"Argentina", "Buenos Aires", "Argentine Peso", "Spanish"},
                {"Armenia", "Yerevan", "Dram", "Armenian"},
                {"Australia", "Canberra", "Australian Dollar", "English"},
                {"Austria", "Vienna", "Euro", "German"},
                {"Azerbaijan", "Baku", "Manat", "Azerbaijani"},
                {"The Bahamas", "Nassau", "Bahamian Dollar", "English"},
                {"Bahrain", "Manama", "Bahraini Dinar", "Arabic"},
                {"Bangladesh", "Dhaka", "Taka", "Bangla"},
                {"Barbados", "Bridgetown", "Barbadian Dollar", "English"},
                {"Belarus", "Minsk", "Belarusian Ruble", "Belarusian; Russian"},
                {"Belgium", "Brussels", "Euro", "Dutch; French; German"},
                {"Belize", "Belmopan", "Belize Dollar", "English"},
                {"Benin", "Porto-Novo", "West African CFA Franc", "French"},
                {"Bhutan", "Thimphu", "Ngultrum", "Dzongkha"},
                {"Bolivia", "La Paz; Sucre", "Boliviano", "Spanish; Quechua; Aymara"},
                {"Bosnia and Herzegovina", "Sarajevo", "Convertible Mark", "Bosnian; Croatian; Serbian"},
                {"Botswana", "Gaborone", "Pula", "English; Tswana"},
                {"Brazil", "Brasilia", "Real", "Portuguese"},
                {"Brunei", "Bandar Seri Begawan", "Brunei Dollar", "Malay"},
                {"Bulgaria", "Sofia", "Lev", "Bulgarian"},
                {"Burkina Faso", "Ouagadougou", "West African CFA Franc", "French"},
                {"Burundi", "Bujumbura", "Burundi Franc", "Kirundi; French"},
                {"Cambodia", "Phnom Penh", "Riel", "Khmer"},
                {"Cameroon", "Yaounde", "Central African CFA Franc", "French; English"},
                {"Canada", "Ottawa", "Canadian Dollar", "English; French"},
                {"Cape Verde", "Praia", "Cape Verdean Escudo", "Portuguese"},
                {"Central African Republic", "Bangui", "Central African CFA Franc", "Sango; French"},
                {"Chad", "N’Djamena", "Central African CFA Franc", "French; Arabic"},
                {"Chile", "Santiago", "Chilean Peso", "Spanish"},
                {"China", "Beijing", "Chinese Yuan", "Mandarin"},
                {"Colombia", "Bogota", "Colombian Peso", "Spanish"},
                {"Comoros", "Moron", "Comorian Franc", "Comorian; Arabic; French"},
                {"Democratic Republic Of the Congo", "Kinshasa", "Congolese Franc", "French"},
                {"Republic of the Congo", "Brazzaville", "Central African CFA Franc", "French"},
                {"Costa Rica", "San Jose", "Colon", "Spanish"},
                {"Cote d’Ivoire (Ivory Coast)", "Yamoussoukro; Abidjan", "West African CFA Franc", "French"},
                {"Croatia", "Zagreb", "Croatian", "Kuna"},
                {"Cuba", "Havana", "Cuban Peso", "Spanish"},
                {"Cyprus", "Nicosia", "Euro", "Greek; Turkish"},
                {"Czechia", "Prague", "Czech Koruna", "Czech; Slovak"},
                {"Denmark", "Copenhagen", "Danish Krone", "Danish"},
                {"Djibouti", "Djibouti", "Djiboutian Franc", "Arabic; French"},
                {"Dominica", "Rosesau", "East Caribbean Dollar", "English; French; Antillean Creole"},
                {"Dominican Republic", "Santo Domingo", "Dominican Peso", "Spanish"},
                {"East Timor (Timor-Leste)", "Dilli", "United States Dollar", "Tetum; Portuguese; Iindonesian"},


        };

        SoftAssert softAssertion = new SoftAssert();
        // WebElement table = driver.findElement(By.id("countries"));

        for (int i = 0; i < expectedCellValues.length; i++) {
            String[] expectedRowValues = expectedCellValues[i];
//            "tr:nth-child(" + (i +2) + ")"
//            driver.findElement(By.cssSelector("#countries tr:nth-child(2)"));
//            String selector = "tr:nth-child(" + i +2 + ")";
//            String selector = "tr:nth-child(".concat(String.valueOf(i +2)).concat(")");

            String xpathExpression = "//*[@id=\"countries\"]/tbody/tr[" + (i + 2) + "]";

            WebElement actualRow = driver.findElement(By.xpath(xpathExpression));

            // WebElement first = actualRow.findElement(By.cssSelector("td:nth-child(2)"));
            for (int j = 0; j < expectedRowValues.length; j++) {
                String expectedCellValue = expectedRowValues[j];
                WebElement actualCell = actualRow.findElement(By.xpath(".//td[" + (j + 2) + "]"));

                //  WebElement actualCell = driver.findElement(By.xpath("//*[@id=\"countries\"]/tbody/tr[" + (i + 2) + "]/td[" + (j + 2) + "]"));  ////*[@id="countries"]/tbody/tr[2]/td[2]

                // Assert.assertEquals(actualCell.getText(), expectedCellValue);


                softAssertion.assertEquals(actualCell.getText(), expectedCellValue);

            }
        }

        softAssertion.assertAll();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();

    }


}
