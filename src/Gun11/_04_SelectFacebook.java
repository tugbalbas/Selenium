package Gun11;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*

   Interviewlarda dinamik eleman nedir? ve nasıl bulunur?
   Sayfa yenilendiğinde idler veya locatorlar değişiyorsa buna dinamik eleman denir.
   Aşağıdaki fonksiyonlar ile  bulunur.
   cssSelector: ^,$,* veya XPath : starts-üwith, ends-with, contains


   Senaryo
   1- https://www.facebook.com/ sitesine giriniz.
   2- Yeni hesap oluştura tıklayınız.
   3- Formdaki tüm bilgileri giriniz.



   Bunu interviewlarda soruyorlar (starts-with) (end-with)

bu yaptığımız manuel testing
button hep değiştiği için "ile başlayan yaptık"
    btnYeniHesap       : a[id^='u_0_2'][class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']
   firstname name     : input[id^='u_2_b_WZ'][class='inputtext _58mg _5dba _2ph-']
   lastname name      : input[id^='u_2_d_Zc'][class='inputtext _58mg _5dba _2ph-']
   reg_email__ name   : input[id^='u_2_g_De'][class='inputtext _58mg _5dba _2ph-']
   reg_email_confirmation__ name
   reg_passwd__ name
   day id select      :
   month
   year
   input[name='sex'][value='1']




 */
public class _04_SelectFacebook extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.facebook.com/");
//        driver.manage().deleteAllCookies();
//
//        Bekle(2);
//        WebElement cookiesAccept= driver.findElement(By.cssSelector("button[title='Accept All']"));
//        cookiesAccept.click();

        Bekle(2);
        WebElement btnYeniHesap=driver.findElement(By.cssSelector("a[id^='u_0_2'][class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
        btnYeniHesap.click();

        WebElement firstName=driver.findElement(By.name("firstname")); // adını girdik
        firstName.sendKeys("ismet");

        Bekle(2);
        WebElement lastName=driver.findElement(By.name("lastname")); // soyadını girdik
        lastName.sendKeys("temur");

        WebElement email=driver.findElement(By.name("reg_email__")); // email girdik
        email.sendKeys("ismet@hotmail.com");
        Bekle(2);
        WebElement email2=driver.findElement(By.name("reg_email_confirmation__")); // 2.email girdik
        email2.sendKeys("ismet@hotmail.com");

        WebElement pass=driver.findElement(By.name("reg_passwd__")); // password
        pass.sendKeys("1234");
        Bekle(2);
        WebElement day=driver.findElement(By.id("day")); // day
        Select gun=new Select(day);
        gun.selectByValue("2");

        WebElement month=driver.findElement(By.id("month")); // month
        Select ay=new Select(month);
        ay.selectByValue("9");
        Bekle(2);
        WebElement year=driver.findElement(By.id("year")); // year
        Select yil=new Select(year);
        yil.selectByValue("1994");

        WebElement cinsiyet=driver.findElement(By.cssSelector("input[name='sex'][value='1']"));
        cinsiyet.click();
        Bekle(2);
        BekleVeKapat();




    }
}


