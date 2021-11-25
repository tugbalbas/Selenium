package Gun06;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _01_FindingElements_tag extends BaseStaticDriver {
    public static void main(String[] args) {

        // BaseStaticDriver.baslat();  in tüm static kısmı buraya gelmiş oldu (static bloğu olduğu için
        driver.get("http://www.practiceselenium.com/"); // linke gitti

        List<WebElement> liListe = driver.findElements(By.tagName("li")); // tagname yani etiketi 'li' olan bütün elemanlar

        for ( WebElement e : liListe ) {
            System.out.println(e.getText());
        }

        BekleVeKapat();

    }
}

// Welcome
// Our Passion
// Menu
// Let's Talk Tea
// Check Out

/*
Interview sorusu

<a href=""> </a> sayfadaki tıkla linklerin hepsi nasıl bulabiliriz?

driver.findElements(By.tagName("a")); ---> burada etkin olanlar ve etkin olmayanlar bulunur

getText()="" etkin olmmayanlar yani boş olanlar for döngüsüyle bu şekilde

2. soru

findElement ile findElements arasındaki fark nedir?

findElement elemanı bulamazsa "no such element" hatası veriyor,
findElements elemanı bulamazsa hata vermez boş list döndürür

 */
