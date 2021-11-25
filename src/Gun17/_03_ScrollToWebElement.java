package Gun17;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _03_ScrollToWebElement extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://triplebyte.com/");

        JavascriptExecutor js=(JavascriptExecutor) driver;

        // Hangi elemana kadar scroll yapılacaksa o eleman bulunur
        WebElement element=driver.findElement(By.cssSelector("a[class='font-bold bg-candidate-blue hover:bg-candidate-blue-darker rounded text-white p-3 pl-4 mt-10 fill-white inline-flex items-center text-xl']"));

        js.executeScript("arguments[0].scrollIntoView()", element); //element.scrollIntoView()
        // arguments[0] : virgülden sonraki ilk eleman gözükene kadar scroll yap -> scrollIntoView()

         Bekle(2);
         js.executeScript("arguments[0].click", element); // bu elemana click yap

        BekleVeKapat();


    }
}
