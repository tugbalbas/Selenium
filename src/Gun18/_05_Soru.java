package Gun18;
/*
  Senaryo;
  1- https://www.snapdeal.com/  sitesine gidiniz.
  2- Random Bir tane ürüne tıklatınız.
  3- Açılan yeni window daki ürünü sepete ekletiniz.
  4- Ana Window a dönüp sepete tıklatınız.
  5- Sepete eklenen ürün ile sepete tıklattığınızdaki ekrana çıkan
     ürün ismi aynı olup olmadığını assert ile kontrol ediniz.

*/

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

public class _05_Soru extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        String anaId= driver.getWindowHandle();

        List<WebElement> productList=driver.findElements(By.cssSelector("div.product-img"));
        int random=(int)(Math.random()*(productList.size()));
        WebElement secilen= productList.get(random);

        while (!secilen.isDisplayed()){
            WebElement next = driver.findElement(By.xpath("(//i[@class='next-i'])[2]"));
            Bekle(1);
            next.click();
        }
        secilen.click();
        Set<String> idLer=driver.getWindowHandles();
        for (String id:idLer){
            if (id.equals(anaId)) continue;
            driver.switchTo().window(id);
        }
        WebElement addCartBtn= driver.findElement(By.id("add-cart-button-id"));
        addCartBtn.click();
        WebElement addedProduct=driver.findElement(By.cssSelector("span.product-name>a"));
        String exPected=addedProduct.getText();
        System.out.println(exPected);     // saglama

        driver.switchTo().window(anaId);
        WebElement sePet=driver.findElement(By.cssSelector("i.sd-icon.sd-icon-cart-icon-white-2"));
        sePet.click();

        driver.switchTo().activeElement();  // deneme yanilma frame, window, alert degil
        WebElement productInCart=driver.findElement(By.cssSelector("div.item-name-wrapper>a"));
        Assert.assertEquals(exPected,productInCart.getAttribute("title"));
        System.out.println(productInCart.getAttribute("title"));     //saglama

        for (String id:idLer){
            driver.switchTo().window(id).close();
        }


    }
}