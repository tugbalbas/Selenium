package homework.homework4;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

public class Frame_Window_Wait extends BaseStaticDriver {
    public static void main(String[] args) {
        //1
//        driver.get("http://demo.guru99.com/test/guru99home/");
//        String anaSayfaId= driver.getWindowHandle();
//        driver.switchTo().frame("a077aa5e");
//        WebElement imgIframeEnabled= driver.findElement(By.cssSelector("img[src='Jmeter720.png']"));
//        imgIframeEnabled.click();
//        Set<String> idLer=driver.getWindowHandles();
//        for (String id:idLer){
//            if (id.equals(anaSayfaId))continue;
//            driver.switchTo().window(id);
//        }
//        Bekle(1);
//        WebElement phyTon= driver.findElement(By.cssSelector("i.fa.fa-code"));
//        phyTon.click();
//        System.out.println("Url= "+driver.getCurrentUrl());  //Url= https://www.guru99.com/python-tutorials.html
//        for (String id:idLer) {
//            driver.switchTo().window(id);
//            driver.close();
//        }


        //2-3

//        driver.get("https://chercher.tech/practice/frames");
//        WebElement iFrame= driver.findElement(By.id("frame1"));
//        driver.switchTo().frame(iFrame);
//        WebElement inputTopic= driver.findElement(By.cssSelector("input[type='text']"));
//        inputTopic.sendKeys("Tugba");
//        WebElement iFrame3= driver.findElement(By.id("frame3"));
//        driver.switchTo().frame(iFrame3);
//        WebElement innerFrameCheckBox= driver.findElement(By.cssSelector("input#a"));
//        innerFrameCheckBox.click();
//
//        driver.switchTo().defaultContent();
//
//        WebElement iframe2= driver.findElement(By.id("frame2"));
//        driver.switchTo().frame(iframe2);
//        Select aniMals=new Select(driver.findElement(By.id("animals")));
//        aniMals.selectByIndex(2);

        //4
//        driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
//
//        List<WebElement>days=driver.findElements(By.cssSelector("select[id='select-demo']>option"));
//
//        //5 kere wednesday seçtikten sonra döngüyü durdurun.
//        int countWed=0;
//
//        for (int i = 0; i < days.size(); i++) {
//            Select day=new Select(driver.findElement(By.id("select-demo")));
//            day.selectByIndex(4);
//            countWed++;
//            if (countWed==5) break;
//        }
//        System.out.println(countWed + " kere wednesday seçilmiştir");

        //5
//        driver.get("https://www.seleniumeasy.com/test/jquery-download-progress-bar-demo.html");
//
//        WebElement downloadBtn = driver.findElement(By.id("downloadButton"));
//        downloadBtn.click();
//        // indirmesini tamamlamak için ekleme koymalıyız
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        // yazı görününe kadar bekle
//        wait.until(ExpectedConditions.textToBe(By.className("progress-label"), "Complete!"));
//
//        // yazıyı yazdırmak için önce tanımla
//        WebElement text = driver.findElement(By.className("progress-label"));
//        System.out.println(text.getText());

        //6
//        driver.get("https://www.seleniumeasy.com/test/bootstrap-download-progress-demo.html");
//        WebElement downloadBtn= driver.findElement(By.id("cricle-btn"));
//        downloadBtn.click();
//
//        //%100 olduğunu görebilmek için wait kullanırız
//        WebDriverWait wait100=new WebDriverWait(driver,30);
//        wait100.until(ExpectedConditions.textToBe(By.className("percenttext"),"100%"));
//        // yazdırabilmek için önce tanımlamalıyız
//        WebElement text100= driver.findElement(By.className("percenttext"));
//        System.out.println(text100.getText());

        //7 - eksik
//        driver.get("https://business.twitter.com/en/solutions-new.html");
//        // tittle elde etme
//        String title1 = driver.getTitle();
//        System.out.println("sayfanın title ı: " + title1);
//
//        WebElement cookiesOkBtn = driver.findElement(By.xpath("//button[text()='Accept']"));
//        cookiesOkBtn.click();
//
//        Bekle(1);
//
//        WebElement developerBlog = driver.findElement(By.cssSelector("a[title='Developer blog']"));
//        developerBlog.click();
//
//
//       /* o yüzden anlık sayfayıı değiştirmemiz gerekiyor
//        sayfalar arasıj geçiş yaparken Set<String> kullanıyoruz
//         */
//        Set<String>windowAllWindows=driver.getWindowHandles();
//
//        for (String window:windowAllWindows) {
//            driver.switchTo().window(window);
//        }
//        // yukardaki gibi iki sayfa olduğunda sayfalar arasında switchTo yapıp ondan sonra elemente bilgiyi gönderiyoruz
//
//        String title2=driver.getTitle();
//        System.out.println("2.sayfanın title ı: " + title2);
//
//        String title3 = driver.getTitle();
//        System.out.println("title3 = " + title3);
//
//        Assert.assertEquals(title1, title3);
//        Assert.assertNotEquals(title1, title2);
//        BekleVeKapat();

        //9
//        driver.get("https://www.naukri.com/");
        // animasyonlar için beklet
//        WebDriverWait wait9=new WebDriverWait(driver,30);
//        wait9.until(ExpectedConditions.visibilityOfElementLocated(By.id("block")));
//        WebElement popUp=driver.findElement(By.id("block"));
//        popUp.click();
//        WebDriverWait waitSer=new WebDriverWait(driver,30);
//        waitSer.until(ExpectedConditions.visibilityOfElementLocated(By.id("(//div[@class='mTxt'])[5]")));
//        WebElement services= driver.findElement(By.xpath("(//div[@class='mTxt'])[5]"));
//        services.click();

        //10
        driver.get("http://the-internet.herokuapp.com/windows");
        String anasayfa=driver.getWindowHandle();
        String url1=driver.getCurrentUrl();
        System.out.println("url1 = " + url1);
        Bekle(1);

        WebElement clickHere= driver.findElement(By.xpath("//a[text()='Click Here']"));
        clickHere.click();

        Set<String > windowsIdler=driver.getWindowHandles();

        for (String id:windowsIdler ) {
            driver.switchTo().window(id);
        }

        String url2= driver.getCurrentUrl();
        System.out.println("url2 = " + url2);
        driver.close();

       driver.switchTo().window(anasayfa);
       String url3= driver.getCurrentUrl();
        System.out.println("url3 = " + url3);

        Assert.assertEquals(url1,url3);
        BekleVeKapat();




    }
}




