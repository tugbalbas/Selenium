package Gun10;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends BaseStaticDriver {

    public static void saucedemoLogin(String username)
    {  //XPathte yaptık login kısmını
        // Login işlemi
        WebElement usernameInput= driver.findElement(By.xpath("//input[@id='user-name']"));
        usernameInput.clear(); // login olmayınca diğer username i üzerine yazmasın diye
        // önce sil sonra gönder
        usernameInput.sendKeys(username);
        Bekle(1);
        WebElement passwordInput= driver.findElement(By.xpath("//input[@id='password']"));
        passwordInput.clear();
        passwordInput.sendKeys("secret_sauce");
        Bekle(1);
        WebElement loginButton= driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();
    }

}

