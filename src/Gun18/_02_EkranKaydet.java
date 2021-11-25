package Gun18;

/*
   Senaryo :
        1- https://opensource-demo.orangehrmlive.com/  sitesine gidiniz.
        2- Login işlemini yapınız.
        3- Welcome yazan sağ üst tarafta kullanıcı adının geçip geçmediğini kontrol ediniz.
        4- Eğer Kullanıcı adınız gözükmüyorsa , ekran görünütüsnü kaydedip, ilgili kişiye gönderiniz.
 */

//commons.io  jar kütüphane ekle
//        https://mvnrepository.com/artifact/commons-io/commons-io/2.8.0
import Utils.BaseStaticDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class _02_EkranKaydet extends BaseStaticDriver {
    public static void main(String[] args) throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement username=driver.findElement(By.id("txtUsername"));
        username.sendKeys("");

        WebElement password=driver.findElement(By.id("txtPassword"));
        password.sendKeys(" ");

        WebElement btnLogin=driver.findElement(By.id("btnLogin"));
        btnLogin.click();


        List<WebElement> hataMesaji=driver.findElements(By.id("spanMessage"));

        if (hataMesaji.size()==0) // login olabilmiş demektir
        {
            System.out.println("LOgin oldum: Çünkü sayfada bu hata mesajı elementi bulunamadı");
        }
        else {
            // hata oluşmuş
            System.out.println("Login olamadı. Çünkü hala aynı sayfadayım");

            // ekran kaydını alalım.
            TakesScreenshot ts=(TakesScreenshot) driver; // 1. Aşama ekran görüntüsü alma değişkenimizi tanımladık.
            File ekranDosyasi=ts.getScreenshotAs(OutputType.FILE); // 2. Aşama alınacak Ekran görüntü dosyası tipi seçilerek hafızada oluşturuldu.
            FileUtils.copyFile(ekranDosyasi, new File("ekranGoruntuleri/Orange/LoginKontrol.png")); // bu yolu biz kendimiz oluşturduk
            // hafızadaki ekranDosyasi nı al bunu verdiğim yola ve isme kaydet.
            // jpg,bmp,gif ..

            // Ödev buradaki dosya adını zamana bağlı hale getiriniz ki hep üstüne kaydetmesin
            // mesala 20210526111201  gib... DATE-TIME

        }

        BekleVeKapat();

    }
}
// else
//         {
//         System.out.println("Login olamadı. Çünkü hala aynı sayfdadayım.");
//         //Hata oldu screenshot alayim
//         LocalDateTime date=LocalDateTime.now();
//         DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd.MM.yyyy");
//
//         TakesScreenshot tss=(TakesScreenshot) driver;           // ekran gör alma degiskeni tanimlandi
//         File screenShots=tss.getScreenshotAs(OutputType.FILE);  // file olarak hafizada olusturuldu
//         FileUtils.copyFile(screenShots,new File("screenShots/Orange/"+date.format(formatter)+"Logincontrl.png")); // kayit yeri gösterildi
//         // hafızadaki ekranDosyasi nı al bunu verdiğim yola ve isme kaydet.
//         // jpg,bmp,gif ..
//
//         // Ödev buradaki dosya adını zamana bağlı hale getiriniz ki hep üstüne kaydetmesin
//         // mesala 20210526111201  gib...
//
//         }
