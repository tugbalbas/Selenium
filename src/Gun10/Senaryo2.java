package Gun10;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Senaryo2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://www.saucedemo.com/"); // siteyi açtım

        WebElement usersElement = driver.findElement(By.xpath("//div[@id='login_credentials']")); // usernamleri tek tek aldık
        String strUsers = usersElement.getText(); // hepsini yazdırdık
        String[] users = strUsers.split("\n");
        System.out.println(strUsers);

        // usernameleri tek tek denicez o yüzden for ile dön
        for (int i = 1; i < users.length; i++) {
            Login.saucedemoLogin(users[i]);

            List<WebElement> btnproducts = driver.findElements(By.xpath("//span[text()='Products']"));

            if (btnproducts.size() == 1) {
                System.out.println("login oldu");
                driver.navigate().back();
            } else {
                System.out.println("Login olamadı ");
            }

//            try { // eğer 'products' varsa yakala yani login olduysa username

//                WebElement btnproducts = driver.findElement(By.xpath("//span[text()='Products']"));
//                System.out.println("login oldu");
//                driver.navigate().back();
//
//            } catch (Exception ex) {
//                System.out.println("Login olamadı " + ex.getMessage());
//            }

            Bekle(3);
        }

        BekleVeKapat();
    }

}




/*
standard_user
locked_out_user
problem_user
performance_glitch_user
 */

/*
FindElement, bulamayınca hata döndürür
FindElements, bulamayınca boş döndürür prog daha sağlıkllı olsun diye FINDELEMENTS kullanırız

 */

//        Accepted usernames are:
//        standard_user
//        locked_out_user
//        problem_user
//        performance_glitch_user
//        login oldu
//        Login olamadı
//        login oldu
//        login oldu