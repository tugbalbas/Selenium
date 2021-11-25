package Gun18;
/*
    Senaryo
    1- https://testsheepnz.github.io/BasicCalculator.html sitesine gidiniz.
    2- random 100 e kadar 2 sayı üretiniz.
    3- Sayıları hesap makinesinin bütün fonksiyonları için çalıştırınız.
    4- Sonuçları Assert ile kontrol ediniz.
    5- Yukarıdaki işlemi 5 kez tekrar ettiriniz.
 */

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _03_Soru extends BaseStaticDriver {
    public static void main(String[] args) {
        // Interviewda çıkmış bu sayfa
        driver.get("https://testsheepnz.github.io/BasicCalculator.html"); // siteyi açtım
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        for (int i = 0; i <5; i++)
        {
            int random11=(int)(Math.random()*101); // 1. sayıyı ürettik
            String random1=String.valueOf(random11);

            int random22=(int)(Math.random()*101); // 2. sayıyı ürettik
            String random2=String.valueOf(random22);

            WebElement firstNumber= driver.findElement(By.cssSelector("input#number1Field"));
            firstNumber.sendKeys(random1); // 1. randomı gönderdik
            WebElement secondNumber= driver.findElement(By.id("number2Field"));
            secondNumber.sendKeys(random2); // 2. randomı gönderdik

            Select islem=new Select(driver.findElement(By.id("selectOperationDropdown")));
            List<WebElement> dortIslem=driver.findElements(By.cssSelector("select#selectOperationDropdown>option"));
            int random3=(int)(Math.random()*dortIslem.size());
            islem.selectByVisibleText(dortIslem.get(random3).getText()); // random işlem seçtirdik

            if (dortIslem.get(random3).getText().equals("Divide")){
                WebElement integerOnly=driver.findElement(By.id("integerSelect"));
                integerOnly.click();
            }

            WebElement calCulate=driver.findElement(By.id("calculateButton"));
            calCulate.click();

            WebElement ansWer=driver.findElement(By.id("numberAnswerField"));

            switch (dortIslem.get(random3).getText()) {
                case "Add" : {
                    int exPected = random11 + random22;
                    String expected = String.valueOf(exPected);
                    Assert.assertEquals(expected, ansWer.getAttribute("value"));  // google dan ogr. read only ler value al
                    break;
                }
                case "Subtract" : {
                    int exPected = random11 - random22;
                    String expected = String.valueOf(exPected);
                    Assert.assertEquals(expected, ansWer.getAttribute("value"));
                    break;
                }
                case "Multiply" : {
                    int exPected = random11 * random22;
                    String expected = String.valueOf(exPected);
                    Assert.assertEquals(expected, ansWer.getAttribute("value"));
                    break;
                }
                case "Divide" : {

                    int exPected =(int) (random11 / random22);
                    String expected = String.valueOf(exPected);
                    Assert.assertEquals(expected, ansWer.getAttribute("value"));
                    break;
                }
                case "Concatenate" : {
                    String expected = random1 + random2;
                    Assert.assertEquals(expected, ansWer.getAttribute("value"));
                    break;
                }
            }
            Bekle(1);

            WebElement clearBtn=driver.findElement(By.id("clearButton"));
            clearBtn.click();
            firstNumber.clear();
            secondNumber.clear();

        }

        BekleVeKapat();

    }
}
